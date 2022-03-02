public class PerfilDeSaude {
    private String nome, sobrenome, sexo;
    private int dia, mes, ano;
    private double altura, peso;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
        return mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }

    public double imc(){
        double imc;
        imc = (peso / Math.pow(altura,2));
        return imc;
    }

    public int idade(){
        int idadeano;
        idadeano = 2022 - ano;
        return idadeano;
    }
}
 