package exercicio_lista6;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numeros e veremos quantos estão entre 10 e 50.");
        System.out.println("Digite 0 para parar.");
        int a,b=0;
        do {a=sc.nextInt();
            b = (a>10 & a<50)?b+1:b;

        }while(a!=0);
        System.out.println("A quantidade de numeros entre 10 e 50 são: "+b);
        sc.close();
    }
}
