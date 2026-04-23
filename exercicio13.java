package exercicio_lista6;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double a,b=0,c=0;
       double d;
        System.out.println("Digite numeros e informaremos a soma total, a media e quantos numeros foram digitados.");
        do { a= sc.nextDouble();
            b=b+a;
            c++;
        }while (a != 0) ;
        d=b/c;
        System.out.println(" A soma total dos numeros."+b);
        System.out.println("A media dos numeros e "+d);
        System.out.println("A quantidade de numeros digitados foi de "+c);
        sc.close();
    }
}
