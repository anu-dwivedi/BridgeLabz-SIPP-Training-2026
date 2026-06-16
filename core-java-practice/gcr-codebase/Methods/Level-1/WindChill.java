import java.util.Scanner;

public class WindChill {
    static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature)
                - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double t = sc.nextDouble();
        double v = sc.nextDouble();

        System.out.println("Wind Chill = " + calculateWindChill(t,v));
    }
}