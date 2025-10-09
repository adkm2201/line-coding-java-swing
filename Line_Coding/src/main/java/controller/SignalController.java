/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import encoding.SignalEncoder;
import java.util.List;
import model.SignalModel;
import view.InputForm;
import view.SignalView;

/**
 *
 * @author adkm2
 */
public class SignalController {
    private SignalEncoder encoder;  
    private SignalModel signal;
    private InputForm inputForm;
    private SignalView signalView;
    
    public List signalEncoder (String text) {
        encoder = new SignalEncoder();
        return encoder.textToBin(text);   
    }
    
    public void displayBits (List<Boolean> bits) {
        signalView = new SignalView();
        signalView.displayBits(bits);
    }
    
    public void loadInputForm () {
        inputForm = new InputForm();
        inputForm.setVisible(true);
    }
}
