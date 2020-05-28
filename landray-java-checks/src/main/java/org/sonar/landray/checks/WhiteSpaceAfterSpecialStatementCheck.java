package org.sonar.landray.checks;

import com.google.common.collect.ImmutableList;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.java.tag.Tag;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.*;
import org.sonar.squidbridge.annotations.ActivatedByDefault;
import org.sonar.squidbridge.annotations.SqaleConstantRemediation;
import org.sonar.squidbridge.annotations.SqaleSubCharacteristic;

import java.util.List;

@Rule(
        key = "WhiteSpaceAfterSpecialStatementCheck",
        name = "a white spaces must be followed by specific keywords",
        priority = Priority.MINOR,
        tags = {Tag.BAD_PRACTICE})
@ActivatedByDefault
@SqaleSubCharacteristic(RulesDefinition.SubCharacteristics.READABILITY)
@SqaleConstantRemediation("2min")
public class WhiteSpaceAfterSpecialStatementCheck extends IssuableSubscriptionVisitor {


    @Override
    public List<Tree.Kind> nodesToVisit() {
        return ImmutableList.of(Tree.Kind.DO_STATEMENT, Tree.Kind.IF_STATEMENT, Tree.Kind.WHILE_STATEMENT, Tree.Kind.FOR_STATEMENT, Tree.Kind.SWITCH_STATEMENT);
    }

    @Override
    public void visitNode(Tree tree) {
        LiteralTree literal;
        if(tree.is(Tree.Kind.DO_STATEMENT)) {
            DoWhileStatementTree doWhileStatementTree = (DoWhileStatementTree) tree;
            int doKeyColumn = doWhileStatementTree.doKeyword().column();
            StatementTree statement = doWhileStatementTree.statement();
            if (statement.is(Tree.Kind.BLOCK)) {
                BlockTree blockTree = (BlockTree) statement;
                int openBraceColumn = blockTree.openBraceToken().column();
                if (doKeyColumn + 3 != openBraceColumn) {
                    reportIssue(tree, "do关键词之后必须有一个空格");
                }
            }
        }
        else if(tree.is(Tree.Kind.WHILE_STATEMENT)) {
            DoWhileStatementTree doWhileStatementTree = (DoWhileStatementTree) tree;
            int whileKeyColumn = doWhileStatementTree.whileKeyword().column();
            StatementTree statement = doWhileStatementTree.statement();
            if (statement.is(Tree.Kind.BLOCK)) {
                BlockTree blockTree = (BlockTree) statement;
                int openBraceColumn = blockTree.openBraceToken().column();
                if (whileKeyColumn + 6 != openBraceColumn) {
                    reportIssue(tree, "while关键词之后必须有一个空格");
                }
            }
        }
        else if(tree.is(Tree.Kind.FOR_STATEMENT)) {
            ForStatementTree forStatementTree = (ForStatementTree) tree;
            int forKeyColumn = forStatementTree.forKeyword().column();
            int column = forStatementTree.openParenToken().column();
            if (forKeyColumn + 4 != column) {
                reportIssue(tree, "for关键词之后必须有一个空格");
            }

        }
        else if(tree.is(Tree.Kind.SWITCH_STATEMENT)) {
            SwitchStatementTree switchStatementTree = (SwitchStatementTree) tree;
            int switchKeyColumn = switchStatementTree.switchKeyword().column();
            int column = switchStatementTree.openParenToken().column();
            if (switchKeyColumn + 7 != column) {
                reportIssue(tree, "switch关键词之后必须有一个空格");
            }

        }
        else if(tree.is(Tree.Kind.IF_STATEMENT)) {
            IfStatementTree ifStatementTree = (IfStatementTree) tree;
            SyntaxToken ifKeyword = ifStatementTree.ifKeyword();
            SyntaxToken openParenToken = ifStatementTree.openParenToken();
            if (ifKeyword.line() != openParenToken.line() || ifKeyword.column() + 3 != openParenToken.column()) {
                reportIssue(tree, "if关键词之后必须有一个空格");
            }
            SyntaxToken elseKeyword = ifStatementTree.elseKeyword();
            if (elseKeyword != null) {
                StatementTree elseStatementTree = ifStatementTree.elseStatement();
                if (elseStatementTree.is(Tree.Kind.BLOCK)) {
                    BlockTree blockTree = (BlockTree) elseStatementTree;
                    int openBraceColumn = blockTree.openBraceToken().column();
                    if (elseKeyword.column() + 5 != openBraceColumn) {
                        reportIssue(elseStatementTree, "else关键词之后必须有一个空格");
                    }
                }
            }

        }
    }
}
