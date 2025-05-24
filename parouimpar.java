import java.util.Scanner;
import java.util.Random;

public class parouimpar {
    public static void main(String[]srgs){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);

        System.out.println("Digite um numeo de 1 a 10: ");

        int jogador=sc.nextInt();

        System.out.println("Voce escolheu par ou impar? (P/I): ");

        String Escolha=sc.next().toUpperCase();

        int computador=random.nextInt(10)+1;
        int soma=jogador+computador;
        System.out.println("O computador escolheu: "+computador);
        System.out.println("Soma: "+soma);

        boolean par = (soma % 2) ==0;

        if ((par&& Escolha.equals("P"))||(!par && Escolha.equals("I"))){
            System.out.println("Voceu venceu!");
        } else {
            System.out.println("O computador vendeu!");
        }
        sc.close();




    }
}
