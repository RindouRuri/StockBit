import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      
        Scanner scanner = new Scanner(System.in);
      
        String inputTxt = scanner.nextLine();
      
        System.out.println(findFirstStringInBracket(inputTxt));
    }
    
    public static String findFirstStringInBracket(String inputTxt)
    {
         if(inputTxt.length() > 0 && inputTxt.contains("(") && inputTxt.contains(")"))
        {
            return (inputTxt.substring(inputTxt.indexOf("(") + 1, inputTxt.indexOf(")")));
        }
        else
            return "";
    }
}
