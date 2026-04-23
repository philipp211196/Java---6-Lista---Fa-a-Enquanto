package exercicio_lista6;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas notas abaixo.");
        int a;
        String b;
        do {a=sc.nextInt();
            b=(a>=0 & a<=10)?"Nota aprovada, prossiga.":"Nota invalida.";
            System.out.println(b);
        }while(a>=0 & a<=10);
        sc.close();
    }
}
