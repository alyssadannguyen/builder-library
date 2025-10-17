package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {
    @Test
    void reverseTest() {
        assertEquals("yrarbil", Builder.reverse("library"));
    }

    @Test
    void capitalizeWordsTest() {
        assertEquals("Java Library", Builder.capitalizeWords("java library"));
    }
}

