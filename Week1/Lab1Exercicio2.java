/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;

public class Lab1Exercicio2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num, quant;
        double[] list = {2.98, 4.50, 3.98, 4.49, 6.87};
        double valortotal = 0;
        do{
        System.out.printf("Digite o número do produto: \n");
        num = input.nextInt();
        System.out.printf("Digite a quantidade: \n");
        quant = input.nextInt();
        switch(num){
            case 1:
            valortotal += (quant * list[0]);
            break;
            case 2:
            valortotal += (quant * list[1]);
            break;
            case 3:
            valortotal += (quant * list[2]);
            break;
            case 4:
            valortotal += (quant * list[3]);
            break;
            case 5:
            valortotal += (quant * list[4]);
            break;
        }
        }while(num > 0 && num < 6);
        System.out.println("Valor: " + valortotal);
    }
}
