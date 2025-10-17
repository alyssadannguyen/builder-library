package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BuilderTest {

    @Test
    void capitalizeWordsTest() {
        assertEquals("JAVA LIBRARY", Builder.capitalizeWords("java library"));
        assertEquals("LIBRARY", Builder.capitalizeWords("library"));
        assertEquals("", Builder.capitalizeWords(""));
        assertNull(Builder.capitalizeWords(null));
    }

    @Test
    void countWordsTest() {
        assertEquals(2, Builder.countWords("java library"));
        assertEquals(1, Builder.countWords("library"));
        assertEquals(0, Builder.countWords(""));
        assertEquals(0, Builder.countWords(null));
    }

        @Test
        void repeatTest() {
            assertEquals("library library library", Builder.repeat("library", 3));
            assertEquals("hello hello", Builder.repeat("hello", 2));
            assertEquals("", Builder.repeat("word", 0));          // zero times
            assertEquals("", Builder.repeat(null, 5));           // null input
            assertEquals("", Builder.repeat("test", -2));        // negative times
        }
    }

