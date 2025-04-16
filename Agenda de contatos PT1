import java.util.ArrayList;
import java.util.Scanner;


public class Agenta  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contatos> contatos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== MENU DA AGENDA ===");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();

                    System.out.println("Telefone:");
                    String telefone = scanner.nextLine();

                    System.out.println("email:");
                    String email = scanner.nextLine();

                    Contatos novoContato = new Contatos(nome, telefone, email);
                    contatos.add(novoContato);
                    System.out.println("Contato adicionado com sucesso!");

                    break;


                case 2:
                    if (contatos.isEmpty()){
                        System.out.println("Nenhum Contato encontrado");
                    } else {
                        for (int i=0;i < contatos.size(); i++){
                            System.out.println("\nContato"+(i+1)+":");
                            contatos.get(i).exibirContato();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo da agenda...");
                    break;

                default:
                    System.out.println("Opcao invalida. tente novamente");
                    break;
            }
        } while (opcao !=3);
        scanner.close();

    }
}
