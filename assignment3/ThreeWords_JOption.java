package assignment3;
import javax.swing.JOptionPane;

//@author kennel
public class ThreeWords_JOption {
    
    public static void main(String[] args) {
        
        String word1 = "";
        String word2 = "";
        String word3 = "";
        
        word1 = JOptionPane.showInputDialog("Enter Word 1");
        word2 = JOptionPane.showInputDialog("Enter Word 2");
        word3 = JOptionPane.showInputDialog("Enter Word 3");
        
        String msg = word1 + " " + word2 + " " + word3;
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
}
