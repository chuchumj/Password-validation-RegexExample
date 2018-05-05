import java.util.regex.*;
import java.util.Scanner;
public class RegexExample2 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Pattern p3 = Pattern.compile("[a-zA-Z]{4}@{1}.{1}\\d");
        System.out.println("Enter your email");
        scan.nextLine();
        System.out.println("Choose a password");
        System.out.println("Password should start with any 4 letters, followed by one \"@\" symbol,followed by one \".\" symbol, then any digit from 0-9");
        Matcher m3 = p3.matcher(scan.nextLine());
        if (m3.matches()) {
        System.out.println(" Valid password selected");
        } else {
        System.out.println("Invalid password inputted");
        }
        scan.close();
    }
}
