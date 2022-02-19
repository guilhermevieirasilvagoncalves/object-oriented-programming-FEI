/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;

public class Lab1Exercicio1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        System.out.printf("Entre o tamanho do lado: \n");
        num = input.nextInt();
        for (int i = 0; i < num; i++){
            System.out.printf("*");
        }
        for (int i = 0; i < num - 2; i++){
            System.out.printf("\n*");
            for(int j = 0; j < num - 2; j++){
                System.out.printf(" ");
            }
            System.out.printf("*");
        }
        System.out.printf("\n");    
        for (int i = 0; i < num; i++){
            System.out.printf("*");
        }
    }
}
