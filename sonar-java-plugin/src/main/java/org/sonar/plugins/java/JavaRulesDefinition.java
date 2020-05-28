/*
 * SonarQube Java
 * Copyright (C) 2012-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.java;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.java.checks.CheckList;
import org.sonar.landray.checks.LandrayCheckList;
import org.sonar.squidbridge.annotations.AnnotationBasedRulesDefinition;

import static org.sonar.java.checks.CheckList.REPOSITORY_KEY;

/**
 * Replacement for org.sonar.plugins.squid.SquidRuleRepository
 */
public class JavaRulesDefinition implements RulesDefinition {

  @Override
  public void define(Context context) {
    NewRepository repository = context
      .createRepository(REPOSITORY_KEY, Java.KEY)
      .setName("SonarQube");

    AnnotationBasedRulesDefinition.load(repository, Java.KEY, CheckList.getChecks());
    for (NewRule rule : repository.rules()) {
      //FIXME: set internal key to key to ensure rule templates works properly : should be removed when SONAR-6162 is fixed.
      rule.setInternalKey(rule.key());
    }
    repository.done();
    defineLandray(context);
  }

  /**
   * 加载蓝凌扩展的规则
   *
   * @param context
   */
  private void defineLandray(Context context) {
    NewRepository landrayRepo = context.createRepository(LandrayCheckList.REPOSITORY_KEY, Java.KEY);
    landrayRepo.setName(LandrayCheckList.REPOSITORY_KEY);

    AnnotationBasedRulesDefinition.load(landrayRepo, Java.KEY, LandrayCheckList.getChecks());
    for (NewRule rule : landrayRepo.rules()) {
      //FIXME: set internal key to key to ensure rule templates works properly : should be removed when SONAR-6162 is fixed.
      rule.setInternalKey(rule.key());
    }
    landrayRepo.done();
  }
}
