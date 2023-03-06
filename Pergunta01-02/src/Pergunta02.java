import java.util.Scanner;

public class Pergunta02 {

    public static void main(String[] args) {

        int a = 0, b = 1, x = 0, n;   

        Scanner numero = new Scanner (System.in);

        System.out.println("Informe um número: ");
        n = numero.nextInt();

        System.out.print("0 ");
        System.out.print("1 ");

        while (n > x) {
            x = a+b;
            a = b;
            b = x;

            System.out.print(x + " ");
        }
        
        if (n == 0) {
            System.out.print ("\nO número faz parte da sequência de Fibonacci.");
        } else if (n == x) {
            System.out.print ("\nO número faz parte da sequência de Fibonacci.");
        } else
            System.out.print("\nO número digitado não faz parte da sequência de Fibonacci.");
        
    }

 }