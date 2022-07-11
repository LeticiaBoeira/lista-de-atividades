import java.util.Scanner;
import javax.swing.JOptionPane;

    public class atv_Emanuel {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
           Integer idade;
            System.out.println("Informe sua idade:");
            
            idade = input.nextInt();
           
            if (idade > 0 && idade <= 2){
                JOptionPane.showMessageDialog(null,"Bebê");
            }
                  if (idade >= 3  && idade <= 11){
                    JOptionPane.showMessageDialog(null, "Criança");
                }
        
                    if (idade >= 12 && idade <= 19){
                        JOptionPane.showMessageDialog(null, "Adolescente");
                    }
                        if (idade >= 20 && idade <= 30){
                            JOptionPane.showMessageDialog(null,"Jovem" );
                        }
                            if (idade >= 31 && idade <= 60){
                                JOptionPane.showMessageDialog(null,"Adulto");
                            }
                                if (idade > 60){
                                    JOptionPane.showMessageDialog(null,"Idoso");
                                }
                            }
                                               
}
