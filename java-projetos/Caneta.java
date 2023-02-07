import java.util.Scanner;

public class teste {

    public static void main (String [] args) {

        Scanner ler = new Scanner (System.in);
        int cont, valor, salto;
        cont = 0;

        System.out.println("Quer contar até quanto? ");
        valor = ler.nextInt();
        System.out.println("Qual o valor do salto? ");
        salto = ler.nextInt();

        while (cont <= valor) {
            System.out.println(cont);
            cont = cont + salto;
        }
        System.out.println("Terminei de contar");
    }
}