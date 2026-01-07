# Student Analyzer

## Mô tả bài toán
Chương trình cung cấp lớp `StudentAnalyzer` để:
- `countExcellentStudents(List<Double>)`: Đếm số học sinh đạt loại Giỏi (điểm hợp lệ trong khoảng 0–10 và >= 8.0). Bỏ qua `null`, điểm âm, hoặc > 10. Danh sách rỗng/null trả về 0.
- `calculateValidAverage(List<Double>)`: Tính điểm trung bình trên các điểm hợp lệ (0–10). Bỏ qua `null`, điểm ngoài khoảng. Nếu danh sách null/rỗng hoặc không có điểm hợp lệ, trả về 0.0.

## Cấu trúc dự án
- Mã nguồn: `src/main/java/com/example/StudentAnalyzer.java`
- Kiểm thử: `src/test/java/com/example/StudentAnalyzerTest.java`
- Quản lý build: Maven (`pom.xml`)

## Yêu cầu môi trường
- JDK 11+ (đặt `JAVA_HOME` tương ứng)
- Maven 3.8+ trong PATH

## Cách build và chạy test
Từ thư mục gốc của dự án `student-analyzer`:
```bash
mvn clean test
```
Kết quả mong đợi: build thành công và tất cả test JUnit pass.

## Cách sử dụng lớp
Ví dụ tối giản (trong test đã minh họa chi tiết):
```java
StudentAnalyzer analyzer = new StudentAnalyzer();
List<Double> scores = List.of(9.0, 8.0, 7.0, -1.0, 11.0, null);
int excellent = analyzer.countExcellentStudents(scores);   // 2
double avg = analyzer.calculateValidAverage(scores);       // 8.0
```

## Test đã bao phủ
- `countExcellentStudents`: trường hợp hỗn hợp, danh sách rỗng, toàn điểm không hợp lệ.
- `calculateValidAverage`: hỗn hợp valid/invalid, danh sách rỗng, toàn invalid, biên 0.0 và 10.0.

## Ghi chú
Hiện dự án không có hàm `main`. Sử dụng qua unit test hoặc nhúng lớp `StudentAnalyzer` vào ứng dụng khác. Nếu cần CLI/demo, có thể bổ sung một lớp `Main` để đọc danh sách điểm và in kết quả.
