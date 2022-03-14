import java.util.Calendar;

public class HeartRates {
    private String nome, sobrenome;
    private int dia, mes, ano, fcmax;
    private double fcal50, fcal85;

    public HeartRates(){}

    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    
    public int getFcmax() {
        return fcmax;
    }
    public double getFcal50() {
        return fcal50;
    }
    public double getFcal85() {
        return fcal85;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
 
    public String dataNasc(){
        String dataNasc;
        dataNasc = dia + "/" + mes + "/" + ano;
        return dataNasc;
    }
    
    public int fcmax(int idade){
        this.fcmax = 220 - idade;
        return this.fcmax;
    }
    
    public void fcal(){
        this.fcal50 = (double) (this.fcmax * 0.5);
        this.fcal85 = (double) (this.fcmax * 0.85);
    }
    
    
    public int calculaIdade(java.util.Date dataNasc){
    Calendar dataNascimento = Calendar.getInstance();  
    dataNascimento.setTime(dataNasc); 
    Calendar hoje = Calendar.getInstance();  

    int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
        }
    }
    return idade;
    }
    
}