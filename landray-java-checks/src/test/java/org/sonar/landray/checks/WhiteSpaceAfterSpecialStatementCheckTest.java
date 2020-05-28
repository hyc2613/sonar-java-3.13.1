package org.sonar.landray.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class WhiteSpaceAfterSpecialStatementCheckTest {

    @Test
    public void test() {
        JavaCheckVerifier.verify("src/test/files/checks/WhiteSpaceAfterSpecialStatementCheck.java", new WhiteSpaceAfterSpecialStatementCheck());
    }
}
