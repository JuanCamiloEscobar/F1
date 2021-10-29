/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formula1.controllers;

import formula1.models.ModeloBD;
import formula1.view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author JESCOBAR
 */
public class Controller implements ActionListener {
    
    ModeloBD model = new ModeloBD();
    View view = new View();

    public Controller(ModeloBD model, View view) {
        this.model=model;
        this.model=model;
        view.button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        model.conectar();
        
    }
    
    
    
    
}
