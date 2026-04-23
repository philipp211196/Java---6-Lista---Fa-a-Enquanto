package exercicio_lista6;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numeros e voce tera a media dos numeros maior que 100");
        System.out.println("Digite 0 para parar.");
        double a, b = 0, c = 0;

        do {
            a = sc.nextDouble();
            b = (a > 100) ? b + 1 : b;
            c = (a > 100) ? a+c : c;
        } while (a != 0);
        b = c/b;
        System.out.println("A media dos numeros maior que 100 e " + b);
        sc.close();
    }
}

