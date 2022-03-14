/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;

public class Lab3Exericicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Valor do primeiro numerador: ");
        int numerador = input.nextInt();

        System.out.print("Valor do primeiro denominador: ");
        int denominador = input.nextInt();
        Racional R1 = new Racional(numerador, denominador);

        System.out.print("Valor do segundo numerador: ");
        numerador = input.nextInt();

        System.out.print("Valor do segundo denominador: ");
        denominador = input.nextInt();
        Racional R2 = new Racional(numerador, denominador);
        
        Racional R3 = R1.soma(R2);
        Racional R4 = R1.sub(R2);
        Racional R5 = R1.mult(R2);
        Racional R6 = R1.div(R2);

        System.out.println(R1 + " + " + R2 + " = " + R6);
        System.out.println(R1 + " - " + R2 + " = " + R5);
        System.out.println(R1 + " * " + R2 + " = " + R4);
        System.out.println(R1 + " / " + R2 + " = " + R3);

        System.out.println(R6.casasdecimais(4));
        System.out.println(R5.casasdecimais(4));
        System.out.println(R4.casasdecimais(4));
        System.out.println(R3.casasdecimais(4));
        input.close();
    }

}
