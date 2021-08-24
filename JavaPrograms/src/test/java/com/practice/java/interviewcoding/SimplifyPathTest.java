package com.practice.java.interviewcoding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimplifyPathTest {
    private SimplifyPath simplifyPath;

    @BeforeEach
    public void init() {
        simplifyPath = new SimplifyPath();
    }

    @Test
    void testGetCanonicalPath() {
        assertEquals("/home", simplifyPath.getCanonicalPath("/home/"));
        assertEquals("/c", simplifyPath.getCanonicalPath("/a/./b/../../c/"));
        assertEquals("/", simplifyPath.getCanonicalPath("/a/.."));
        assertEquals("/a", simplifyPath.getCanonicalPath("/../../../../../a"));
        assertEquals("/a/b/c/d", simplifyPath.getCanonicalPath("/a/./b/./c/d/"));
        assertEquals("/", simplifyPath.getCanonicalPath("/a/../.././../../."));
        assertEquals("/a/b/c/d", simplifyPath.getCanonicalPath("/a//b//c//////d"));
        assertEquals("/", simplifyPath.getCanonicalPath("/../"));
        assertEquals("/home/foo", simplifyPath.getCanonicalPath("/home//foo/"));
        assertEquals("/a/b/mydir", simplifyPath.getCanonicalPath("/a/b/c/.././././d/../mydir"));
    }
}