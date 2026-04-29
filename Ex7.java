package Lista8_For;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();
        int soma = 0;
        for (int i=1; i <= n; i++){
            soma += i;
        }
        System.out.println("A soma de 1 até "+n+" é: " +soma);
    }
}
