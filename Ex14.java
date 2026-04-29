package Lista8_For;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int soma = 0;

    for (int i = 1; i <= 6; i++) {
        System.out.print("Digite o " + i + "º número: ");
        int numero = scan.nextInt();

        if (numero > 0) {
            soma += numero;
        }
    }

    System.out.println("A soma dos positivos é: " + soma);

    scan.close();
}
}

