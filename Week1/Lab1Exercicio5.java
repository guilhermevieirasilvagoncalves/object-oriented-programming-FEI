/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;

public class Lab1Exercicio5 {
    public static void main(String args[]){
        int num;
        int i;
        int[] list;
        list = new int[ 20 ];
        Scanner input = new Scanner(System.in);
        for(i = 0; i < 5; i++){
            list[i] = input.nextInt();
        }
        int k = 5;
        for(i = 0; i < 5; i++){
            for(int j = 0; j < list[i]; j++){
                System.out.printf("*");
            }
          System.out.println("");  
        }
    }
}