package exercicio_lista6;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b=0,l=0;

        System.out.println("Digite numeros e faremos a media deles");
        System.out.println("Digite um numero negativo para parar.");

        do {
            l=l+1;
            a = sc.nextDouble();
           b=(a>0)?b+a:b;


        }while(a>0);
        l=b/l;
        System.out.println("A media total dos numeros foi  de : "+l);
        sc.close();
    }
}

