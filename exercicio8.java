package exercicio_lista6;

import java.util.Scanner;

public class exercicio8 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    int cont=0;
    System.out.println("Digite numeros e faremos o total apenas daqueles que são multiplos de 5.");
    System.out.println("Digite 0 para parar.");
    do {
        a = sc.nextInt();
        if (a>0) {
        cont = (a % 5 == 0) ? cont + 1 : cont;
    }
    }while(a!=0);
    System.out.println("o total dos multiplos de 5 foi de: "+cont);
    sc.close();
}

}
