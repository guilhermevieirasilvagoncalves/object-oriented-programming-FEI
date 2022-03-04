public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

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

    public void setSalariomensal(double salarioMensal){
        if(salarioMensal < 0){
            salarioMensal = 0;
        }
        this.salarioMensal = salarioMensal;
    }
    public double getSalariomensal(){
        return salarioMensal;
    }

    public double salarioAnual(){
        double salarioAnual;
        salarioAnual = salarioMensal * 12;
        return salarioAnual;
    }

    public double aumento(){
        salarioMensal = salarioMensal * 1.10;
        return salarioMensal;
    }

}
