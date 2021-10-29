/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formula1;

import formula1.controllers.Controller;
import formula1.models.ModeloBD;
import formula1.view.View;

/**
 *
 * @author JESCOBAR
 */
public class Formula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            ModeloBD model = new ModeloBD();
            View view = new View();
            view.setVisible(true);
            
            
           Controller controller = new Controller(model,view);
    }
    
}
