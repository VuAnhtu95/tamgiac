import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void checkTrianglecase1() {
        double canhA = 2;
        double canhB = 2;
        double canhC = 2;
        String result = TriangleClassifier.checkTriangle(canhA,canhB,canhC);
        String expected = "Tam Giác Đều";
        assertEquals(expected, result);
    }
    @Test
    void checkTrianglecase2() {
        double canhA = 2;
        double canhB = 2;
        double canhC = 3;
        String result = TriangleClassifier.checkTriangle(canhA,canhB,canhC);
        String expected = "Tam Giác Cân";
        assertEquals(expected, result);
    }
    @Test
    void checkTrianglecase3() {
        double canhA = 3;
        double canhB = 4;
        double canhC = 5;
        String result = TriangleClassifier.checkTriangle(canhA,canhB,canhC);
        String expected = "Tam Giác Thường";
        assertEquals(expected, result);
    }
    @Test
    void checkTrianglecase4() {
        double canhA = 8;
        double canhB = 2;
        double canhC = 3;
        String result = TriangleClassifier.checkTriangle(canhA,canhB,canhC);
        String expected = "Không phải tam giác";
        assertEquals(expected, result);
    }
    @Test
    void checkTrianglecase5() {
        double canhA = -1;
        double canhB = 2;
        double canhC = 1;
        String result = TriangleClassifier.checkTriangle(canhA,canhB,canhC);
        String expected = "Không phải tam giác";
        assertEquals(expected, result);
    }
    @Test
    void checkTrianglecase6() {
        double canhA = 0;
        double canhB = 1;
        double canhC = 1;
        String result = TriangleClassifier.checkTriangle(canhA,canhB,canhC);
        String expected = "Không phải tam giác";
        assertEquals(expected, result);
    }
}