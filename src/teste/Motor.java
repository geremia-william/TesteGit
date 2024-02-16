package teste;

public class Motor {
    //Atributos
    private int qtdPist;
    private int potencia;
    
    //Metodo contrutor
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }
    
    //Sobrecarga do construtor
    public Motor(int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }
    
    //metodos especiais
    public int getQtdPist() {
        return qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public final void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public final void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
}
