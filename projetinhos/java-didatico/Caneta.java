import java.util.Scanner;


public class Caneta {

    public static void main (String [] args) {

        // Scanner ler = new Scanner (System.in);
        // int cont, valor, salto;
        // cont = 0;

        // System.out.println("Quer contar até quanto? ");
        // valor = ler.nextInt();
        // System.out.println("Qual o valor do salto? ");
        // salto = ler.nextInt();

        // while (cont <= valor) {
        //     System.out.println(cont);
        //     cont = cont + salto;
        // }
        // System.out.println("Terminei de contar");

        Scanner s = new Scanner(System.in);

        Double a, b, c, x1, x2, delta;

        System.out.println("Digite o valor do coeficiente a: ");
        a = s.nextDouble();
        System.out.println("Digite o valor do coeficiente b: ");
        b = s.nextDouble();
        System.out.println("Digite o valor do coeficiente c: ");
        c = s.nextDouble();

        System.out.println("Os valores dos coeficientes são:");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        delta  = Math.pow(b, 2.0) - 4.0 * a * c;

        if (delta < 0) {
            System.out.println("Não é possível calcular");
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("O valor da raíz 1 é " + x1);
            System.out.println("O valor da raíz 2 é " + x2);
        }


        s.close();
    }
}