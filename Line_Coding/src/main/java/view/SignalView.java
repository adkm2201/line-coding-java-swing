/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.SignalController;
import java.util.List;
import model.SignalModel;

/**
 *
 * @author adkm2
 */
public class SignalView {
    private SignalController controller;
    private SignalModel signal;
    
    public void displayBits (List<Boolean> bits) {
        int count = 0;
        for (Boolean bit : bits) {
            System.out.print(bit ? 1 : 0);
            count++;
            if (count % 8 == 0) {
                System.out.printf(" ");              
                count = 0;
            }
        }
    }
    
    public void displayText (String text) {
        System.out.println(text);
    }
}
