package task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    public static void main(String[] args) {
        String login = "Ed";
        String password = "1234";
        Pattern patternLogin = Pattern.compile("[a-zA-Z]+");
        Pattern patternPassword = Pattern.compile("\\d+");
        Matcher matcherLogin = patternLogin.matcher(login);
        Matcher matcherPassword = patternPassword.matcher(password);
        if(matcherLogin.matches()&&matcherPassword.matches()){
            System.out.println("Correct!!!");
       } else {
            System.out.println("Change login and password");}
    }
}
