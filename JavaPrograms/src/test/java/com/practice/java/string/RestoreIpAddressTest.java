package com.practice.java.string;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RestoreIpAddressTest {

    private RestoreIpAddress restoreIpAddress;

    @BeforeEach
    public void init() {
        restoreIpAddress = new RestoreIpAddress();
    }

    @Test
    void testGetAllPossibleValidIpAddress() {
        List<String> validIpAddress = new ArrayList<>();
        validIpAddress.add("255.255.11.135");
        validIpAddress.add("255.255.111.35");
        assertEquals(validIpAddress, restoreIpAddress.getAllPossibleValidIpAddress("25525511135"));

        validIpAddress.clear();
        validIpAddress.add("0.0.0.0");
        assertEquals(validIpAddress, restoreIpAddress.getAllPossibleValidIpAddress("0000"));

        validIpAddress.clear();
        validIpAddress.add("1.1.1.1");
        assertEquals(validIpAddress, restoreIpAddress.getAllPossibleValidIpAddress("1111"));

        validIpAddress.clear();
        validIpAddress.add("0.10.0.10");
        validIpAddress.add("0.100.1.0");
        assertEquals(validIpAddress, restoreIpAddress.getAllPossibleValidIpAddress("010010"));

        validIpAddress.clear();
        validIpAddress.add("1.0.10.23");
        validIpAddress.add("1.0.102.3");
        validIpAddress.add("10.1.0.23");
        validIpAddress.add("10.10.2.3");
        validIpAddress.add("101.0.2.3");
        assertEquals(validIpAddress, restoreIpAddress.getAllPossibleValidIpAddress("101023"));

        validIpAddress.clear();
        validIpAddress.add("1.2.3.45");
        validIpAddress.add("1.2.34.5");
        validIpAddress.add("1.23.4.5");
        validIpAddress.add("12.3.4.5");
        assertEquals(validIpAddress, restoreIpAddress.getAllPossibleValidIpAddress("12345"));

        validIpAddress.clear();
        assertNull(restoreIpAddress.getAllPossibleValidIpAddress("123"));
        assertNull(restoreIpAddress.getAllPossibleValidIpAddress("1231231231234"));
        assertNull(restoreIpAddress.getAllPossibleValidIpAddress(""));
    }
}