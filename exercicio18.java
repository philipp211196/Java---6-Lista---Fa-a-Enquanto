package exercicio_lista6;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite numeros e veremos quantos estão entre 50 e 20.");
        System.out.println("Digite 0 para parar.");
        int a,b=0;
        int loop = 0;
        do {a=sc.nextInt();
            b = (a>50 | a<20)?b+1:b;
            loop++;

        }while(loop<10);
        System.out.println("A quantidade de numeros acima de 50 e abaixo de 20 são: "+b);
        sc.close();
    }
}
