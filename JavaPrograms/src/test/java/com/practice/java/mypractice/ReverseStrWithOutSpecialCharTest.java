package com.practice.java.mypractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStrWithOutSpecialCharTest {
    private ReverseStrWithOutSpecialChar reverseStrWithOutSpecialChar;

    @BeforeEach
    void setUp() {
        reverseStrWithOutSpecialChar = new ReverseStrWithOutSpecialChar();
    }

    @Test
    void reverse_Method1() {
        assertEquals(reverseStrWithOutSpecialChar.reverse_Method1("abc$dfh%"), "hfd$cba%");
        assertEquals(reverseStrWithOutSpecialChar.reverse_Method1("123uyt#$@"), "123tyu#$@");
        assertEquals(reverseStrWithOutSpecialChar.reverse_Method1(""), "");
    }

    @Test
    void reverse_Method2() {
        assertEquals(reverseStrWithOutSpecialChar.reverse_Method1("abc$dfh%"), "hfd$cba%");
        assertEquals(reverseStrWithOutSpecialChar.reverse_Method1("123uyt#$@"), "123tyu#$@");
        assertEquals(reverseStrWithOutSpecialChar.reverse_Method1(""), "");
    }
}