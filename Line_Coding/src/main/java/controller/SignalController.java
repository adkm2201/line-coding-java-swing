/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import encoding.SignalEncoder;
import java.awt.Graphics;
import java.util.List;
import java.util.concurrent.Phaser;
import model.SignalModel;
import view.modulation.AmplitudeModulation;
import view.modulation.FrequencyModulation;
import view.InputForm;
import view.digital.ManchesterPanel;
import view.digital.NRZPanel;
import view.modulation.FrequencyModulation;
import view.modulation.PhaseModulation;
import view.SignalView;
import view.Waveform;

/**
 *
 * @author adkm2
 */
public class SignalController {
    private SignalEncoder encoder;  
    private SignalModel signal;
    private InputForm inputForm;
    private SignalView signalView;
    private Waveform waveform;
    private NRZPanel nrz;
    private ManchesterPanel manchester;
    private AmplitudeModulation amplitude;
    private FrequencyModulation frequency;
    private PhaseModulation phase;
    
    
    public List signalEncoder (String text) {
        encoder = new SignalEncoder();
        return encoder.textToBin(text);   
    }
    
    public String displayBits (String text) {
        signalView = new SignalView();
        return signalView.displayBits(text);
    }
    
    public void loadInputForm () {
        inputForm = new InputForm();
        inputForm.setVisible(true);
    }
    
    public void showNRZ (List<Boolean> bits) {
        nrz = new NRZPanel(bits);
        JFrame frame = new JFrame("NRZ Signal");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JScrollPane scroll = new JScrollPane(nrz,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        frame.getContentPane().add(scroll);
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void showManchester (List<Boolean> bits) {
        manchester = new ManchesterPanel(bits);
        javax.swing.JFrame frame = new javax.swing.JFrame("Manchester Signal");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(manchester,
                javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.getContentPane().add(scroll);
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void showAmplitude (List<Boolean> bits) {
        amplitude = new AmplitudeModulation(bits);
        javax.swing.JFrame frame = new javax.swing.JFrame("Amplitude Modulation");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(amplitude,
                javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.getContentPane().add(scroll);
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public void showFrequency (List<Boolean> bits) {
        frequency = new FrequencyModulation(bits);
        javax.swing.JFrame frame = new javax.swing.JFrame("Frequency Modulation");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(frequency,
                javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.getContentPane().add(scroll);
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
        
    public void showPhase (List<Boolean> bits) {
        phase = new PhaseModulation(bits);
        javax.swing.JFrame frame = new javax.swing.JFrame("Phase Modulation");
        frame.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(phase,
                javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.getContentPane().add(scroll);
        frame.setSize(900, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
