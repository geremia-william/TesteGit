package teste;

public abstract class Veiculo {
    
    //Atributos
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private int velocMax;
    private int qtdRodas;
    private Motor motor;
    
    //Metodo Construtor
    public Veiculo() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = 0;
        this.qtdRodas = 0;
        this.motor = new Motor();
        
    }
    
    //Sobrecarga Veiculo
    public Veiculo(String placa, String marca, String modelo, String cor, int velocMax, int qtdRodas, int qtdPist, int potencia) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = new Motor(qtdPist, potencia);
        
    }

    //Metodos especiais (getters/Setters)
    public String getPlaca() {
        return placa;
        
    }

    public String getMarca() {
        return marca;
        
    }

    public String getModelo() {
        return modelo;
        
    }

    public String getCor() {
        return cor;
        
    }

    public int getVelocMax() {
        return velocMax;
        
    }

    public int getQtdRodas() {
        return qtdRodas;
        
    }

    public Motor getMotor() {
        return motor;
        
    }

    public final void setPlaca(String placa) {
        this.placa = placa;
        
    }

    public final void setMarca(String marca) {
        this.marca = marca;
        
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
        
    }

    public final void setCor(String cor) {
        this.cor = cor;
        
    }

    public final void setVelocMax (int velocMax) throws VelocException{
        if(velocMax >= 80 && velocMax <= 110){
            this.velocMax = velocMax;
            
            } else{
                   throw new VelocException();
                }
        
    }

    public final void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
        
    }

    public final void setMotor(Motor motor) {
        this.motor = motor;
        
    }
    
    //Metodos 
    public abstract void calcVel();
      
}
