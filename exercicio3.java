package exercicio_lista6;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=0;
        System.out.println("Digite numeros e faremos a soma apenas daqueles que são multiplos de 3.");
        System.out.println("Digite 0 para parar.");
        do {
            a = sc.nextInt();
            b = (a%3==0)?a+b:b;

        }while(a!=0);
        System.out.println("A soma total dos multiplos de 3 foi de: "+b);
        sc.close();
    }
}
