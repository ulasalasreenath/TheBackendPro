import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SpecificOrderTest {

    @Test
    @Order(1)
    public void test1() {
        int a = 1;
        int b = 2;
        int c = a + b;
        Assertions.assertTrue(c == 3);
    }

    @Test
    @Order(3)
    public void test2() {
        int a = 2;
        int b = 1;
        int c = a - b;
        Assertions.assertTrue(c == 1);
    }

    @Test
    @Order(2)
    public void test3() {
        int a = 2;
        int b = 1;
        int c = a * b;
        Assertions.assertTrue(c == 2);
    }
}
