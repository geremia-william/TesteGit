package teste;

public final class Passeio extends Veiculo implements Calcular {
    //Atributos
    private int qtdPassageiros;
    
    //Metodos contrutor
    public Passeio(){
        this.qtdPassageiros = 0;
    }
    
    //Sobrecarga do construtor
    public Passeio(String placa, String marca, String modelo, String cor, int velocMax, int qtdRodas, int qtdPist, int potencia, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
        this.qtdPassageiros = qtdPassageiros;   
    }
   
    //Métodos especiasi
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
    
    //Metodos
    @Override
    public void calcVel(){
        int v = (this.getVelocMax() * 1000);
        System.out.println("Velocidade Passeio: "+v+" m/h");
    }
      
    @Override
    public int calcular(){
        int contLetras = 0;
        
        contLetras += getPlaca().length();
        contLetras += getMarca().length();
        contLetras += getModelo().length();
        contLetras += getCor().length();
   
        return contLetras;
    }
    
}
