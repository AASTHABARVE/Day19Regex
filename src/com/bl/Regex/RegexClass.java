package com.bl.Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexClass {
    static Pattern pattern = Pattern.compile("^(?=[1-9a-zA-Z])(?=.*[A-Z]).{8}");
// at least 1 upper case ("^(?=[1-9a-zA-Z])(?=.*[A-Z]).{8}");

    public static void main(String[] args) {
        String str = "asthS";
        Matcher m = pattern.matcher(str);
        if (m.matches()) {
            System.out.println("valid Password");
        }
        else {
            System.out.println("invalid Password");
        }
    }
}
