package io.quarkus.camel.component.netty4http.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class CamelNetty4HTTPProcessor {

    static final String CAMEL_NETTY4_HTTP = "camel-netty4-http";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(CAMEL_NETTY4_HTTP);
    }
}
