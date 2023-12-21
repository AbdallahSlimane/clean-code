package com.example.cleancodeproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class YamsGame {
    public static void main(String[] args) {
        SpringApplication.run(YamsGame.class, args);
    }

    public static int score(int[] des) {
        Arrays.sort(des);

        if (isYams(des)) return 50;
        if (isCarre(des)) return 35;
        if (isFull(des)) return 30;
        if (isBrelan(des)) return 28;
        return sommeDes(des);
    }

    private static boolean isBrelan(int[] des) {
        return des[0] == des[2] || des[1] == des[3] || des[2] == des[4];
    }

    private static boolean isCarre(int[] des) {
        return des[0] == des[3] || des[1] == des[4];
    }

    private static boolean isYams(int[] des) {
        return des[0] == des[4];
    }

    private static boolean isFull(int[] des) {
        return des[0] == des[1] && des[2] == des[4] || des[0] == des[2] && des[3] == des[4];
    }

    private static int sommeDes(int[] des) {
        return Arrays.stream(des).sum();
    }
}
