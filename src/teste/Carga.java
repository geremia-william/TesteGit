package teste;

public final class Carga extends Veiculo implements Calcular{
    //Atributos
    private int cargaMax;
    private int tara;
    
    //Metodo Construtor
    public Carga(){
        this.cargaMax = 0;
        this.tara = 0;
    }
    
    //Sobrecrga do construtor
    public Carga(String placa, String marca, String modelo, String cor, int velocMax, int qtdRodas, int qtdPist, int potencia, int cargaMax, int tara) {
        super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }
    
    //Métodos especiais
    public int getCargaMax() {
        return cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }
    
    //métodos
    @Override
    public int calcular(){
        int contNum = 0;
        
        contNum += getMotor().getQtdPist();
        contNum += getMotor().getPotencia();
        contNum += getQtdRodas();
        contNum += getVelocMax();
        contNum += getTara();
        contNum += getCargaMax();
        
        return contNum;
    }
    
    @Override
    public void calcVel(){
        int v = (this.getVelocMax() * 10000);
        System.out.println("Velocidade Carga: "+v+" cm/h");
    }
    
}
