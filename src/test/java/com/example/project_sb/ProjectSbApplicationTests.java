package com.example.project_sb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProjectSbApplicationTests {

    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(ProjectSbApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Context Loads Test Started");
        assertTrue(true, "Context loads successfully");
        logger.info("Context Loads Test Finished");
    }

    @Test
    void testAddition() {
        logger.info("Test Addition Started");
        int result = 2 + 3;
        logger.debug("2 + 3 = {}", result);
        assertEquals(5, result, "Addition test failed");
        logger.info("Test Addition Finished");
    }

    @Test
    void testStringEquality() {
        logger.info("Test String Equality Started");
        String expected = "Hello, World!";
        String actual = "Hello, World!";
        logger.debug("Expected: {}, Actual: {}", expected, actual);
        assertEquals(expected, actual, "String equality test failed");
        logger.info("Test String Equality Finished");
    }

    @Test
    void testListSize() {
        logger.info("Test List Size Started");
        List<String> list = List.of("Apple", "Banana", "Orange");
        logger.debug("List: {}", list);
        assertEquals(3, list.size(), "List size test failed");
        logger.info("Test List Size Finished");
    }
}
