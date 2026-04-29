package exercicio_lista9;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b;
        System.out.println("Digite 8 numeros e separaremos quais são maiores que 50.");
        for (int i = 0; i <= 8;i++) {
            b=sc.nextInt();
            a=(b>50)?a+1:a;
        }
        System.out.println("A quantidade de numeros maiores que 50 foram de: "+a);
        sc.close();
    }
}
