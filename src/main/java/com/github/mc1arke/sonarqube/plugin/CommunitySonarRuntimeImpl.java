package com.github.mc1arke.sonarqube.plugin;

import org.sonar.api.SonarEdition;
import org.sonar.api.SonarProduct;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.SonarRuntime;
import org.sonar.api.utils.Version;

public class CommunitySonarRuntimeImpl implements SonarRuntime {

    private final SonarEdition edition;

    public CommunitySonarRuntimeImpl(SonarEdition edition) {
        this.edition = edition;
    }

    @Override
    public Version getApiVersion() {
        return null;
    }

    @Override
    public SonarProduct getProduct() {
        return null;
    }

    @Override
    public SonarQubeSide getSonarQubeSide() {
        return null;
    }

    @Override
    public SonarEdition getEdition() {
        return edition;
    }
}
