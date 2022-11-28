package ru.netology;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        service.CalcSquare(min, max);

    }
}