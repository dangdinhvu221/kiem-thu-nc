package com.example;

public class thuethuncn {
    public long thue(long thue) {
        long result = 0;
        if (thue <= 5000000) {
            result = (long) (thue * 0.05);
        } else if (thue <= 10000000) {
            result = (long) (thue * 0.1 + 250000);
        } else if (thue <= 18000000) {
            result = (long) (thue * 0.15 + 750000);
        } else if (thue <= 32000000) {
            result = (long) (thue * 0.2 + 1950000);
        } else if (thue <= 52000000) {
            result = (long) (thue * 0.25 + 4750000);
        } else if (thue <= 80000000) {
            result = (long) (thue * 0.3 + 9750000);
        } else {
            result = (long) (thue * 0.35 + 18150000);
        }
        return result;
    }
}
