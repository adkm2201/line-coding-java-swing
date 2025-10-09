/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adkm2
 */
public class SignalModel {
    private String text;
    private Charset cs;
    private byte[] bytes;
    private List<Boolean> bits;

    public SignalModel(String text, Charset cs) {
        this.text = text;
        this.cs = cs;
        bytes = this.text.getBytes(cs);
        bits = new ArrayList<>(bytes.length * 8);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Charset getCs() {
        return cs;
    }

    public void setCs(Charset cs) {
        this.cs = cs;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public List<Boolean> getBits() {
        return bits;
    }

    public void setBits(List<Boolean> bits) {
        this.bits = bits;
    }
    
    
}
