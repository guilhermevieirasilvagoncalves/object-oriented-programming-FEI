/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;

public class Lab2Exercicio1{
    public static void main(String[ ] args ){
        Scanner input = new Scanner(System.in);
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        System.out.println("Digite o valor do lado 1 e 2 do retângulo 1: ");
        ret1.setLado1(input.nextInt());
        ret1.setLado2(input.nextInt());

        System.out.println("Digite o valor do lado 1 e 2 do retângulo 2: ");
        ret2.setLado1(input.nextInt());
        ret2.setLado2(input.nextInt());


        System.out.println("Lado 1 do retângulo 1: ");
        System.out.println(ret1.getLado1());
        System.out.println("Lado 2 do retângulo 1: ");
        System.out.println(ret1.getLado2());

        System.out.println("Lado 1 do retângulo 2: ");
        System.out.println(ret2.getLado1());
        System.out.println("Lado 2 do retângulo 2: ");
        System.out.println(ret2.getLado2());

        System.out.println("Área do primeiro retângulo: " + ret1.area());
        System.out.println("Área do segundo retângulo: " + ret2.area());
        System.out.println("Perimetro do primeiro retângulo: " + ret1.perimetro());
        System.out.println("Perimetro do primeiro retângulo: " + ret2.perimetro());
    }
}