package exercicio_lista9;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber o fatorial.");
        int a = sc.nextInt();
        long f = 1;
        for (int i = 1; i <= a; i++) {
            f *= i;
        }
        System.out.println("Fatorial de " + a + " é " + f);
        sc.close();
    }
}
