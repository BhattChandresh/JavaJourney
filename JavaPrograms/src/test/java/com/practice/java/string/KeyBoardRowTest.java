package com.practice.java.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeyBoardRowTest {
    private KeyBoardRow keyBoardRow;
    private List<String> list;

    @BeforeEach
    public void init() {
        keyBoardRow = new KeyBoardRow();
        list = new ArrayList<>();
    }

    @Test
    void testMatchInOneRow() {
        list.add("half");
        list.add("kgf");
        assertEquals(list, keyBoardRow.matchInOneRow(new String[]{"half", "kgf", "chandresh"}));
        list.clear();

        list.add("adsdf");
        list.add("sfd");
        assertEquals(list, keyBoardRow.matchInOneRow(new String[]{"adsdf", "sfd"}));
        list.clear();

        assertEquals(list, keyBoardRow.matchInOneRow(new String[]{"omk"}));

        list.add("Alaska");
        list.add("Dad");
        assertEquals(list, keyBoardRow.matchInOneRow(new String[]{"Hello", "Alaska", "Dad", "Peace"}));
        list.clear();

    }
}