package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void valid () {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 9801);
        int expected = 90;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void invalid () {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int actual = service.calculate(89, 10000);
        int expected = 90;
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMax() {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int actual = service.calculate(0, 0);
        int expected = 0;
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minMax1() {
        SQRService service = new SQRService();
        // подготавливаем данные:
        int actual = service.calculate(121, 9604);
        int expected = 88;
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
