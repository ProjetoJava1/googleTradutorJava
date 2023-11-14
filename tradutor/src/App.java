import javax.swing.*;

public class App
{
    public static void main(String entrada[]) 
    {
        String nome;
        // int idade;

        nome = (JOptionPane.showInputDialog("Digite seu nome"));

        JOptionPane.showMessageDialog(null, nome);
        
        System.exit(0);
    }
}