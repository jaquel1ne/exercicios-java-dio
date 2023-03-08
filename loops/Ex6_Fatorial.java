import java.util.Scanner;

public class Ex6_Fatorial {
    
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial de qual número? ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print("Fatorial de " + fatorial + "! = ");
        for(int i = fatorial; i >=1; i--) {
            multiplicacao = multiplicacao * i;

        }

        System.out.println(multiplicacao);
    }
}
