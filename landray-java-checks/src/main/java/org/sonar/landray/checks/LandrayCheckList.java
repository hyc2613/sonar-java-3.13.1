package org.sonar.landray.checks;

import com.google.common.collect.ImmutableList;
import org.sonar.plugins.java.api.JavaCheck;

import java.util.List;

public final class LandrayCheckList {

    public static final String REPOSITORY_KEY = "landray";

    private LandrayCheckList() {
    }

    public static List<Class> getChecks() {
        return ImmutableList.<Class>builder().addAll(getJavaChecks()).build();
    }

    public static List<Class<? extends JavaCheck>> getJavaChecks() {
        return ImmutableList.<Class<? extends JavaCheck>>builder()
                .add(WhiteSpaceAfterSpecialStatementCheck.class)
                .build();
    }
}
