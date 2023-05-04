package com.bl.Regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegexClass {
    static Pattern pattern = Pattern.compile("^[a-zA-Z+_.-]+\\.[A-Za-z+_.-]+@(?:[a-z])+(?:\\.[a-zA-Z]{2})+(?:\\.[a-zA-Z)]{2})$");

    public static void main(String[] args) {
        String str = "abc.xyz@bl.co.in";
        Matcher m = pattern.matcher(str);
        if (m.matches()) {
            System.out.println("valid email");
        }
        else {
            System.out.println("invalid email");
        }
    }
}
