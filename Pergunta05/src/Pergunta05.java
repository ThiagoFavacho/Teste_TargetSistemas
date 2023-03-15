import java.util.Scanner;

public class Pergunta05 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite algo a ser invertido:");
        String palavra = scan.next();
        String result = "";

        for(int i = palavra.length() - 1; i>= 0; i--){
            result = result + palavra.charAt(i);
        }

        System.out.println("\nResultado: \n" + result);
    }
}