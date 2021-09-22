package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefangIpAddressTest {

    private DefangIpAddress defangIpAddress;

    @BeforeEach
    public void init() {
        defangIpAddress = new DefangIpAddress();
    }

    @Test
    void testGetDefangIpAddress() {
        assertEquals("1[.]1[.]1[.]1", defangIpAddress.getDefangIpAddress("1.1.1.1"));
        assertEquals("255[.]100[.]50[.]0", defangIpAddress.getDefangIpAddress("255.100.50.0"));
        assertEquals("", defangIpAddress.getDefangIpAddress(""));
        assertEquals("", defangIpAddress.getDefangIpAddress("250.250.250.155."));
    }
}