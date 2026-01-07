package com.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class StudentAnalyzerTest {
    @Test
    void countExcellentStudents_basicCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.5, 8.0, 7.9, 8.1, -1.0, 11.0, null);
        int result = analyzer.countExcellentStudents(scores);
        assertEquals(3, result);
    }

    @Test
    void countExcellentStudents_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList();
        int result = analyzer.countExcellentStudents(scores);
        assertEquals(0, result);
    }

    @Test
    void countExcellentStudents_invalidOnly() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(-5.0, 12.0, null);
        int result = analyzer.countExcellentStudents(scores);
        assertEquals(0, result);
    }
}
