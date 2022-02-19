/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

public class Lab1Exercicio6 {
    public static void main(String args[]){
        int catetoA, catetoB, hipotenusaC;
        for(hipotenusaC = 0; hipotenusaC <= 500; hipotenusaC++){
            for(catetoA = 0 ; catetoA <= 500; catetoA++){
                for(catetoB = 0; catetoB <= 500; catetoB++){
                    if(Math.pow(hipotenusaC,2) == (Math.pow(catetoA,2) + Math.pow(catetoB,2))){
                        System.out.printf("São números de pitágoras: %d %d %d\n",hipotenusaC,catetoA,catetoB);
                    }
                    else if(Math.pow(hipotenusaC,2) < (Math.pow(catetoA,2) + Math.pow(catetoB,2))){
                        assert true;
                    }
                }
            }
        }
    }
}
