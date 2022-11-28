package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {


    @Test
    void CalcSquareTest() {
        SQRService service = new SQRService();

        int min = 10;
        int max = 99;
        int expected = 0;

        int actual = service.CalcSquare(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void CalcSquareTestMax() {
        SQRService service = new SQRService();

        int min = 0;
        int max = 10000;
        int expected = 0;

        int actual = service.CalcSquare(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void CalcSquareTestMin() {
        SQRService service = new SQRService();

        int min = 0;
        int max = 2;
        int expected = 0;

        int actual = service.CalcSquare(min, max);
        assertEquals(expected, actual);
    }

    @Test
    void CalcSquareTestSquare() {
        SQRService service = new SQRService();

        int min = 900;
        int max = 900;
        int expected = 0;

        int actual = service.CalcSquare(min, max);
        assertEquals(expected, actual);
    }

}
