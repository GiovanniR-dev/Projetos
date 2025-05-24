import java.util.Scanner;
import java.util.Random;


public class testes {
    public static void main(String[] args){
        Random random= new Random();
        Scanner sc= new Scanner(System.in);

        int numeroSecreto =random.nextInt(100)+1;
        int tentativa;
        int tentativas=0;

        System.out.println("Adivinhe o numero de 1 a 100: ");

        do {
            System.out.println("Seu palpite: ");
            tentativa=sc.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto){
                System.out.println("Muito baixo!!");
            } else if (tentativa  >numeroSecreto) {
                System.out.println("Muito alto!!");
            } else {
                System.out.println("Correto voce acertou em"+tentativas+" tentativas");
            }
            } while (tentativa != numeroSecreto);

        sc.close();
    }
}
