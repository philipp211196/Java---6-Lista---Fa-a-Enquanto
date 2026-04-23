package exercicio_lista6;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para ser o teto.");
        int i = sc.nextInt();
        int b = 0;
        System.out.println("Agora digite numeros para fazer a soma ate o numero teto.");
        do {

            int a = sc.nextInt();
            b = b+a;

        }while(i>b);
        System.out.println("A soma total foi de: "+b);
        sc.close();

    }
}
