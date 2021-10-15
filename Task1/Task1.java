import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Посчитать количество нулей на конце числа, являющегося результатом вычисления факториала.");
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        BigInteger factorial = factorial(n);
        String temp = String.valueOf(factorial);
        System.out.println(zeros(temp));
    }

    public static BigInteger factorial(int n){
        BigInteger x = BigInteger.ONE;
        BigInteger temp = BigInteger.ONE;
        int i=1;
        while (i<=n)
        {
            temp = temp.multiply(x);
            x = x.add(BigInteger.ONE);
            i++;
        }
        return temp;
    }

    public static int zeros(String number) {
        int i = number.length() - 1;
        int count = 0;
        while (number.charAt(i) == '0') {
            count++;
            i--;
        }
        return count;
    }
}