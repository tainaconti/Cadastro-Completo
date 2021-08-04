import java.util.Scanner;

public class EnderecoMentorama {

    public static void main(String[]arg) {
            System.out.println("-------------------CADASTRO DE USUÁRIOS-------------------");

            Scanner scanner = new Scanner(System.in);


            // Solicitar o nome completo do usuário
            System.out.println("Digite seu nome completo:  ");
            String nome = scanner.nextLine();

            // Solicitar a rua
            System.out.println("Insira a rua: ");
            String rua = scanner.nextLine();


            // Solicitar o número
            System.out.println("Digite o número da residência: ");
            String numero = scanner.nextLine();
    

            // Solicitar o bairro
            System.out.println("Digite o bairro: ");
            String bairro = scanner.nextLine();
    
            // Solicitar a cidade
            System.out.println("Digite a cidade: ");
            String cidade = scanner.nextLine();
            
            // Solicitar o estado
            System.out.println("Digite o estado: ");
            String estado = scanner.nextLine();

            // Solicitar o CEP
            System.out.println("Digite o CEP: ");
            String cep = scanner.nextLine();

            // Exibir as informações formatadas.
            System.out.println("Nome completo: " + nome);
            System.out.println("Endereço: " + rua + " , " + numero + " - " + bairro + " , " + cidade + " - " + estado );
            System.out.println("CEP:" + cep);


    }
}