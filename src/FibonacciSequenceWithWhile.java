import java.util.Scanner;

public class FibonacciSequenceWithWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть перше число");
        int N = scanner.nextInt();
        System.out.println("Введіть останнє число");
        int M = scanner.nextInt();
        int a = 0;
        int b = 1;
        int m = 0;
        while (true) {
            m = a + b;
            if (m > M) break;
            a = b;
            b = m;
            if (m < M && m > N) // чи (m <= M && m >= N), якщо ряд Фібоначчі виводиться, включаючи початкове и кінцеве значення діапазону
                System.out.print(m + " ");
        }
    }
}
