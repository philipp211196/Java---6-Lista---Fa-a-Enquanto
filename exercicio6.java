package exercicio_lista6;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        System.out.println("Digite numeros para ver o maior, digite 0 para parar.");
        do {
            a = sc.nextInt();
            if (a > maior && a!=0 ) {
                maior = a;

            }
            if (a < menor && a!=0 ) {
                menor = a;
            }
        }while (a != 0) ;
            System.out.println("seu maior numero e " + maior + " e seu menor numero e " + menor);
            sc.close();
        }
    }


