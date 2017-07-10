package com.iqmsoft.boot.camel.groovy.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class SampleCamelRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:hello?period={{timer.period}}")
        .to("log:output?showHeaders=true");
    }

}
