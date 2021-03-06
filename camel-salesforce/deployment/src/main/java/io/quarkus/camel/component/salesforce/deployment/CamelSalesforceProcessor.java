package io.quarkus.camel.component.salesforce.deployment;

import org.apache.camel.component.salesforce.SalesforceEndpointConfig;
import org.apache.camel.component.salesforce.SalesforceLoginConfig;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.substrate.ReflectiveClassBuildItem;

class CamelSalesforceProcessor {

    static final String CAMEL_SALESFORCE = "camel-salesforce";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(CAMEL_SALESFORCE);
    }

    @BuildStep
    ReflectiveClassBuildItem registerForReflection() {
        return new ReflectiveClassBuildItem(true, false,
                SalesforceLoginConfig.class,
                SalesforceEndpointConfig.class);
    }
}
