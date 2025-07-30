package Class;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public record Conversion(@SerializedName("conversion_rates") Map<String,Double> valores) {}
