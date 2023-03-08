import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ex3_MaiorEMedia {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        
        do {
        System.out.println("Número: ");
        numero = scan.nextInt();
        soma += numero;

        if(numero > maior) maior = numero;
        
        count++;

        } while(count < 5);

        System.out.println("O Maior Número é: " + maior);
        System.out.println("A média entre os números digitados é: " + (soma/5));
    }

    
}
