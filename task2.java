import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class task2 {
    static double circleCenterX = 0;
    static double circleCenterY = 0;
    static double circleRadius = 0;
    static double pointX = 0;
    static double pointY = 0;

    public static void main(String[] args) {
        // Считаем данные из файла
        readDataFromFile(args[0]);

        // Рассчитаем расстояние между центром окружности и точкой
        double distance = Math.sqrt(Math.pow(pointX - circleCenterX, 2) + Math.pow(pointY - circleCenterY, 2));

        // Сравним расстояние с радиусом окружности
        if (distance < circleRadius) {
            System.out.println("Точка находится внутри окружности");
        } else if (distance == circleRadius) {
            System.out.println("Точка находится на окружности");
        } else {
            System.out.println("Точка находится вне окружности");
        }
    }

    static void readDataFromFile(String fileName) {
        try {
            File inputFile = new File(fileName);
            Scanner scanner = new Scanner(inputFile);

            // Считываем координаты центра окружности и ее радиус
            circleCenterX = scanner.nextDouble();
            circleCenterY = scanner.nextDouble();
            circleRadius = scanner.nextDouble();

            // Считываем координаты точки
            pointX = scanner.nextDouble();
            pointY = scanner.nextDouble();

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
