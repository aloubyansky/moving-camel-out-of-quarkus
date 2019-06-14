package io.quarkus.camel.component.jdbc.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class CamelJdbcProcessor {

    private static final String CAMEL_JDBC = "camel-jdbc";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(CAMEL_JDBC);
    }

}
