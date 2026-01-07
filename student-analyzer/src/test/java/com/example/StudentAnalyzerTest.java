package com.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void calculateValidAverage_basicCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.0, 7.0, -1.0, 11.0, null);
        double avg = analyzer.calculateValidAverage(scores);
        assertEquals(8.0, avg, 1e-9);
    }

    @Test
    void calculateValidAverage_emptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList();
        double avg = analyzer.calculateValidAverage(scores);
        assertEquals(0.0, avg, 1e-9);
    }

    @Test
    void calculateValidAverage_invalidOnly() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(-3.0, 12.5, null);
        double avg = analyzer.calculateValidAverage(scores);
        assertEquals(0.0, avg, 1e-9);
    }

    @Test
    void calculateValidAverage_boundariesIncluded() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(0.0, 10.0, 5.0);
        double avg = analyzer.calculateValidAverage(scores);
        assertEquals(5.0, avg, 1e-9);
    }
}
