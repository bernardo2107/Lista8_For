package exercicio_lista9;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as 10 notas dos alunos para verificr se estão aprovados.");
        int a, b = 0, c = 0;
        for (int i = 0; i <= 10; i++) {
            a = sc.nextInt();
            b = (a < 7) ? b + 1 : b;
            c = (a >= 7) ? c + 1 : c;
        }
        System.out.println("A quantidade de aprovados foram: " + c);
        System.out.println("A quantidade de reprovados foram: " + b);
        sc.close();
    }
}
