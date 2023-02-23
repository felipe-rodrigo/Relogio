import java.util.Scanner;

public class ex000 {
 public static void main(String[] args) {

  Scanner x = new Scanner(System.in);

  System.out.print("Digite um número: ");
  int n = x.nextInt();
  System.out.print("Digite outro número: ");
  int m = x.nextInt();

  int a = n + m;

  System.out.println("A soma entre " + n + " e " + m + " é: " + a);
  
 }  
}
