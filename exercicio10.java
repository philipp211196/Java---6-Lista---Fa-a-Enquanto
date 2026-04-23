package exercicio_lista6;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=0,c=0;
        System.out.println("Digite numeros para saber a soma dos pares e impares");
        do {a = sc.nextInt();
            b = (a % 2 ==0 )? b+a:b;
            c=(a%2!=0)?c+a:c;




        }while (a != 0) ;
        System.out.println("seu numero par e "+b+" Seu numero impar e "+c);
        sc.close();

    }
}
