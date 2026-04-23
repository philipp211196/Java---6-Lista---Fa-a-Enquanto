package exercicio_lista6;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero, para parar digite 0 .");
        int a;
        int b = 0;
        do {
            a = sc.nextInt();
           b = (a>10)? b+1:b;



        }while (a!=0);
        System.out.println("Obteve um total de "+b+" numeros maiores que 10.");
        sc.close();


        }
}
