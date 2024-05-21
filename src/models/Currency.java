package models;

import java.util.Map;

public record Currency(Map<String, String> conversion_rates) {
}
