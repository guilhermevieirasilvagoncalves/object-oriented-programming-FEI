public class Invoice {
    private String identificador;
    private String descrição;
    private int quantidade;
    private double preço;

    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    public String getIdentificador(){
        return identificador;
    }

    public void setDescrição(String descrição){
        this.descrição = descrição;
    }
    public String getDescrição(){
        return descrição;
    }

    public void setQuantidade(int quantidade){
        if(quantidade < 0){
            quantidade = 0;
        }
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setPreço(double preço){
        if(preço < 0){
            preço = 0;
        }
        this.preço = preço;
    }
    public double getPreço(){
        return preço;
    }

    public double getInvoiceAmount(){
        double fatura;
        fatura = quantidade * preço;
        return fatura;
    }


}
