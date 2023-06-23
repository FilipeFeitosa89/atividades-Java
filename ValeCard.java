import javax.swing.JOptionPane;

public class ValeCard {
        //Exercício switch/case

    public static void main (String [] args) {
        
        //Declaração de dados
        int final_placa;
        
        //Entrada de dados
        try {
            final_placa = Integer.parseInt(JOptionPane.showInputDialog("Insira o número final da placa de seu veículo."));
            
            switch (final_placa) {
                case 1 -> JOptionPane.showMessageDialog(null,"Pagamento até 30/04");
                    
                case 2 -> JOptionPane.showMessageDialog(null,"Pagamento até 31/05");
                    
                case 3 -> JOptionPane.showMessageDialog(null, "Pagamento até 30/06");
                    
                case 4 -> JOptionPane.showMessageDialog(null,"Pagamento até 31/07");
                    
                case 5 -> JOptionPane.showMessageDialog(null,"Pagamento até 31/08");
                    
                case 6 -> JOptionPane.showMessageDialog(null,"Pagamento até 30/09");
                
                case 7 -> JOptionPane.showMessageDialog(null,"Pagamento até 31/10");
                    
                case 8 -> JOptionPane.showMessageDialog(null,"Pagamento até 30/11");
                    
                case 9, 0 -> JOptionPane.showMessageDialog(null,"Pagamento até 31/12");

                default -> JOptionPane.showMessageDialog(null,"Insira somente o último número da placa");
            }
        } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Entre somente com números válidos", "ERRO", JOptionPane.ERROR_MESSAGE);
        }//fim do try/catch 
    }//fim do main
}//fim da classe