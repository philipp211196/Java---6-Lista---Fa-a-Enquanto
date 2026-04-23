package exercicio_lista6;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,v;
        System.out.println("Digite numeros para ver o dobro, digite 0 para parar.");
        do {a= sc.nextInt();
           if (a>0){
               v=a*2;
               System.out.println(v);
           }else{
               System.out.println("Finalizando...");
           }
        }while(a>0);
        sc.close();

    }

}
