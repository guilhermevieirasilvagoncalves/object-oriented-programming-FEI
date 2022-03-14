/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat; 

public class Lab3Exercicio3 {
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        HeartRates pessoa = new HeartRates();
        System.out.println("Digite o seu nome: ");
        pessoa.setNome(input.nextLine());
        System.out.println("Digite o seu sobrenome: ");
        pessoa.setSobrenome(input.nextLine());
        System.out.println("Digite o dia do seu nascimento: ");
        pessoa.setDia(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o mês do seu nascimento: ");
        pessoa.setMes(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o Ano do seu nascimento: ");
        pessoa.setAno(Integer.parseInt(input.nextLine()));
        String data;
        data = pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno();
        Date dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(data); 
        int idade = pessoa.calculaIdade(dataNasc);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobrenome: " + pessoa.getSobrenome());
        System.out.printf("Data de nascimento: %d/%d/%d \n",pessoa.getDia(),pessoa.getMes(),pessoa.getAno());
        System.out.println("Idade: " + pessoa.calculaIdade(dataNasc) + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.fcmax(idade));
        pessoa.fcal();
        System.out.printf("Frequênia Cardíaca Alvo: %.2f a %.2f \n",pessoa.getFcal50(),pessoa.getFcal85());
        
        input.close();
    }
}
