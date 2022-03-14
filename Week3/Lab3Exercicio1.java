/*
    @author: Guilherme Vieira Silva Gonçalves
    @course: Ciência da Computação, 3th semester
    # ⌨️ with ❤️ using Visual Studio Code #
*/

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class Intervalo{
    private static DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
    public static long calcular (String inicio, String fim) throws ParseException {
        Date dtInicial = df.parse (inicio);
        Date dtFinal = df.parse (fim);
        return 
             (dtFinal.getTime() - dtInicial.getTime() + 3600000L) / 86400000L;
    }
}

public class Lab3Exercicio1 {
    public static void main(String[ ] args ) throws ParseException{   
        Scanner input = new Scanner(System.in);
        int dia, mes, ano, DDD;
        dia = mes = ano = DDD = 0;
        String mesS = "";
        Data i = new Data(dia, mes, ano);
        Data ii = new Data(mesS, dia, ano);
        Data iii = new Data(DDD, ano);

        System.out.println("Digite o dia: ");
        dia = Integer.parseInt(input.nextLine());
        i.setDia(dia);
        ii.setDia(dia);
        iii.setDia(dia);
        System.out.println("Digite o mês: ");
        mesS = input.nextLine();
        mes = Integer.parseInt(mesS);
        i.setMes(mes);
        ii.setMesS(mesS);
        System.out.println("Digite o ano: ");
        ano = Integer.parseInt(input.nextLine());
        i.setAno(ano);
        ii.setAno(ano);
        iii.setAno(ano);
        
        SimpleDateFormat dtf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        String formattedDate = dtf.format(dateObj);

        long dias = Intervalo.calcular (i.data(),formattedDate);
        int dateint = (int) dias;

        iii.setDDD(dateint);        

        i.i();
        ii.ii();
        System.out.println(iii.iii());
        input.close();
    }
}
