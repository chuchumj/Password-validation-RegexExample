import java.util.regex.*;
public class RegexProject {
    public static void main(String args[]) {         //s: matches anything that is a whitespace
        Pattern p = Pattern.compile("..\\sa\\S*");// S: matches anything that is not whitespace
        Matcher m = p.matcher("te a9999999"); // * : is it the end of the line?
        System.out.println(m.matches());

       // Pattern p1 = Pattern.compile("^..a$"); // ^ : is it the beginning of the line?
       // Matcher m1 = p1.matcher("tea");     // $: is it the end of the line?
        System.out.println(Pattern.compile("^..a$").matcher("tea").matches());

        //Pattern p2 = Pattern.compile("....?...\\s.....s+io?n"); //+ matches one or more of the previous element
       // Matcher m2 = p2.matcher("Regular Expression");      // ?: matches 0 or more occurence of he previous element
        System.out.println(Pattern.matches("....?...\\s.....s+io?n","Regular Expression" )); // true

    }

}
