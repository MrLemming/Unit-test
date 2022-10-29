package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тестирование: SalesManager")
class SalesManagerTest {

    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(new long[]{12, 50, 48, 34, 41});
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @BeforeAll
    static void setUpApp() {
        System.out.println("Запускаюсь до выполнения всех тестов...");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("апускаюсь после выполнения всех тестов...");
    }

    @Test
    @DisplayName("Тест метода max()")
    void testMax() {
        assertEquals(50, salesManager.max());
    }

    @Test
    @DisplayName("Тест метода min()")
    void testMin() {
        assertEquals(12, salesManager.min());
    }

    @Test
    @DisplayName("Тест метода stat()")
    void testStat() {
        assertEquals(41, salesManager.stat());
    }

    @Test
    @DisplayName("Тест равенства массивов")
    void testArrayEquals() {
        long[] a = {12, 50, 48, 34, 41};
        long[] b = {12, 50, 48, 34, 41};
        Assertions.assertArrayEquals(a, b);
    }
}