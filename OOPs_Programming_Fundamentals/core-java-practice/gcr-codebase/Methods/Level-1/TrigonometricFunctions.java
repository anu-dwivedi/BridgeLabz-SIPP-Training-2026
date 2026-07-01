import java.util.Scanner;

public class TrigonometricFunctions {
    static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);

        return new double[]{
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angle = sc.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + values[0]);
        System.out.println("Cos = " + values[1]);
        System.out.println("Tan = " + values[2]);
    }
}