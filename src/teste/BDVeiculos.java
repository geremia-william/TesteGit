
package teste;

import javax.swing.JOptionPane;

import java.util.List;
import java.util.ArrayList;

public class BDVeiculos {

    private static List <Passeio> bDPasseio = new ArrayList <Passeio>();
    private static List <Carga> bDCarga = new ArrayList <Carga>();
    

    public static List<Passeio> getBDPasseio() {
        return bDPasseio;
        
    }

    public static List<Carga> getBDCarga() {
        return bDCarga;
        
    }
    
    public static Passeio procuraPlacaPasseio(Passeio p){
        for(int i = 0; i < bDPasseio.size(); i++){
            if(p.getPlaca().equals(bDPasseio.get(i).getPlaca())){
                return bDPasseio.get(i);
                
            }
            
        }
        return null;
        
    }
    
    public static Carga procuraPlacaCarga(Carga c){
        for(int i = 0; i < bDCarga.size(); i++){
            if(c.getPlaca().equals(bDCarga.get(i).getPlaca())){
                return bDCarga.get(i);
                
            }
            
        }
        return null;
        
    }

    
    public static void adicionaPasseio() {          
        try{            
            Passeio p = Teste.cadastroPasseioIG();
            
            bDPasseio.add(p);
            
            JOptionPane.showMessageDialog(
            null,
            "Veiculo de PASSEIO cadastrado na posicao "+(bDPasseio.indexOf(p))+".",
            "VELOCIDADE DE PASSEIO",
            JOptionPane.INFORMATION_MESSAGE);
            
            }
                    
            catch(VeicExistException vee){
                vee.veicExistException();
                        
            }
                    
            catch(VelocException ve){
                ve.velocExceptionPasseio();
                
            }
        
            catch(NumberFormatException nfe){
                
                JOptionPane.showMessageDialog(
                null,
                "Os valores de Rodas, Potencia, Pistões, Qtd Passageiros e Velocidade, devem ser valores do tipo INTERIO",
                "ERRO DE ENTRADA DE DADOS",
                JOptionPane.ERROR_MESSAGE);
            }
               
    }
    
    public static void adicionaCarga() { 
        try{
            Carga c = Teste.cadastroCargaIG();
            
            bDCarga.add(c);
            
            JOptionPane.showMessageDialog(
            null,
            "Veiculo de CARGA cadastrado na posicao "+(bDCarga.indexOf(c))+".",
            "VELOCIDADE DE CARGA",
            JOptionPane.INFORMATION_MESSAGE);
            
            }
                    
            catch(VeicExistException vee){
                vee.veicExistException();
                        
            }
                    
            catch(VelocException ve){
                ve.velocExceptionPasseio();
                
            }
        
            catch(NumberFormatException nfe){
                
                JOptionPane.showMessageDialog(
                null,
                "Os valores de Rodas, Potencia, Pistões, Tara, Carga e Velocidade, devem ser valores do tipo INTERIO",
                "ERRO DE ENTRADA DE DADOS",
                JOptionPane.ERROR_MESSAGE);
            }
               
    } 
    
    public void removerPasseio(Passeio p){
        p = procuraPlacaPasseio(p);
        
        if (p == null) {
            Teste.limparCx();
            JOptionPane.showMessageDialog(
            null,
            "A Placa informada NAO esta na lista de Veiculos de PASSEIO cadastrados.",
            "EXCLUIR PLACA",
            JOptionPane.ERROR_MESSAGE);
            
        } else {
            int retorno = JOptionPane.showConfirmDialog(
                null,
                "Deseja EXCLUIR esse Veiculo na classe PASSEIO?",
                "CONFIRMAÇÃO DE CADASTRO",
                JOptionPane.YES_NO_OPTION);
                
                if(retorno ==0){
                    Teste.limparCx();
                    
                    JOptionPane.showMessageDialog(
                    null,
                    "Veiculo de PASSEIO de placa "+p.getPlaca()+" removido da possicao "+(bDPasseio.indexOf(p))+".",
                    "EXCLUIR PLACA",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                    bDPasseio.remove(bDPasseio.indexOf(p)); 
                
                }
           
        }
        
    }
    
    public void removerCarga(Carga c){
        c = procuraPlacaCarga(c);
        
        if (c == null) {
            Teste.limparCx();
            
            JOptionPane.showMessageDialog(
            null,
            "A Placa informada NAO esta na lista de Veiculos de CARGA cadastrados.",
            "EXCLUIR PLACA",
            JOptionPane.ERROR_MESSAGE);
            
        } else {
            int retorno = JOptionPane.showConfirmDialog(
                null,
                "Deseja EXCLUIR esse Veiculo na classe PASSEIO?",
                "CONFIRMAÇÃO DE CADASTRO",
                JOptionPane.YES_NO_OPTION);
                
                if(retorno ==0){
                    Teste.limparCx();
                    
                    JOptionPane.showMessageDialog(
                    null,
                    "Veiculo de CARGA de placa "+c.getPlaca()+" removido da posicao "+(bDCarga.indexOf(c))+".",
                    "EXCLUIR PLACA",
                    JOptionPane.INFORMATION_MESSAGE);
                    
                    bDCarga.remove(bDCarga.indexOf(c)); 
                
                }

        }
        
    }
       
}
