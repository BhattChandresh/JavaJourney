package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReversePrefixOfWordTest {

    ReversePrefixOfWord reversePrefixOfWord;

    @BeforeEach
    public void init() {
        reversePrefixOfWord = new ReversePrefixOfWord();
    }

    @Test
    void testReversePrefix() {
        assertEquals("dcbaefd", reversePrefixOfWord.reversePrefix("abcdefd", 'd'));
        assertEquals("zxyxxe", reversePrefixOfWord.reversePrefix("xyxzxe", 'z'));
        assertEquals("abcd", reversePrefixOfWord.reversePrefix("abcd", 'z'));
        assertNull(reversePrefixOfWord.reversePrefix("", 'z'));
        assertEquals("rdnahcesh", reversePrefixOfWord.reversePrefix("chandresh", 'r'));
    }

    @Test
    void testReversePrefixTwoPointer() {
        assertEquals("dcbaefd", reversePrefixOfWord.reversePrefixTwoPointer("abcdefd", 'd'));
        assertEquals("zxyxxe", reversePrefixOfWord.reversePrefixTwoPointer("xyxzxe", 'z'));
        assertEquals("abcd", reversePrefixOfWord.reversePrefixTwoPointer("abcd", 'z'));
        assertNull(reversePrefixOfWord.reversePrefixTwoPointer("", 'z'));
        assertEquals("rdnahcesh", reversePrefixOfWord.reversePrefixTwoPointer("chandresh", 'r'));
    }
}