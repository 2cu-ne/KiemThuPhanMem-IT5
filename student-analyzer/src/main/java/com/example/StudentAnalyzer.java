package com.example;

import java.util.List;

public class StudentAnalyzer {
    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (Double s : scores) {
            if (s == null) {
                continue; // Bỏ qua giá trị null
            }
            double score = s.doubleValue();
            if (score < 0.0 || score > 10.0) {
                continue; // Bỏ qua điểm không hợp lệ
            }
            if (score >= 8.0) {
                count++;
            }
        }
        return count;
    }

}
