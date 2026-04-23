package exercicio_lista6;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero maior que 1.");
        System.out.println("Falaremos em quantas repetições são precisas para este numero retornar ao 1.");
        int a,b=0;
        a = sc.nextInt();
        do {
            b++;
            a= a/2;
        }while(a!=1);
        System.out.println("O total de repetições foi de: "+b);
        sc.close();
    }
}
