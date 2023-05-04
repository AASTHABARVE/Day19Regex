package com.bl.Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexClass {
    static Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z]{8}$");

    public static void main(String[] args) {
        String str = "AasthaxyZ";
        Matcher m = pattern.matcher(str);
        if (m.matches()) {
            System.out.println("valid Password");
        }
        else {
            System.out.println("invalid Password");
        }
    }
}
