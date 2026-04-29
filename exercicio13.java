package exercicio_lista9;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b;
        System.out.println("Digite 10 numeros e separaremos os pares.");
        for (int i = 0; i <= 10; i++) {
            b = sc.nextInt();
            a = (b % 2 == 0) ? a + 1 : a;
        }
        System.out.println("A quantidade de numeros pares foram de: " + a);
        sc.close();
    }
}
