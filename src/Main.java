import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добрый вечер, дорогой!");
        System.out.print("Введи свою фамилию: ");
        String lastName = scanner.nextLine();
        System.out.print("Введи свое  отчество: ");
        String patronymic = scanner.nextLine();
        System.out.print("Введи свое имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Введи свой возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Ты несовершеннолетний братишка(");
            return;
        }
        System.out.print("Введи сввою дату рождения (дд.ММ.гггг): ");
        String birthDateStr = scanner.next();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date birthDate = dateFormat.parse(birthDateStr);
            System.out.println("Твоя дата рождения: " + birthDate);
        } catch (java.text.ParseException e) {
            System.out.println("Ошибка ввода даты!");
            return;
        }
        System.out.println("Еще раз приветик" + lastName + " " + firstName + " " + patronymic + "!");
        System.out.println("Начинаем поиск Периметра, Площади и Радиус Круга!");
        System.out.print("Введи длину стороны квадрата: ");
        double sideLength = scanner.nextDouble();

        double perimeter = 4 * sideLength;
        double area = sideLength * sideLength;
        double radius = sideLength / 2;

        System.out.println("Периметр квадрата: " + perimeter);
        System.out.println("Площадь квадрата: " + area);
        System.out.println("Радиус квадрата: " + radius);
    }
}