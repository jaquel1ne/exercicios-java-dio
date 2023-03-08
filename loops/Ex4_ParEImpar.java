import java.util.Scanner;

public class Ex4_ParEImpar {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de Números: ");
        quantNumeros = scan.nextInt();
        
                
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

        if (numero % 2 == 0) quantPares++;
        else quantImpares++;
        
        } while(count < quantNumeros);

        System.out.println("Quantidade de Números Pares: " + quantPares);
        System.out.println("Quantidade de Números Ímpares: " + quantImpares);

    }
}
