import java.util.Scanner;

public class NaturalSumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            int sum = 0;
            int i = 1;

            while (i <= number) {
                sum += i;
                i++;
            }

            int formula = number * (number + 1) / 2;

            System.out.println("While Sum = " + sum);
            System.out.println("Formula Sum = " + formula);
            System.out.println(sum == formula);
        }
    }
}