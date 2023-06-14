import javax.swing.JOptionPane;

public class NewInfo {
    
    public static void main (String [] args) {
        //Declaração de variáveis
        int idade; //armazena o valor da idade
        
        System.out.println("+++ Bem-vindo a NewInfo +++");
        System.out.println("Para que você seja encaminhado a fila correta, " + "informe sua idade corretamente.");
        
        //entrada de dados
        try {
            idade = Integer.parseInt(JOptionPane.showInputDialog("Por favor, " + "informe sua idade:"));

            if (idade > 80){
                JOptionPane.showMessageDialog(null, "Por favor," + " dirija-se a fila prioritária 80+.");
            } else {
                if (idade >= 60) {
                    JOptionPane.showMessageDialog(null, "Por favor," + " dirija-se a fila prioritária.");
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor," + "dirija-se a fila comum.");
                }
            } //fim do if
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Informe a idade " + "corretamente", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        } //fim do try-catch
    } //fim do main
} // fim da classe
