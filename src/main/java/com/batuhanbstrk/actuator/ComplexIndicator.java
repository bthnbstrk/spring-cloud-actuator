package com.batuhanbstrk.actuator;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ComplexIndicator implements HealthIndicator {
    @Override
    public Health health() {
        Map<String, String> operations = new HashMap<>();
        operations.put("actions", "Test3");
        operations.put("reactions", "Test4");

        Map<String, String> records = new HashMap<>();
        records.put("entities", "Test5");
        records.put("objects", "Test6");

        return new Health.Builder()
                .up().withDetail("operations", operations)
                .down().withDetail("records", records)
                .build();
    }
}
