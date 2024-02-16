package teste;

import javax.swing.JOptionPane;

public class VelocException extends Exception{
    
    public void velocExceptionPasseio(){
        JOptionPane.showMessageDialog(
        null,
        "A Velocidade Maxima esta FORA da legislacao! Foi atribuido 100km/h para veiculo do tipo PASSEIO",
        "VELOCIDADE DE PASSEIO",
        JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void velocExceptionCarga(){
        JOptionPane.showMessageDialog(
        null,
        "A Velocidade Maxima esta FORA da legislacao! Foi atribuido 90km/h para veiculo do tipo CARGA",
        "VELOCIDADE DE CARGA",
        JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}
