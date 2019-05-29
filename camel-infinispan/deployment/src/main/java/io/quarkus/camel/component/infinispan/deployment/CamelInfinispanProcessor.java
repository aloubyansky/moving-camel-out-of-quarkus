package io.quarkus.camel.component.infinispan.deployment;

import org.apache.camel.component.infinispan.InfinispanConfiguration;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;
import io.quarkus.deployment.builditem.substrate.ReflectiveClassBuildItem;

class CamelInfinispanProcessor {

    static final String CAMEL_INFINISPAN = "camel-infinispan";

    @BuildStep
    ReflectiveClassBuildItem reflection() {
        return new ReflectiveClassBuildItem(true, true, InfinispanConfiguration.class);
    }

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(CAMEL_INFINISPAN);
    }
}
