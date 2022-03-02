/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public interface Lab2Exercicio5 {
    public static void main(String[ ] args ){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        PerfilDeSaude pessoa = new PerfilDeSaude();
        System.out.println("Digite o nome: ");
        pessoa.setNome(input.nextLine());
        System.out.println("Digite o sobrenome: ");
        pessoa.setSobrenome(input.nextLine());
        System.out.println("Digite o sexo: ");
        pessoa.setSexo(input.nextLine());
        System.out.println("Digite o dia do nascimento: ");
        pessoa.setDia(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o mês do nascimento: ");
        pessoa.setMes(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o ano do nascimento: ");
        pessoa.setAno(Integer.parseInt(input.nextLine()));
        System.out.println("Digite a altura em metros: ");
        pessoa.setAltura(Float.parseFloat(input.nextLine()));
        System.out.println("Digite o peso em kilos: ");
        pessoa.setPeso(Float.parseFloat(input.nextLine()));

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Nascimento: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno());
        System.out.println("Idade: " + pessoa.idade());
        System.out.println("Altura: " + df.format(pessoa.getAltura()));
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("IMC: " + df.format(pessoa.imc()));
    }
}
