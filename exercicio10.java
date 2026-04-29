package exercicio_lista9;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 numeros para conseguir a média.");
        double a, b = 0;
        int i;
        for (i = 0; i < 5; i++) {
            a = sc.nextInt();
            b = b + a;
        }
        b = b / i;
        System.out.println("A média de seus numeros é: " + b);
        sc.close();
    }
}
