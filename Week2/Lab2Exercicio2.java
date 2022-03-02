/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;

public class Lab2Exercicio2 {
    public static void main(String[ ] args ){
        Scanner input = new Scanner(System.in);
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        
        System.out.println("Digite o modelo da tv1: ");
        tv1.setModelo(input.nextLine());

        System.out.println("Digite o modelo da tv2: ");
        tv2.setModelo(input.nextLine());

        System.out.println("Digite o preço da tv1: ");
        tv1.setPreco(Integer.parseInt(input.nextLine()));

        System.out.println("Digite o preço da tv2: ");
        tv2.setPreco(Integer.parseInt(input.nextLine()));

        System.out.println("Digite o tamanho da tv1: ");
        tv1.setTamanho(Integer.parseInt(input.nextLine()));

        System.out.println("Digite o tamanho da tv2: ");
        tv2.setTamanho(Integer.parseInt(input.nextLine()));

        int tv;
        System.out.println("Alterar Volume");
        System.out.println("Digite qual televisão será alterada: ");
        System.out.println("1 - Tv1");
        System.out.println("2 - Tv2");
        tv = Integer.parseInt(input.nextLine());
        if(tv == 1){
            int num;
            System.out.println("Digite o valor que deseja aumentar ou diminuir do volume: ");
            System.out.println("Para diminuir escreva números negativos");
            System.out.println("Para aumentar escreva números positivos");
            num = Integer.parseInt(input.nextLine());
            tv1.alteraVolume(num);
            System.out.println("Volume alterado com sucesso");
        }
        else if(tv == 2){
            int num;
            System.out.println("Digite o valor que deseja aumentar ou diminuir do volume: ");
            System.out.println("Para diminuir escreva números negativos");
            System.out.println("Para aumentar escreva números positivos");
            num = Integer.parseInt(input.nextLine());
            tv2.alteraVolume(num);
            System.out.println("Volume alterado com sucesso");
        }
    
        int tvcanal;
        System.out.println("Alterar Canal");
        System.out.println("Digite qual televisão será alterada: ");
        System.out.println("1 - Tv1");
        System.out.println("2 - Tv2");
        tvcanal = Integer.parseInt(input.nextLine());
        System.out.println("Deseja aumentar ou diminuir o número do canal? ");
        System.out.println("1 - Aumentar");
        System.out.println("2 - Diminuir");
        int numcanal;
        numcanal = Integer.parseInt(input.nextLine());
        if(tvcanal == 1){
            if(numcanal == 1){
                tv1.alteraCanal(1);
            }
            else{
                tv1.alteraCanal(-1);
            }
        }
        else if(tvcanal == 2){
            if(numcanal == 1){
                tv2.alteraCanal(1);
            }
            else{
                tv2.alteraCanal(-1);
            }
        }
        System.out.println("Canal Alterado com sucesso");

    
        int tvligar;
        System.out.println("Desligar tv");
        System.out.println("Digite qual televisão será alterada: ");
        System.out.println("1 - Tv1");
        System.out.println("2 - Tv2");
        tvligar = Integer.parseInt(input.nextLine());
        if(tvligar == 1){
            tv1.desligarTv();
            System.out.println("Tv desligada com sucesso");
        }
        else if(tvligar == 2){
            tv2.desligarTv();
            System.out.println("Tv desligada com sucesso");
        }
    }
}
