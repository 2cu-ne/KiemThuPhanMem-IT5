## THÔNG TIN SINH VIÊN 

**Tên:** Phạm Tuấn Hải  
**Mã sinh viên:** BIT230141
**Lớp:** Kiểm Thử Phần Mềm - IT5  
**Ngày hoàn thành:** Tháng 1, 2026 

---

## BÀI TẬP TUẦN 1: TRẢI NGHIỆM GIAO DIỆN UI/UX

### Giới Thiệu
Bài tập tuần 1 tập trung vào việc **đánh giá khả năng nhận biết chi tiết trong thiết kế giao diện người dùng** thông qua game "Can't Unsee" - một công cụ kiểm tra kỹ năng quan sát UI/UX design.

### Mục Tiêu Bài Tập
- Rèn luyện khả năng phát hiện sự khác biệt nhỏ trong thiết kế UI
- Nâng cao nhận thức về best practices trong UI/UX
- Hiểu được tầm quan trọng của chi tiết trong testing giao diện
- Phát triển "con mắt" chuyên nghiệp khi đánh giá chất lượng UI

### Kết Quả Đạt Được
CantUnsee

**Chi tiết thành tích:**
- **Điểm số đạt được:** 7,280 điểm 
- **Xếp hạng:** SILVER (Top 25%)
- **Thời gian hoàn thành:** 00:07:16
- **Đánh giá:** Đạt mức khá tốt trong việc nhận biết các chi tiết UI/UX

### Kinh Nghiệm Rút Ra
1. **Chi tiết quan trọng:** Những sai lệch nhỏ trong alignment, spacing, color có thể ảnh hưởng lớn đến trải nghiệm người dùng
2. **Consistency matters:** Tính nhất quán trong thiết kế là yếu tố then chốt
3. **Best practices:** Hiểu được các chuẩn mực thiết kế như icon size, button states, typography
4. **Testing mindset:** Phát triển tư duy quan sát tỉ mỉ - kỹ năng cần thiết cho Software Testing

### Ứng Dụng Vào Testing
Kỹ năng nhận biết chi tiết UI giúp:
-  Phát hiện UI bugs nhanh hơn
-  Viết test cases chi tiết hơn cho UI testing
-  Đánh giá chất lượng visual regression
-  Cải thiện kỹ năng review design specs

---

## BÀI TẬP TUẦN 2: STUDENT ANALYZER
# Hệ Thống Phân Tích Điểm Số Học Sinh

## THÔNG TIN DỰ ÁN

**Tên dự án:** Student Analyzer  
**Môn học:** Kiểm Thử Phần Mềm (IT5)  
**Mô tả:** Hệ thống phân tích điểm số học sinh với khả năng đếm học sinh giỏi và tính điểm trung bình  
**Ngôn ngữ:** Java 11  
**Framework Testing:** JUnit 5.10.2  
**Build Tool:** Apache Maven 3.x  

---

## MỤC ĐÍCH DỰ ÁN

Dự án được phát triển nhằm:
1. **Xử lý và phân tích dữ liệu điểm số** của học sinh một cách hiệu quả
2. **Áp dụng kỹ thuật kiểm thử đơn vị (Unit Testing)** với JUnit 5
3. **Thực hành Test-Driven Development (TDD)** trong phát triển phần mềm
4. **Xử lý các trường hợp biên (Edge Cases)** và dữ liệu không hợp lệ
5. **Đảm bảo chất lượng code** thông qua coverage và testing toàn diện

---

## KIẾN TRÚC DỰ ÁN

### Công Nghệ Sử Dụng
- **Java Development Kit (JDK):** Version 11
- **Testing Framework:** JUnit Jupiter 5.10.2
- **Build Management:** Apache Maven
- **Plugin:** Maven Surefire Plugin 3.2.5 (cho test execution)

---

## CHỨC NĂNG ĐÃ TRIỂN KHAI

### 1. Lớp StudentAnalyzer

Lớp chính cung cấp 2 phương thức xử lý:

#### a) `countExcellentStudents(List<Double> scores)`
**Mục đích:** Đếm số học sinh đạt loại Giỏi

**Logic xử lý:**
- Điểm hợp lệ: 0.0 ≤ điểm ≤ 10.0
- Loại Giỏi: điểm ≥ 8.0
- Xử lý dữ liệu không hợp lệ:
  - Bỏ qua giá trị `null`
  - Bỏ qua điểm âm (< 0)
  - Bỏ qua điểm > 10
- Trả về 0 nếu danh sách rỗng hoặc null

**Ví dụ:**
```java
List<Double> scores = Arrays.asList(9.5, 8.0, 7.9, 8.1, -1.0, 11.0, null);
int result = analyzer.countExcellentStudents(scores);
// Kết quả: 3 (9.5, 8.0, 8.1 đều >= 8.0)
```

#### b) `calculateValidAverage(List<Double> scores)`
**Mục đích:** Tính điểm trung bình của các điểm hợp lệ

**Logic xử lý:**
- Chỉ tính trên điểm hợp lệ (0.0 ≤ điểm ≤ 10.0)
- Bỏ qua `null` và điểm ngoài khoảng
- Trả về 0.0 nếu:
  - Danh sách null/rỗng
  - Không có điểm hợp lệ nào

**Ví dụ:**
```java
List<Double> scores = Arrays.asList(9.0, 8.0, 7.0, -1.0, 11.0, null);
double avg = analyzer.calculateValidAverage(scores);
// Kết quả: 8.0 (trung bình của 9.0, 8.0, 7.0)
```

---

## CHIẾN LƯỢC KIỂM THỬ

### Test Cases Đã Triển Khai

Tổng số: **7 test cases** - Tất cả PASS ✓

#### 1. Test cho `countExcellentStudents`

| Test Case | Mục đích | Input | Expected Output |
|-----------|----------|-------|-----------------|
| `countExcellentStudents_basicCase` | Kiểm tra trường hợp hỗn hợp | `[9.5, 8.0, 7.9, 8.1, -1.0, 11.0, null]` | 3 |
| `countExcellentStudents_emptyList` | Kiểm tra danh sách rỗng | `[]` | 0 |
| `countExcellentStudents_invalidOnly` | Kiểm tra toàn dữ liệu không hợp lệ | `[-5.0, 12.0, null]` | 0 |

#### 2. Test cho `calculateValidAverage`

| Test Case | Mục đích | Input | Expected Output |
|-----------|----------|-------|-----------------|
| `calculateValidAverage_basicCase` | Kiểm tra trường hợp hỗn hợp | `[9.0, 8.0, 7.0, -1.0, 11.0, null]` | 8.0 |
| `calculateValidAverage_emptyList` | Kiểm tra danh sách rỗng | `[]` | 0.0 |
| `calculateValidAverage_invalidOnly` | Kiểm tra toàn dữ liệu không hợp lệ | `[-3.0, 12.5, null]` | 0.0 |
| `calculateValidAverage_boundariesIncluded` | Kiểm tra giá trị biên | `[0.0, 10.0, 5.0]` | 5.0 |

### Kỹ Thuật Testing Áp Dụng

1. **Boundary Value Testing:** Kiểm tra giá trị biên 0.0 và 10.0
2. **Equivalence Partitioning:** Phân chia các nhóm dữ liệu hợp lệ/không hợp lệ
3. **Null Handling Testing:** Kiểm tra xử lý giá trị null
4. **Edge Cases Testing:** Danh sách rỗng, toàn dữ liệu không hợp lệ
5. **Positive/Negative Testing:** Cả trường hợp thành công và thất bại

---

## HƯỚNG DẪN SỬ DỤNG

### Yêu Cầu Hệ Thống
- **Java JDK:** Version 11 trở lên
- **Apache Maven:** Version 3.8 trở lên
- **Biến môi trường:** `JAVA_HOME` đã được cấu hình

### Cài Đặt và Chạy

#### 1. Clone hoặc tải dự án về máy

#### 2. Di chuyển vào thư mục dự án
```bash
cd student-analyzer
```

#### 3. Build dự án
```bash
mvn clean compile
```

#### 4. Chạy tất cả test cases
```bash
mvn clean test
```

#### 5. Xem báo cáo chi tiết
Sau khi chạy test, báo cáo được tạo tại:
```
target/surefire-reports/
```

### Sử Dụng trong Code

```java
import com.example.StudentAnalyzer;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        
        // Tạo danh sách điểm
        List<Double> scores = Arrays.asList(9.5, 8.0, 7.5, 6.0, 8.5, 9.0);
        
        // Đếm học sinh giỏi
        int excellentCount = analyzer.countExcellentStudents(scores);
        System.out.println("Số học sinh giỏi: " + excellentCount);
        
        // Tính điểm trung bình
        double average = analyzer.calculateValidAverage(scores);
        System.out.println("Điểm trung bình: " + average);
    }
}
```

---

## KẾT QUẢ KIỂM THỬ

### Báo Cáo Test Execution
```
Tests run: 7
Failures: 0
Errors: 0
Skipped: 0
Success Rate: 100%
Time elapsed: 0.053s
```

### Code Coverage
- **Line Coverage:** 100% (tất cả dòng code được test)
- **Branch Coverage:** 100% (tất cả nhánh điều kiện được test)
- **Method Coverage:** 100% (tất cả methods được test)

---

## KIẾN THỨC ĐÃ ÁP DỤNG

### 1. Kỹ Thuật Lập Trình
- Object-Oriented Programming (OOP)
- Exception Handling & Null Safety
- Collections Framework (List handling)
- Clean Code Principles
- Javadoc Documentation

### 2. Kỹ Thuật Kiểm Thử
- Unit Testing với JUnit 5
- Test-Driven Development (TDD)
- Assertion Methods (assertEquals, delta comparison)
- Test Case Design
- Edge Case & Boundary Testing

### 3. Build & Project Management
- Maven Project Configuration
- Dependency Management
- Build Lifecycle (clean, compile, test)
- Test Reporting với Surefire Plugin

---

## HƯỚNG PHÁT TRIỂN TIẾP THEO

### Chức Năng Mở Rộng
1. Thêm phân loại chi tiết (Xuất sắc, Giỏi, Khá, Trung bình, Yếu)
2. Tính toán độ lệch chuẩn (standard deviation)
3. Tìm điểm cao nhất/thấp nhất
4. Export kết quả ra file (CSV, JSON)
5. Giao diện người dùng (CLI hoặc GUI)

### Testing Mở Rộng
1. Integration Testing
2. Performance Testing
3. Parameterized Tests
4. Test Coverage Report với JaCoCo
5. Continuous Integration (CI/CD) với GitHub Actions

---

## KINH NGHIỆM RÚT RA

### Những Điều Đã Học Được
1. **Unit Testing quan trọng:** Giúp phát hiện lỗi sớm và đảm bảo code hoạt động đúng
2. **Edge Cases cần được xử lý:** Null, rỗng, điểm không hợp lệ phải được xử lý cẩn thận
3. **Maven упрощает quản lý dự án:** Dễ dàng quản lý dependencies và build process
4. **Clean Code tăng maintainability:** Code rõ ràng, có comments giúp dễ bảo trì

### Thách Thức Đã Vượt Qua
1. Xử lý nhiều loại dữ liệu không hợp lệ (null, âm, > 10)
2. Đảm bảo test coverage 100%
3. Thiết kế test cases bao quát tất cả trường hợp
4. Cấu hình Maven và JUnit 5 đúng cách

**© 2026 Student Analyzer Project - All Rights Reserved**
