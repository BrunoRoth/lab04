
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = dado.nextLine();
        System.out.println("");

        System.out.print("Insira seu peso em quilos (Ex. 80,5): ");
        double peso = dado.nextDouble();
        System.out.println("");

        System.out.print("Insira sua altura em metros (Ex. 1,80): ");
        double altura = dado.nextDouble();
        System.out.println("");

        System.out.print("Insira seu sexo selecionando entre 'm' = masculino e 'f'= feminino: ");
        char sexo = dado.next().charAt(0);
        System.out.println("");

        Pessoa p1 = new Pessoa(altura, peso, nome, sexo);
        p1.Calcular();
    }

}
