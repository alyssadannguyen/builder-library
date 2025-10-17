package org.example;

public final class Builder {
    private Builder() {}

    public static String capitalizeWords(String input) {
        if (input == null || input.isBlank()) return input;

        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(word.toUpperCase()).append(' ');
            }
        }

        return sb.toString().trim();
    }

    public static int countWords(String input) {
        if (input == null || input.isBlank()) return 0;
        return input.trim().split("\\s+").length;
    }

    public static String repeat(String word, int times) {
        if (word == null || times <= 0) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(word);
            if (i < times - 1) sb.append(' ');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Capitalized: " + Builder.capitalizeWords("library"));
        System.out.println("Word count: " + Builder.countWords("java libraries for development"));
        System.out.println("Repeat sentence: " + Builder.repeat("Welcome to my library!", 3));
    }
}
