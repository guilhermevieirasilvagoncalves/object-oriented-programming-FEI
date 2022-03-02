public class Televisao {
    private String modelo;
    private float preco, tamanho;
    private int canal = 0, volume = 0;
    private boolean ligada = true;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return preco;
    }

    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public float getTamanho(){
        return tamanho;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }
    public float getCanal(){
        return canal;
    }
     
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    public boolean getLigada(){
        return ligada;
    }

    public int alteraVolume(int valor){
        if(volume > 10){
            volume = 10;
        }    
        volume = volume + valor;
        return volume;
    }
    public int alteraCanal(int valor){
        if(canal < 0){
            canal = 0;
        }
        canal = canal + valor;
        return canal;
    }
    public boolean desligarTv(){
        ligada = false;
        return ligada;
    }
}
