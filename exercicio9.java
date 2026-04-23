package exercicio_lista6;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numeros e veremos quantos estão entre 20 e 80.");
        System.out.println("Digite 0 para parar.");
        int a,b=0;
        do {a=sc.nextInt();
            b = (a>20 & a<80)?b+1:b;

        }while(a!=0);
        System.out.println("A quantidade de numeros entre 20 e 80 são: "+b);
        sc.close();
    }
}
