import java.text.DecimalFormat;

public class Racional{
  private int numerador, denominador;

  public Racional(int numerador, int denominador){
    reduzirFracao(numerador, denominador);
  }

  public int getNumerador(){
    return numerador;
  }

  private void setNumerador(int numerador){
    this.numerador = numerador;
  }

  public int getDenominador(){
    return denominador;
  }

  private void setDenominador(int denominador){
    this.denominador = denominador;
  }

  private void reduzirFracao(int numerador, int denominador){
    int maior;
    int i = 1;
    if(numerador > denominador){
      maior = numerador;
    }
    else{
      maior = denominador;
    }
    for(int k = 2; k <= maior; k++){
      if((numerador % k == 0) && (denominador % k == 0)){
        i = k;
      }
    }
    setNumerador(numerador / i);
    setDenominador(denominador / i);
  }

  public Racional soma(Racional other){
    int numerador = this.numerador * other.denominador + this.denominador * other.numerador;
    int denominador = this.denominador * other.denominador;
    return new Racional(numerador, denominador);
  }

  public Racional sub(Racional other){
    int numerador = this.numerador * other.denominador - this.denominador * other.numerador;
    int denominador = this.denominador * other.denominador;
    return new Racional(numerador, denominador);
  }

  public Racional mult(Racional other){
    int numerador = this.numerador * other.numerador;
    int denominador = this.denominador * other.denominador;
    return new Racional(numerador, denominador);
  }

  public Racional div(Racional other){
    int numerador = this.numerador * other.denominador;
    int denominador = this.denominador * other.numerador;
    return new Racional(numerador, denominador);
  }

  public String casasdecimais(){
    return casasdecimais(10);
  }

  public String casasdecimais(int precisao){
    if(precisao <= 0){
      precisao = 10;
    }
    String c = "0.";
    for(int i = 0; i < precisao; i++){
      c = c + "0";
    }
    DecimalFormat formato = new DecimalFormat(c);
    return formato.format(1.0 * numerador / denominador);
  }

  @Override
  public String toString(){
    return numerador + "/" + denominador;
  }
}