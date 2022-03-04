/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;
public class Lab2Exercicio4 {
    public static void main(String[ ] args ){
        Scanner input = new Scanner(System.in);
        Invoice fatura = new Invoice();
        System.out.println("Digite o número identificador: ");
        fatura.setIdentificador(input.nextLine());
        System.out.println("Digite uma descrição: ");
        fatura.setDescrição(input.nextLine());
        System.out.println("Digite a quantidade de itens comprados: ");
        fatura.setQuantidade(Integer.parseInt(input.nextLine()));
        System.out.println("Digite o preço do item: ");
        fatura.setPreço(Double.parseDouble(input.nextLine()));
        
        System.out.println("Número identificador: " + fatura.getIdentificador());
        System.out.println("Descrição: " + fatura.getDescrição());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço: " + fatura.getPreço());
        System.out.println("O valor da fatura é de: " + fatura.getInvoiceAmount());
    }
}
