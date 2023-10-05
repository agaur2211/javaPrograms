import java.util.Scanner;

class InputInJava{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println("Enter the first number :");
        a = sc.nextInt();
        System.out.println("Enter the second number :");
        b = sc.nextInt();

        int c = a+b;
        System.out.println("The sum of two numbers given is : " +c);
    }
}