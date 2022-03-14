public class Data {
    private int dia, mes, ano, DDD;
    private String mesS;
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public Data(String mes, int dia, int ano){
        mesS = mes;
        this.dia = dia;
        this.ano = ano;
    }
    public Data(int DDD, int ano){
        this.DDD = DDD;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }

    public String getMesS() {
        return mesS;
    }

    public void setMesS(String mesS) {
        this.mesS = mesS;
    }

    public void i(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }
    public String data(){
        String data = dia+"/"+mes+"/"+ano;
        return data;
    }

    public void ii(){
        switch(mesS){
            case "01": 
            System.out.println("Janeiro " + dia +", " + ano);
            break;
            case "1":
            System.out.println("Janeiro " + dia +", " + ano);
            break;
            case "02":
            System.out.println("Fevereiro " + dia +", " + ano);
            break;
            case "2":
            System.out.println("Fevereiro " + dia +", " + ano);
            break;
            case "03":
            System.out.println("Março " + dia +", " + ano);
            break;
            case "3":
            System.out.println("Março " + dia +", " + ano);
            break;
            case "04":
            System.out.println("Abril " + dia +", " + ano);
            break;
            case "4":
            System.out.println("Abril " + dia +", " + ano);
            break;
            case "05":
            System.out.println("Maio " + dia +", " + ano);
            break;
            case "5":
            System.out.println("Maio " + dia +", " + ano);
            break;
            case "06":
            System.out.println("Junho " + dia +", " + ano);
            break;
            case "6":
            System.out.println("Junho " + dia +", " + ano);
            break;
            case "07":
            System.out.println("Julho " + dia +", " + ano);
            break;
            case "7":
            System.out.println("Julho " + dia +", " + ano);
            break;
            case "08":
            System.out.println("Agosto " + dia +", " + ano);
            break;
            case "8":
            System.out.println("Agosto " + dia +", " + ano);
            break;
            case "09":
            System.out.println("Setembro " + dia +", " + ano);
            break;
            case "9":
            System.out.println("Setembro " + dia +", " + ano);
            break;
            case "10":
            System.out.println("Outubro " + dia +", " + ano);
            break;
            case "11":
            System.out.println("Novembro " + dia +", " + ano);
            break;
            case "12":
            System.out.println("Dezembro " + dia +", " + ano);
            break;
        }
    
    }
    public String iii(){
        return DDD +" "+ ano;
    }

    
}
