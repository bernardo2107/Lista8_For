package Lista8_For;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scan.nextInt();

            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O menor número é: " + menor);

        scan.close();
    }
}

