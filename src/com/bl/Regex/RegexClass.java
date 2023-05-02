package com.bl.Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexClass {
    static Pattern pattern = Pattern.compile("^[A-Z a-z]{3,}$");

    public static void main(String[] args) {
        String str = "Reg";
        Matcher m = pattern.matcher(str);
        if (m.matches()) {
            System.out.println("valid last name");
        }
        else {
            System.out.println("invalid last name");
        }
    }
}
