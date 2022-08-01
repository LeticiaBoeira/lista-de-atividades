
import javax.swing.JOptionPane; 
   public class Atv_10 {
   public static void main(String[] args) {
    String aux = "";
    float peso= 0, altura= 0, imc= 0;
      try{
         aux=JOptionPane.showInputDialog(null, "Peso: ");
         peso = Float.parseFloat(aux);

         aux=JOptionPane.showInputDialog(null, "Altura: ");
         altura = Float.parseFloat(aux);

         imc = peso/(altura*altura); 
            if (imc < 18.5)
            JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + ", Peso abaixo do normal");
            else 
               if (imc > 18.5 && imc <  24.4) 
               JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + ", Peso ideal");  
               else 
                  if (imc > 24.5 && imc < 29.9) 
                  JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + ", Pré-obesidade");  
                  else 
                     if (imc > 30 && imc <  34.9) 
                     JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + ", Obesidade classe 1");  
                     else
                        if (imc > 35 && imc <  39.9) 
                        JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + ", Obesidade severa");  
                        else 
                           if (imc >= 40)
                           JOptionPane.showMessageDialog(null, "Seu imc é: " + imc + ", Obesidade mórbida");
      }
      catch(NumberFormatException erro){
      JOptionPane.showMessageDialog(null, "Houve um erro!");
      }
      }
      }
   
          

