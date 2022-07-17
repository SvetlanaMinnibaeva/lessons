package lesson4Mos;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Saper {
    public static void main(String[] args) {
        System.out.println("Выберете уровень игры");
        System.out.println("1 - Новичок");
        System.out.println("2 - Любитель");
        System.out.println("3 - Профессионал");
        System.out.println("4 - Особый");

        Scanner scanner = new Scanner(System.in);
        String level = scanner.nextLine();
        int[][] fields = null;
        if (level.equals("1") || level.equalsIgnoreCase("новичок")) {
            fields = new int[9][9];
            for (int mine = 0; mine < 10; mine++) {
                SaperUtils.addMine(fields, 9, 9);
            }
        }

        if (level.equals("2") || level.equalsIgnoreCase("любитель")) {
            fields = new int[16][16];
            for (int mine = 0; mine < 40; mine++) {
                SaperUtils.addMine(fields, 16, 16);
            }
        }

        if (level.equals("3") || level.equalsIgnoreCase("профессионал")) {
            fields = new int[16][30];
            for (int mine = 0; mine < 99; mine++) {
                SaperUtils.addMine(fields, 16, 30);
            }
        }

        if (level.equals("4") || level.equalsIgnoreCase("особый")) {
            System.out.println("Ширина поля");
            int columnsCount = scanner.nextInt();
            System.out.println("Высота поля");
            int rowsCount = scanner.nextInt();
            System.out.println("Количество мин");
            int minesCount = scanner.nextInt();
            fields = new int[rowsCount][columnsCount];
            for (int mine = 0; mine < minesCount; mine++) {
                SaperUtils.addMine(fields, rowsCount, columnsCount);
            }
        }

        for (int i = 0; i < (fields != null ? fields.length : 0); i++) {
            for (int j = 0; j < fields[i].length; j++) {
                if (fields[i][j] == -1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
        
