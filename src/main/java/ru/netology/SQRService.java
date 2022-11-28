package ru.netology;

public class SQRService {

    public int CalcSquare(int min, int max) {

        for (int x = 1; x < max; x++) {
            int y = x * x;

            if (y >= min && y <= max) {

                System.out.println(x);
            }
        }
        return 0;
    }
}
