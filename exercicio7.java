package exercicio_lista6;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 8 numeros e somaremos apenas os maiores que 50.");
        int a,b=0,l=0;
        do {a = sc.nextInt();
            l=l+1;
            b = (a>50)?b+a:b;
        }while(l<8);
        System.out.println("A soma total foi de: "+b);
        sc.close();
    }
}
