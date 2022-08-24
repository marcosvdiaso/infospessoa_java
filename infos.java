import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        // variáveis
        String nome;
        int idade;
        char sexo;
        String prof;
        float salario;

        // criação do scanner
        Scanner reader = new Scanner(System.in);

        // nome
        System.out.print("Olá! Digite o seu nome: ");
        reader = new Scanner(System.in); // reinicialização do scanner 
        nome = reader.nextLine();

        // idade
        System.out.print ("Digite sua idade: ");
        reader = new Scanner(System.in); // reinicialização do scanner
        idade = reader.nextInt();

        // sexo
        System.out.print("Digite seu sexo (Feminino ou Masculino): ");
        reader = new Scanner(System.in); // reinicialização do scanner
        sexo = reader.next().charAt(0);

        // profissão
        System.out.print("Digite sua profissão: ");
        reader = new Scanner(System.in); // reinicialização do scanner
        prof = reader.nextLine();

        // salário  
        System.out.print("Digite seu salário: ");
        reader = new Scanner(System.in); // reinicialização do scanner
        salario = reader.nextFloat();

        // mostrando os dados
        System.out.println("\nNome:" +nome+"");
        System.out.println("Idade:" +idade+" anos");
        System.out.println("Sexo:" +sexo+"");
        System.out.println("Profissão:" +prof+"");
        System.out.println("Salário: R$" +salario+"");
    }
}