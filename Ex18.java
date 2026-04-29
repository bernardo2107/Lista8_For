package Lista8_For;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        boolean primo = true;

        if (n < 2) {
            primo = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println(n + " é primo.");
        } else {
            System.out.println(n + " não é primo.");
        }

        scan.close();
    }
}

