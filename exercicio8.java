package exercicio_lista9;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para saber a tabuada dele");
        int a = 0, n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            a = n * i;
            System.out.println(n + "*" + i + "=" + a);
            sc.close();
        }
    }
}
