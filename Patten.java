import java.util.Scanner;

public class Patten{
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = b.nextLine();

        String reversed = "";
        
        // Loop from the last character to the first
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed =reversed+ s.charAt(i);
        }
        
        System.out.println(reversed);
        
        b.close();
    }
}
