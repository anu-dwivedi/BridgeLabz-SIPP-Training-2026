import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0) {
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            int formula = number * (number + 1) / 2;

            System.out.println("For Sum = " + sum);
            System.out.println("Formula Sum = " + formula);
            System.out.println(sum == formula);
        }
    }
}