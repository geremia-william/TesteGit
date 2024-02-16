package teste;

import javax.swing.JOptionPane;

public class VeicExistException extends Exception {
    
    public void veicExistException(){
        
        JOptionPane.showMessageDialog(
                null,
                "Um veiculo com essa placa JA FOI CADASTRADO!",
                "ERRO CADASTRO",
                JOptionPane.ERROR_MESSAGE);
        
    }
    
}
