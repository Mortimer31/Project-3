import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

        double greatest = 0;
        double average = 0;
        double smallest = 0;
        //todo дописать логику программы ниже.
        if (first > second && first > third) {
            greatest = first;
        }
        if (second > first && second > third) {
            greatest = second;
        }
        if (third > first && third > second) {
            greatest = third;
        }
        if (first < second && first < third) {
            smallest = first;
        }
        if (second < first && second < third) {
            smallest = second;
        }
        if (third < first && third < second) {
            smallest = third;
        }
        if (first != greatest && first != smallest) {
            average = first;
        }
        if (second != greatest && second != smallest) {
            average = second;
        }
        if (third != greatest && third != smallest) {
            average = third;
        }

        //todo

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);
    }
}




