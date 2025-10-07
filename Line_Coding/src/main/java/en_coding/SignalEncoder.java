/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package en_coding;

import model.SignalDisplayData;
import model.SignalType;
/**
 *
 * @author adkm2
 */
public interface SignalEncoder {
    boolean[] textToBin (String text);
    String getEncodingName();
    SignalType getType();
    SignalDisplayData displayData (boolean[] bin);
}
