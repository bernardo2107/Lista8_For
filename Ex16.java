package Lista8_For;

public class Ex16 {
    public static void main(String[] args) {

    int a = 0, b = 1;

    System.out.println("Sequência de Fibonacci:");

    for (int i = 1; i <= 10; i++) {
        System.out.println(i + "º: " + a);

        int proximo = a + b;
        a = b;
        b = proximo;
    }
}
}

