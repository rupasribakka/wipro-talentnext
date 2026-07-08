package String_StringBuffer;
import java.util.Scanner;
public class HandsOnAssignment5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        if (s.length() > 2){
            System.out.println(s.substring(1, s.length() - 1));
        } else {
            System.out.println("");
        }
        sc.close();
    }
}