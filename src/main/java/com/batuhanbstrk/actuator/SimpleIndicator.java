package com.batuhanbstrk.actuator;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SimpleIndicator implements HealthIndicator {
    @Override
    public Health health() {
        Map<String, String> aspects = new HashMap<>();
        aspects.put("integrity", "Test");
        aspects.put("robustness", "Test2");
        return new Health.Builder().up().withDetail("aspects", aspects).build();
    }
}
