import java.util.Scanner;

public class Test_input
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Seeing if this accepts inputs:");
        String test = in.next();
        System.out.println(test);
        in.close();
    }
}