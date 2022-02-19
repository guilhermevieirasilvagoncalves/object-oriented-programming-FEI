/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # coded with ❤️ using Visual Studio Code#
*/

import java.util.Scanner;

public class Lab1Exercicio4{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        double salario;
        double novosalario = 0;
        int porc = 0;
        System.out.println("Digite o salário: ");
        salario = input.nextDouble();
        if(salario >= 0 && salario <= 400.00){
          novosalario = salario * 1.15;
          porc = 15;
        }
        if(salario >= 400.01 && salario <= 800.00){
          novosalario = salario * 1.12;
          porc = 12;
        }
        if(salario >= 800.01 && salario <= 1200.00){
          novosalario = salario * 1.10;
          porc = 10;
        }
        if(salario >= 1200.01 && salario <= 2000.00){
            novosalario = salario * 1.07;
            porc = 7;
        }
        if(salario > 2000.00){
            novosalario = salario * 1.04;
            porc = 4;
        }
        System.out.printf("Novo Salario: %.2f\n",novosalario);
        System.out.printf("Reajuste: %.2f\n", novosalario - salario);
        System.out.printf("Percentual: %d\n", porc);
    }
} 