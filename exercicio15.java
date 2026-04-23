package exercicio_lista6;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        String c,d;
        System.out.println("Digite seu nome para continuar.");
        c= sc.nextLine();
        System.out.println("Seja bem vindo "+c+" Agora digite sua senha de 4 digitos ");
        do {a= sc.nextInt();
            d=(a != 1234  )? "Senha invalida, digite novamente "+c:"Seja bem vindo "+c;
            System.out.println(d);
        }while ( a!=1234);
        sc.close();
    }
}
