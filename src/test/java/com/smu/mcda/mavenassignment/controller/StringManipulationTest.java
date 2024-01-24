package com.smu.mcda.mavenassignment.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulationTest {
    @Test
    public void testCaptializeString() {
        String input = "hello";
        String expectedOutput = "HELLO";

        StringManipulation controller = new StringManipulation();
        String capitalizedInput = controller.captializeString(input);

        assertEquals(expectedOutput, capitalizedInput);
    }

    @Test
    public void testGenerateMD5Hash() {
        String input = "HELLO";
        String expectedOutput = "74240b12b08b2e76da33d1b8574b5012";

        StringManipulation controller = new StringManipulation();
        String md5Hash = controller.generateMD5Hash(input);

        assertEquals(expectedOutput, md5Hash);
    }

    @Test
    public void testProcessString() {
        String input = "hello";
        String expectedOutput = "74240b12b08b2e76da33d1b8574b5012";

        StringManipulation controller = new StringManipulation();
        String result = controller.processString(input);

        assertEquals(expectedOutput, result);
    }
}
