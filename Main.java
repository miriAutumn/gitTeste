
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Qual o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("E como gostaria de calcular? (A/S/M/D): ");
        char math = scanner.next().charAt(0);

        double result = Calcular.calculos(num1, num2, math);
        if(result == -1) {
            System.out.println("ERROR");
        } else {
            System.out.println(num1+" "+Calcular.mathSymbol(math)+" "+num2+" = "+result);
        }

        scanner.close();

    }
}