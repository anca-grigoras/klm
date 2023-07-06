package com.afkl.travel.exercise.actuator;

import com.afkl.travel.exercise.scope.ApplicationScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.boot.actuate.endpoint.web.annotation.EndpointWebExtension;
import org.springframework.boot.actuate.metrics.MetricsEndpoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Component
@EndpointWebExtension(endpoint = MetricsEndpoint.class)
public class InfoWebEndpointExtension {

    private MetricsEndpoint delegate;

   @Autowired
   private ApplicationScoped applicationScoped;
    // standard constructor

    @ReadOperation
    public WebEndpointResponse<Map> metrics() {

        List<String> appMetrics= Arrays.asList( String.valueOf(applicationScoped.getCount()));
        MetricsEndpoint.MetricResponse metric = this.delegate.metric("appMetrics",appMetrics);
        return new WebEndpointResponse(metric, 200);
    }

    private Integer getStatus(Map<String, Object> info) {
        // return 5xx if this is a snapshot
        return 200;
    }
}