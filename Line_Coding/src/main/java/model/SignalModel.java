/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author adkm2
 */
public class  SignalModel {
    private String text;
    private List<Boolean> bits;

    public SignalModel() {
    }
    
    public List<Boolean> textToBin (String text) {
        
        Charset cs = StandardCharsets.UTF_8;
        byte[] bytes = text.getBytes(cs);
        bits = new ArrayList<>(bytes.length*8);
        
        for (byte b : bytes) {
            for (int i = 7; i >=0; i--) {
                bits.add(((b >> i) & 1) == 1);
            }
        }
        return bits;
    }
       public List<Boolean> getBits() {
        return bits;
    }

    public String getText() {
        return text;
    }

    public void setBits(List<Boolean> bits) {
        this.bits = bits;
    }

    public void setText(String text) {
        this.text = text;
    }
}
