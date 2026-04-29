package Lista8_For;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = scan.nextInt();
        for (int i = 0; i<=n; i++){
            System.out.println("Valor de i: "+i);
        }
    }
}
