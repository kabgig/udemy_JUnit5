package com.in28minutes.jUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MyAssertTest {
    List<String> todos = Arrays.asList("Aws", "Azure", "DevOps");

    @Test
    void test() {
        boolean test = todos.contains("Aws");
        assertTrue(test, "something went wrong");
    }
}