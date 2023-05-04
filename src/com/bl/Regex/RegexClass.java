package com.bl.Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexClass {
    static Pattern pattern = Pattern.compile("^(0|91)\\s?[7-9][0-9]{9}$");

    public static void main(String[] args) {
        String str = "91 9919819801";
        Matcher m = pattern.matcher(str);
        if (m.matches()) {
            System.out.println("valid Number");
        }
        else {
            System.out.println("invalid Number");
        }
    }
}
