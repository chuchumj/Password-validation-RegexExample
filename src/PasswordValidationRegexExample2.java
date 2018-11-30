///Program for validation of password for a certain format specified by the Regex
import java.util.regex.*;
import java.util.Scanner;
public class PasswordValidationRegexExample2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        scan.nextLine();
        System.out.println("Choose a password");
        System.out.println("Password should start with any 4 letters, followed by one \"@\" symbol,followed by one \".\", then any digit from 0-9");
        Pattern p3 = Pattern.compile("[a-zA-Z]{4}@{1}.{1}\\d");
        Matcher m3 = p3.matcher(scan.nextLine());
        if (m3.matches()) {
        System.out.println(" Valid password selected");
        } else {
        System.out.println("Invalid password inputted");
        }
        scan.close();
    }
}
