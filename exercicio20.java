package exercicio_lista6;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, c, d = 0,b;
        System.out.println("Digite seu nome.");
        String nome;
        nome = sc.nextLine();
        System.out.println(nome + " digite o valor da compra, digite 0 apos digitar os valores.");
        do {
            a = sc.nextDouble();
            d = d + a;


        } while (a != 0);
        c = (d >= 500) ? d * 0.10 : d;
        b = d - c;
        System.out.printf("%s o valor da compra sem desconto é R$: %.2f%n valor da compra com desconto aplicado e de R$: %.2f%n",nome,d,b);
        sc.close();
    }

}
