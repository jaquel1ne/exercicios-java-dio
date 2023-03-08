import java.util.Scanner;

public class Ex2_Nota {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota(Entre 0 e 10): ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente(Entre 0 e 10): ");
            nota = scan.nextInt();
        }
        
    }
}
