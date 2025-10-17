package org.example;

public final class Builder {
    private Builder() {
    }

    public static String reverse(String var0) {
        return var0 == null ? "" : (new StringBuilder(var0)).reverse().toString();
    }

    public static String capitalizeWords(String var0) {
        if (var0 != null && !var0.isBlank()) {
            String[] var1 = var0.split("\\s+");
            StringBuilder var2 = new StringBuilder();

            for(String var6 : var1) {
                if (!var6.isEmpty()) {
                    var2.append(Character.toUpperCase(var6.charAt(0)))
                            .append(var6.substring(1).toLowerCase())
                            .append(' ');
                }
            }

            return var2.toString().trim();
        } else {
            return var0;
        }
    }

    // ADD THIS MAIN METHOD FOR RUNNABLE JAR
    public static void main(String[] args) {
        System.out.println("Reverse 'library': " + reverse("library"));
        System.out.println("Capitalize 'java library': " + capitalizeWords("java library"));
    }
}
