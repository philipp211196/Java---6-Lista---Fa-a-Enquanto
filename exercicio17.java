package exercicio_lista6;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=0,c=0;
        System.out.println("Digite numeros para saber a soma dos numeros pares.");
        do {a = sc.nextInt();
            b = (a % 2 ==0 )? b+a:b;

        }while (a != 0) ;
        System.out.println("A soma de todos os pares são de: "+b);
        sc.close();
    }
}
