/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;

public class Lab1Exercicio3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int P,R;
        System.out.printf("Digite o P: \n");
        P = input.nextInt();
        System.out.printf("Digite o S: \n");
        R = input.nextInt();
        if(P == 0 && R == 1){
            System.out.println("C");
        }
        if(P == 0 && R == 0){
            System.out.println("C");
        }
        if(P == 1 && R == 0){
            System.out.println("B");
        }
        if(P == 1 && R == 1){
            System.out.println("A");
        }
    }
}
