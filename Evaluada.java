/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author Mauricio
 */
public class Evaluada {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        String nom="", ap="";
        double sal=0, salf=0, dedgob=0, sem=0, ivm=0, dedgens=0, aso=0;
        nom=JOptionPane.showInputDialog("Digite su nombre: ");
        ap=JOptionPane.showInputDialog("Digite su apellido: ");
        sal=Double.parseDouble(JOptionPane.showInputDialog("Digite su salario"));
        salf=+sal;
 
        if(sal>=2373000){
            salf=sal*0.80;
            dedgob=sal*0.20;
        }
        if (sal<2373000 && sal>=1352000){
            salf=sal*0.85;
            dedgob=sal*0.15;
        }
        if (sal<1352000 && sal>=922000){
            salf=sal*0.90;
            dedgob=sal*0.10;
        }
        sem=sal*0.0925;
        ivm=sal*0.0508;
        dedgens=sem+ivm;
        salf=salf-dedgens;
        aso=sal*0.025;
        salf=salf-aso;
        JOptionPane.showMessageDialog(null, "Hola "+nom+" "+ap+". Su salario es "+sal+" despues de deducciones el salario final es de "+salf+"\n Las deducciones fueron IVM y SEM: "+dedgens+ ", Impuestos: "+dedgob+ ", Asociacion: "+aso);
                
        
        
               
                
        
        
        
        
        
    }
    
}
