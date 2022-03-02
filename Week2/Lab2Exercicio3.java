/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab2Exercicio3 {
    public static void main(String[ ] args ){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        System.out.println("Digite o nome do funcionário 1:");
        funcionario1.setNome(input.nextLine());
        System.out.println("Digite o sobrenome do funcionário 1:");
        funcionario1.setSobrenome(input.nextLine());
        System.out.println("Digite o salário mensal do funcionário 1: ");
        funcionario1.setSalariomensal(Float.parseFloat(input.nextLine()));

        System.out.println("Digite o nome do funcionário 2:");
        funcionario2.setNome(input.nextLine());
        System.out.println("Digite o sobrenome do funcionário 2:");
        funcionario2.setSobrenome(input.nextLine());
        System.out.println("Digite o salário mensal do funcionário 2: ");
        funcionario2.setSalariomensal(Float.parseFloat(input.nextLine()));

        System.out.println("Funcionário 1: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Sobrenome: " + funcionario1.getSobrenome());
        System.out.println("Salário Mensal: " + df.format(funcionario1.getSalariomensal()));
        System.out.println("Salário Anual: " + df.format(funcionario1.salarioAnual()));

        System.out.println("Funcionário 2: ");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Sobrenome: " + funcionario2.getSobrenome());
        System.out.println("Salário Mensal: " + df.format(funcionario2.getSalariomensal()));
        System.out.println("Salário Anual: " + df.format(funcionario2.salarioAnual()));

        System.out.println("Aplicando o reajuste de 10% no salário mensal dos funcionários");
        
        funcionario1.aumento();
        funcionario2.aumento();

        System.out.println("Reajuste Aplicado com sucesso!");
        System.out.println("Valores atualizados:");

        System.out.println("Funcionário 1: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Sobrenome: " + funcionario1.getSobrenome());
        System.out.println("Salário Mensal: " + df.format(funcionario1.getSalariomensal()));
        System.out.println("Salário Anual: " + df.format(funcionario1.salarioAnual()));

        System.out.println("Funcionário 2: ");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Sobrenome: " + funcionario2.getSobrenome());
        System.out.println("Salário Mensal: " + df.format(funcionario2.getSalariomensal()));
        System.out.println("Salário Anual: " + df.format(funcionario2.salarioAnual()));
    }
}
