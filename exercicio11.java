package exercicio_lista6;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inicial e somaremos 5% ate 1000.");
        System.out.println("Mostraremos a quantidade de repetições.");
        double a = sc.nextDouble();
        double b;
        int l=0;
        do {l=l+1;
            b=a*0.05;
            a=b+a;
        }while(a<1000);
        System.out.println("Repetições necessarias: "+l);
        sc.close();
    }
}
