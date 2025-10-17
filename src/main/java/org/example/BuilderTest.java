package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    void capitalizeWordsTest() {
        assertEquals("LIBRARY", Builder.capitalizeWords("library"));
        assertEquals("", Builder.capitalizeWords(""));
        assertNull(Builder.capitalizeWords(null));
    }

    @Test
    void countWordsTest() {
        assertEquals(4, Builder.countWords("java libraries for development"));
        assertEquals(0, Builder.countWords(""));
        assertEquals(0, Builder.countWords(null));
    }

    @Test void repeatTest() {
        assertEquals("Welcome to my library! Welcome to my library! Welcome to my library!", Builder.repeat("Welcome to my library!", 3));
        assertEquals("", Builder.repeat("sentence", 0));
        assertEquals("", Builder.repeat(null, 5));
        assertEquals("", Builder.repeat("test", -2));
    }
}


