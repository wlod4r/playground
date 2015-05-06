package com.gft.mlwz.util;

/**
 * Created by mwlodarczyk on 06/05/15.
 */
public class BinaryConverter {

    public String convertInt(int toConvert) {
        if(toConvert == 0) {
            return "0";
        }

        int remaining = toConvert;
        String converted = "";
        while (remaining != 0) {
            converted = (remaining % 2) + converted;
            remaining = remaining / 2;
        }
        return converted;
    }
}
