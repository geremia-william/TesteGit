package teste;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Teste implements ActionListener {
    
    public static JFrame jan0 = new JFrame("GESTÃO DE VEICULOS");
    public static JFrame jan1 = new JFrame("OPÇÕES PASSEIO");
    public static JFrame jan2 = new JFrame("OPÇÕES CARGA");
    public static JFrame jan3 = new JFrame("CADASTRO DE VEICULOS PASSEIO");
    public static JFrame jan4 = new JFrame("CADASTRO DE VEICULOS CARGA");
    public static JFrame jan5 = new JFrame("CONSULTA/EXCLUIR PASSEIO");
    public static JFrame jan6 = new JFrame("CONSULTA/EXCLUIR CARGA");
    public static JFrame jan7 = new JFrame("IMPRIMIR/EXCLUIR TODOS PASSEIO");
    public static JFrame jan8 = new JFrame("IMPRIMIR/EXCLUIR TODOS CARGA");

    public static JLabel rtPlaca = new JLabel   ("Placa................:");
    public static JLabel rtMarca = new JLabel   ("Marca................:");
    public static JLabel rtModelo = new JLabel  ("Modelo...............:");
    public static JLabel rtCor = new JLabel     ("Cor..................:");
    public static JLabel rtVelocMax = new JLabel("Velocidade Máxima....:");
    public static JLabel rtQtdRodas = new JLabel("Quantidade de Rodas..:");
    public static JLabel rtPotencia = new JLabel("Potencia.............:");
    public static JLabel rtQtdPist = new JLabel ("Quantidade de Pistões:");
    public static JLabel rtQtdPass = new JLabel ("Quantidade de Passag.:");
    public static JLabel rtTara = new JLabel    ("Tara.................:");
    public static JLabel rtCargaMax = new JLabel("Carga Máxima.........:");
    
    public static JTextField cxPlaca = new JTextField (20);
    public static JTextField cxMarca = new JTextField (20);
    public static JTextField cxModelo = new JTextField (20);
    public static JTextField cxCor = new JTextField (20);
    public static JTextField cxVelocMax = new JTextField (20);
    public static JTextField cxQtdRodas = new JTextField (20);
    public static JTextField cxPotencia = new JTextField (20);
    public static JTextField cxQtdPist = new JTextField (20);
    public static JTextField cxQtdPass = new JTextField (20);
    public static JTextField cxTara = new JTextField (20);
    public static JTextField cxCargaMax = new JTextField (20);
    
    public static JButton btJan1 = new JButton("Passeio"); 
    public static JButton btJan2 = new JButton("Carga");
    public static JButton btJan3 = new JButton("Cadastrar");
    public static JButton btJan4 = new JButton("Cadastrar");
    public static JButton btJan5 = new JButton("Consultar/Excluir pela placa ");
    public static JButton btJan6 = new JButton("Consultar/Excluir pela placa ");
    public static JButton btJan7 = new JButton("Imprimir/Excluir todos ");
    public static JButton btJan8 = new JButton("Imrprimir/Excluir todos ");
    public static JButton btCadastrarP = new JButton("Cadastrar");   
    public static JButton btCadastrarC = new JButton("Cadastrar");    
    public static JButton btLimpar = new JButton("Limpar"); 
    public static JButton btSair1 = new JButton("Sair");
    public static JButton btSair2 = new JButton("Sair");
    public static JButton btSair3 = new JButton("Sair");
    public static JButton btSair4 = new JButton("Sair"); 
    public static JButton btSair5 = new JButton("Sair");
    public static JButton btSair6 = new JButton("Sair");
    public static JButton btSair7 = new JButton("Sair");  
    public static JButton btSair8 = new JButton("Sair");    
    public static JButton btNovo = new JButton("Novo");          
    public static JButton btExcluirP = new JButton("Excluir");    
    public static JButton btConsultarP = new JButton("Consultar");
    public static JButton btExcluirC = new JButton("Excluir");    
    public static JButton btConsultarC = new JButton("Consultar"); 
    public static JButton btImprimirAllP = new JButton("Imprimir todos");
    public static JButton btExcluirAllP = new JButton("Excluir todos");
    public static JButton btImprimirAllC = new JButton("Imprimir todos");
    public static JButton btExcluirAllC = new JButton("Excluir todos");       
    
    public static String[] colunasP = {"Placa", "Marca", "Modelo", "Cor", "Veloc. Máx.", "Qtd. Rodas", "Potência",  "Qtd. Pistão", "Quant. Pass."};
    public static DefaultTableModel modeloP = new DefaultTableModel(colunasP,0);
    public static JTable tabelaP = new JTable(modeloP)  ;
    public static JScrollPane scrollP = new JScrollPane(tabelaP);
    
    public static String[] colunasC = {"Placa", "Marca", "Modelo", "Cor", "Veloc. Máx.", "Qtd. Rodas", "Potência",  "Qtd. Pistão", "Tara", "Carga Max"};
    public static DefaultTableModel modeloC = new DefaultTableModel(colunasC,0);
    public static JTable tabelaC = new JTable(modeloC);
    public static JScrollPane scrollC = new JScrollPane(tabelaC);
   
    public static Teste t = new Teste();
    
    public static BDVeiculos bDV = new BDVeiculos();
    
    public static Passeio p;
    
    public static Carga c;
    
    public static void main(String[] args){
        
        criaJan0();
        
    }//main

    //CIAÇÃO DE JANELAS
    public static void criaJan0(){
        
        int b = 400, h = 100;
            
        jan0.setSize(b ,h);
        jan0.setDefaultCloseOperation(jan0.EXIT_ON_CLOSE);
        
        jan0.add(btJan1);
        jan0.add(btJan2);

        btJan1.addActionListener(t);
        btJan2.addActionListener(t);

        jan0.setLayout(new FlowLayout());
        jan0.setVisible(true);

    }

    public static void criaJan1(){
        
        int b = 400, h = 120;
            
        jan1.setSize(b ,h);
        jan1.setDefaultCloseOperation(jan1.DISPOSE_ON_CLOSE);
        
        jan1.add(btJan3);
        jan1.add(btJan5);
        jan1.add(btJan7);
        jan1.add(btSair1);

        btJan3.addActionListener(t);
        btJan5.addActionListener(t);
        btJan7.addActionListener(t);
        btSair1.addActionListener(t);

        jan1.setLayout(new FlowLayout());
        jan1.setVisible(true);

    }
    
    public static void criaJan2(){
        
        int b = 400, h = 120;
            
        jan2.setSize(b ,h);
        jan2.setDefaultCloseOperation(jan2.DISPOSE_ON_CLOSE);
        
        jan2.add(btJan4);
        jan2.add(btJan6);
        jan2.add(btJan8);
        jan2.add(btSair2);

        btJan4.addActionListener(t);
        btJan6.addActionListener(t);
        btJan8.addActionListener(t);
        btSair2.addActionListener(t);

        jan2.setLayout(new FlowLayout());
        jan2.setVisible(true);
        
    }    
    
    public static void criaJan3(){
        
        int b = 400, h = 300;
            
        jan3.setSize(b ,h);
        jan3.setDefaultCloseOperation(jan3.DISPOSE_ON_CLOSE);
        
        jan3.add(rtPlaca);
        jan3.add(cxPlaca);
        
        jan3.add(rtMarca);
        jan3.add(cxMarca);
        
        jan3.add(rtModelo);
        jan3.add(cxModelo);
        
        jan3.add(rtCor);
        jan3.add(cxCor);    
        
        jan3.add(rtVelocMax);
        jan3.add(cxVelocMax);
        
        jan3.add(rtQtdRodas);
        jan3.add(cxQtdRodas);
        
        jan3.add(rtPotencia);
        jan3.add(cxPotencia);
        
        jan3.add(rtQtdPist);
        jan3.add(cxQtdPist);
        
        jan3.add(rtQtdPass);
        jan3.add(cxQtdPass);
        
        jan3.add(btCadastrarP);
        jan3.add(btLimpar);
        jan3.add(btNovo);
        jan3.add(btSair3);
        
        btCadastrarP.addActionListener(t);
        btLimpar.addActionListener(t);
        btSair3.addActionListener(t);

        jan3.setLayout(new FlowLayout());
        jan3.setVisible(true);

    }
    
    public static void criaJan4(){
        
        int b = 400, h = 350;
            
        jan4.setSize(b ,h);
        jan4.setDefaultCloseOperation(jan4.DISPOSE_ON_CLOSE);
        
        jan4.add(rtPlaca);
        jan4.add(cxPlaca);
        
        jan4.add(rtMarca);
        jan4.add(cxMarca);
        
        jan4.add(rtModelo);
        jan4.add(cxModelo);
        
        jan4.add(rtCor);
        jan4.add(cxCor);    
        
        jan4.add(rtVelocMax);
        jan4.add(cxVelocMax);
        
        jan4.add(rtQtdRodas);
        jan4.add(cxQtdRodas);
        
        jan4.add(rtPotencia);
        jan4.add(cxPotencia);
       
        jan4.add(rtQtdPist);
        jan4.add(cxQtdPist);
        
        jan4.add(rtTara);
        jan4.add(cxTara);
        
        jan4.add(rtCargaMax);
        jan4.add(cxCargaMax);

        jan4.add(btCadastrarC);
        jan4.add(btLimpar);
        jan4.add(btNovo);
        jan4.add(btSair4);
        
        btCadastrarC.addActionListener(t);
        btLimpar.addActionListener(t);
        btSair4.addActionListener(t);
        
        jan4.setVisible(true);
        jan4.setLayout(new FlowLayout());
        
    }
    
    public static void criaJan5(){
        
        int b = 400, h = 300;
            
        jan5.setSize(b ,h);
        jan5.setDefaultCloseOperation(jan5.DISPOSE_ON_CLOSE);
        
        rtPlaca.setText("Informe a placa: ");
        jan5.add(rtPlaca);
        jan5.add(cxPlaca);
        
        jan5.add(rtMarca);
        jan5.add(cxMarca);
        
        jan5.add(rtModelo);
        jan5.add(cxModelo);
        
        jan5.add(rtCor);
        jan5.add(cxCor);    
        
        jan5.add(rtVelocMax);
        jan5.add(cxVelocMax);
        
        jan5.add(rtQtdRodas);
        jan5.add(cxQtdRodas);
        
        jan5.add(rtPotencia);
        jan5.add(cxPotencia);
        
        jan5.add(rtQtdPist);
        jan5.add(cxQtdPist);
        
        jan5.add(rtQtdPass);
        jan5.add(cxQtdPass);
        
        jan5.add(btExcluirP);
        jan5.add(btConsultarP);
        jan5.add(btLimpar);
        jan5.add(btSair5);
        
        btSair5.addActionListener(t);
        btExcluirP.addActionListener(t);    
        btConsultarP.addActionListener(t);

        jan5.setVisible(true);
        jan5.setLayout(new FlowLayout());
        
    }
        
    public static void criaJan6(){
        
        int b = 400, h = 350;
            
        jan6.setSize(b ,h);
        jan6.setDefaultCloseOperation(jan6.DISPOSE_ON_CLOSE);
        
        rtPlaca.setText("Informe a placa: ");
        jan6.add(rtPlaca);
        jan6.add(cxPlaca);
        
        jan6.add(rtMarca);
        jan6.add(cxMarca);
        
        jan6.add(rtModelo);
        jan6.add(cxModelo);
        
        jan6.add(rtCor);
        jan6.add(cxCor);    
        
        jan6.add(rtVelocMax);
        jan6.add(cxVelocMax);
        
        jan6.add(rtQtdRodas);
        jan6.add(cxQtdRodas);
        
        jan6.add(rtPotencia);
        jan6.add(cxPotencia);
        
        jan6.add(rtQtdPist);
        jan6.add(cxQtdPist);
        
        jan6.add(rtTara);
        jan6.add(cxTara);
        
        jan6.add(rtCargaMax);
        jan6.add(cxCargaMax);
        
        jan6.add(btExcluirC);
        jan6.add(btConsultarC);
        jan6.add(btLimpar);
        jan6.add(btSair6);
        
        btSair6.addActionListener(t);
        btExcluirC.addActionListener(t);    
        btConsultarC.addActionListener(t);

        jan6.setVisible(true);
        jan6.setLayout(new FlowLayout());
        
    }
    
    public static void criaJan7(){
        
        int b = 500, h = 520;
            
        jan7.setSize(b ,h);
        jan7.setDefaultCloseOperation(jan7.DISPOSE_ON_CLOSE);
        
        jan7.add(scrollP);
        jan7.add(btImprimirAllP);
        jan7.add(btExcluirAllP);
        jan7.add(btSair7);
        
        btSair7.addActionListener(t);
        btExcluirAllP.addActionListener(t);    
        btImprimirAllP.addActionListener(t);

        jan7.setVisible(true);
        jan7.setLayout(new FlowLayout());
        
    }
    
    public static void criaJan8(){
        
        int b = 500, h = 520;
            
        jan8.setSize(b ,h);
        jan8.setDefaultCloseOperation(jan8.DISPOSE_ON_CLOSE);
        
        jan8.add(scrollC);
        jan8.add(btImprimirAllC);
        jan8.add(btExcluirAllC);
        jan8.add(btSair8);
        
        btSair8.addActionListener(t);
        btExcluirAllC.addActionListener(t);    
        btImprimirAllC.addActionListener(t);

        jan8.setLayout(new FlowLayout());
        jan8.setVisible(true);
        
    }
    //CIAÇÃO DE JANELAS

    
    //AÇÃO DE BOTÕES
    @Override
    public void actionPerformed(ActionEvent evt){
        
        Object obj = evt.getSource();
        
        //ENTRAR EM JANELAS
        if (obj.equals(btJan1)){
            criaJan1();
        }
        
        else if (obj.equals(btJan2)){
            criaJan2();
        }
        
        else if (obj.equals(btJan3)){
            criaJan3();
        }
        
        else if (obj.equals(btJan4)){
            criaJan4();
        }
        
        else if (obj.equals(btJan5)){
            criaJan5();
        }
        
        else if (obj.equals(btJan6)){
            criaJan6();
        }        

        else if (obj.equals(btJan7)){
            criaJan7();
        }
        
        else if (obj.equals(btJan8)){
            criaJan8();
        }
        //ENTRAR EM JANELAS

        //FECHAR JANELAS
        else if (obj.equals(btSair1)){
            btJan3.removeActionListener(t);
            btJan5.removeActionListener(t);
            btJan7.removeActionListener(t);

            jan1.dispose();
        }
        
        else if (obj.equals(btSair2)){
            btJan4.removeActionListener(t);
            btJan6.removeActionListener(t);
            btJan8.removeActionListener(t);
            
            jan2.dispose();
        }
        
        else if (obj.equals(btSair3)){
            limparCx();
            
            btCadastrarP.removeActionListener(t);
            jan3.dispose();
        }
        
        else if (obj.equals(btSair4)){
            limparCx();
            
            btCadastrarC.removeActionListener(t);
            jan4.dispose();
        }   
      
        else if (obj.equals(btSair5)){
            limparCx();
            
            btConsultarP.removeActionListener(t);
            btExcluirP.removeActionListener(t);
            
            rtPlaca.setText("Placa................:");
            jan5.dispose();
        } 
        
        else if (obj.equals(btSair6)){
            limparCx();
            
            btConsultarC.removeActionListener(t);
            btExcluirC.removeActionListener(t);
            
            rtPlaca.setText("Placa................:");
            jan6.dispose();
        }  
        
        else if (obj.equals(btSair7)){
            modeloP = new DefaultTableModel(colunasP,0);
            tabelaP.setModel(modeloP);
            
            btImprimirAllP.removeActionListener(t);
            btExcluirAllP.removeActionListener(t);
            
            jan7.dispose();
        } 
        
        else if (obj.equals(btSair8)){
            modeloC = new DefaultTableModel(colunasC,0);
            tabelaC.setModel(modeloC);
            
            btImprimirAllC.removeActionListener(t);
            btExcluirAllC.removeActionListener(t);
            
            jan8.dispose();
        }
        //FECHAR JANELAS

        //CADASTRO PASSEIO
        else if (obj.equals(btCadastrarP)){
            int retorno = JOptionPane.showConfirmDialog(
                null,
                "Deseja cadastrar esse Veiculo na classe Passeio?",
                "CONFIRMAÇÃO DE CADASTRO",
                JOptionPane.YES_NO_OPTION);
                        
            if(retorno == 0){
                BDVeiculos.adicionaPasseio();
    
            }
        }
        
        else if (obj.equals(btLimpar)){
            limparCx();
            
            cxPlaca.requestFocus();
        }
        //CADASTRO PASSEIO
        
        //CADASTRO CARGA        
        else if (obj.equals(btCadastrarC)){
            int retorno = JOptionPane.showConfirmDialog(
                null,
                "Deseja cadastrar esse Veiculo na classe CARGA?",
                "CONFIRMAÇÃO DE CADASTRO",
                JOptionPane.YES_NO_OPTION);
                        
            if(retorno == 0){
                BDVeiculos.adicionaCarga();
    
            }
            
        }
        //CADASTRO CARGA        

        //CONSULTAR/EXCLUIR POR PLACA PASSEIO
        else if(obj.equals(btConsultarP)){
            consultaPlacaPasseio();
            
        }
     
        else if(obj.equals(btExcluirP)){
            p = new Passeio();
                
            p.setPlaca(cxPlaca.getText());
                
            bDV.removerPasseio(p);
        }
        //CONSULTAR/EXCLUIR POR PLACA PASSEIO
        
        //CONSULTAR/EXCLUIR POR PLACA CARGA
        else if(obj.equals(btConsultarC)){
            consultaPlacaCarga();
            
        }
        
        else if(obj.equals(btExcluirC)){
            
            c = new Carga();
            c.setPlaca(cxPlaca.getText());
                
            bDV.removerCarga(c);
            
        }
        //CONSULTAR/EXCLUIR POR PLACA CARGA
        
        //IMPRIMIR/EXCLUIR TODOS PASSEIO
        else if (obj.equals(btImprimirAllP)){
            
            if (BDVeiculos.getBDPasseio().isEmpty()) {
                JOptionPane.showMessageDialog(
                null,
                "Não existe nenhum Veiculo do tipo PASSEIO cadastrado",
                "IMPRIME VEICULO PASSEIO",
                JOptionPane.ERROR_MESSAGE);
                
            } else{
                imprimeTabelaPasseio();
                
            }

        }
 
        else if(obj.equals(btExcluirAllP)){
            
            int retorno = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja EXCLUIR TODOS os veiculos cadastrados na classe PASSEIO?",
                "EXCLUIR PASSEIO",
                JOptionPane.YES_NO_OPTION);
            
            if (retorno == 0){
                bDV.getBDPasseio().clear();
            
                JOptionPane.showMessageDialog(
                null,
                "Todos os veiculos do tipo PASSEIO foram EXCLUIDOS",
                "EXCLUIR PASSEIO",
                JOptionPane.INFORMATION_MESSAGE);
                
                imprimeTabelaPasseio();
            }

        }
        //IMPRIMIR/EXCLUIR TODOS PASSEIO
        
        //IMPRIMIR/EXCLUIR TODOS CARGA
        else if (obj.equals(btImprimirAllC)){ 
            
            if (BDVeiculos.getBDCarga().isEmpty()){
                JOptionPane.showMessageDialog(
                null,
                "Não existe nenhum Veiculo do tipo CARGA cadastrado",
                "IMPRIME VEICULO CARGA",
                JOptionPane.ERROR_MESSAGE);
                
            } else{
                imprimeTabelaCarga();
                
            }
        
        }

        else if(obj.equals(btExcluirAllC)){
            
            int retorno = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja EXCLUIR TODOS os veiculos cadastrados na classe CARGA?",
                "EXCLUIR CARGA",
                JOptionPane.YES_NO_OPTION);
            
            if (retorno == 0){
                bDV.getBDCarga().clear();
            
                JOptionPane.showMessageDialog(
                null,
                "Todos os veiculos do tipo CARGA foram EXCLUIDOS",
                "EXCLUIR CARGA",
                JOptionPane.INFORMATION_MESSAGE);
                
                imprimeTabelaCarga();
            }

        }
        //IMPRIMIR/EXCLUIR TODOS CARGA
        
    }
    
    public void consultaPlacaPasseio(){
        p = new Passeio();
                
        p.setPlaca(cxPlaca.getText());
                    
        p = BDVeiculos.procuraPlacaPasseio(p);
                
        if (p == null){
            limparCx(); 
            
            JOptionPane.showMessageDialog(
            null,
            "A Placa informada NAO esta na lista de Veiculos de PASSEIO cadastrados.",
            "CONSULTA PLACA",
            JOptionPane.ERROR_MESSAGE);
                
        } else {
                cxMarca.setText(p.getMarca());
                cxModelo.setText(p.getModelo());
                cxCor.setText(p.getCor());
                cxVelocMax.setText(Integer.toString((p.getVelocMax())));
                cxQtdRodas.setText(Integer.toString(p.getQtdRodas()));
                cxPotencia.setText(Integer.toString(p.getMotor().getPotencia()));
                cxQtdPist.setText(Integer.toString(p.getMotor().getQtdPist()));
                cxQtdPass.setText(Integer.toString(p.getQtdPassageiros()));
            
            }
    }
    
    public void consultaPlacaCarga(){
        c = new Carga();
                
        c.setPlaca(cxPlaca.getText());
                    
        c = BDVeiculos.procuraPlacaCarga(c);
                
        if (c == null){
            limparCx();
                
            JOptionPane.showMessageDialog(
            null,
            "A Placa informada NAO esta na lista de Veiculos de CARGA cadastrados.",
            "CONSULTA PLACA",
            JOptionPane.ERROR_MESSAGE);
                
            } else {
                cxMarca.setText(c.getMarca());
                cxModelo.setText(c.getModelo());
                cxCor.setText(c.getCor());
                cxVelocMax.setText(Integer.toString((c.getVelocMax())));
                cxQtdRodas.setText(Integer.toString(c.getQtdRodas()));
                cxPotencia.setText(Integer.toString(c.getMotor().getPotencia()));
                cxQtdPist.setText(Integer.toString(c.getMotor().getQtdPist()));
                cxTara.setText(Integer.toString(c.getTara()));
                cxCargaMax.setText(Integer.toString(c.getCargaMax()));
            
            }         
    }

    public void imprimeTabelaPasseio(){
        modeloP = new DefaultTableModel(colunasP,0);
            
        for(Passeio p : bDV.getBDPasseio()){
            String[] linha ={
                p.getPlaca(),
                p.getMarca(),
                p.getModelo(),
                p.getCor(),
                Integer.toString(p.getVelocMax()),
                Integer.toString(p.getQtdRodas()),
                Integer.toString(p.getMotor().getPotencia()),
                Integer.toString(p.getMotor().getQtdPist()),
                Integer.toString(p.getQtdPassageiros())
                    
                };  
                
            modeloP.addRow(linha);
                
        }
        tabelaP.setModel(modeloP); 
        
    }
    
    public void imprimeTabelaCarga(){
        modeloC = new DefaultTableModel(colunasC,0);
            
        for(Carga c : bDV.getBDCarga()){
            String[] linha ={
                c.getPlaca(),
                c.getMarca(),
                c.getModelo(),
                c.getCor(),
                Integer.toString(c.getVelocMax()),
                Integer.toString(c.getQtdRodas()),
                Integer.toString(c.getMotor().getPotencia()),
                Integer.toString(c.getMotor().getQtdPist()),
                Integer.toString(c.getTara()),
                Integer.toString(c.getCargaMax())   
                };  
                
            modeloC.addRow(linha);
                
        }
        tabelaC.setModel(modeloC); 
        
    }
    
    public static Passeio cadastroPasseioIG() throws VeicExistException, VelocException, NumberFormatException{
        p = new Passeio();
        
        while(true){
            p.setPlaca(cxPlaca.getText());
            
            if(bDV.procuraPlacaPasseio(p) == null){
                break;
                
            } else{
                limparCx();
                throw new VeicExistException();
 
                }
            
        }
        
        try{
            p.setMarca(cxMarca.getText());
            p.setModelo(cxModelo.getText());
            p.setCor(cxCor.getText());
            p.setQtdRodas(Integer.parseInt(cxQtdRodas.getText()));
            p.getMotor().setPotencia(Integer.parseInt(cxPotencia.getText()));
            p.getMotor().setQtdPist(Integer.parseInt(cxQtdPist.getText()));
            p.setQtdPassageiros(Integer.parseInt(cxQtdPass.getText()));  

            p.setVelocMax(Integer.parseInt(cxVelocMax.getText()));

        }
        
        catch(VelocException ve){
            p.setVelocMax(100);
            ve.velocExceptionPasseio();
            
        }
        
        catch(NumberFormatException nfe){
            throw new NumberFormatException();
            
        }
        
        finally{
            limparCx();
            cxPlaca.requestFocus();
            
        }

        return p;
        
    }
    
    public static Carga cadastroCargaIG() throws VeicExistException, VelocException, NumberFormatException{
        c = new Carga();
        
        while(true){
            c.setPlaca(cxPlaca.getText());
            
            if(bDV.procuraPlacaCarga(c) == null){
                break;
                
            } else{
                limparCx();
                throw new VeicExistException();
 
                }
            
        }
        
        try{
            c.setMarca(cxMarca.getText());
            c.setModelo(cxModelo.getText());
            c.setCor(cxCor.getText());
            c.setQtdRodas(Integer.parseInt(cxQtdRodas.getText()));
            c.getMotor().setPotencia(Integer.parseInt(cxPotencia.getText()));
            c.getMotor().setQtdPist(Integer.parseInt(cxQtdPist.getText()));
            c.setCargaMax(Integer.parseInt(cxCargaMax.getText()));
            c.setTara(Integer.parseInt(cxTara.getText()));
            c.setVelocMax(Integer.parseInt(cxVelocMax.getText()));
        }
        
        catch(VelocException ve){
            c.setVelocMax(100);
            ve.velocExceptionCarga();
            
        }
        
        catch(NumberFormatException nfe){
            throw new NumberFormatException();
            
        }
        
        finally{
            limparCx();
            cxPlaca.requestFocus();
            
        }

        return c;
        
    }
        
    public static void limparCx(){
        cxPlaca.setText("");
        cxMarca.setText("");
        cxModelo.setText("");
        cxCor.setText("");
        cxVelocMax.setText("");
        cxQtdRodas.setText("");
        cxPotencia.setText("");
        cxQtdPist.setText("");
        cxQtdPass.setText("");
        cxTara.setText("");
        cxCargaMax.setText("");
            
    }

}
