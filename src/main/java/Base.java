import java.util.Scanner;
/**
 * Created on 04.08.18
 * @author Margarita S.
 * @see <a href="https://ru.onlinemschool.com/math/library/fraction/calc/">Сложение дробей/a>
 */
public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //Ввод первого числа
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();

        //Ввод второго числа
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();

        //Вывод на консоль суммы чисел
        System.out.println("Сумма введенных чисел: ");
        double sum = x + y;
        System.out.printf("%.4f", sum);

        scanner.close();
    }
}
