/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package encoding;

import java.util.ArrayList;
import java.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/**
 *
 * @author adkm2
 */
public class  SignalEncoder {
    public List textToBin (String text) {
        
        Charset cs = StandardCharsets.US_ASCII;
        byte[] bytes = text.getBytes(cs);
        List<Boolean> bits = new ArrayList<>(bytes.length*8);
        
        for (byte b : bytes) {
            for (int i = 7; i >=0; i--) {
                bits.add(((b >> i) & 1) == 1);
            }
        }
        return bits;
    }
   
}
