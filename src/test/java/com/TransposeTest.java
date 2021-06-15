package com;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransposeTest {

    @Test
    void transpose_returns_text_of_testFile() throws FileNotFoundException {
        //    GIVEN
        Transpose transpose = new Transpose("testFile.txt");
//        When path of test file is txt I can add the path and log the text.
        //    WHEN
        String result = transpose.getText();
        //    THEN
        assertEquals("Hello, world!", result);
    }
}
