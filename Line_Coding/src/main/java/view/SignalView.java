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
    private SignalController controller = new SignalController();
    
    public String displayBits (String text) {
        int count = 0;
        List<Boolean> bits = controller.signalEncoder(text);
        StringBuilder sb = new StringBuilder();
        for (Boolean bit : bits) {
            sb.append(bit ? '1' : '0');
            count++;
            if (count % 8 == 0) {
                sb.append(' ');              
                count = 0;
            }
        }
        return sb.toString();
    }
    
    public void displayText (String text) {
        System.out.println(text);
    }
}
