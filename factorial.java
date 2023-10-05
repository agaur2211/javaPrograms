import java.util.Scanner;

class factorial{
    public static int fact(int n)
    {
        if (n < 0)
        {
            System.out.println("Invalid number");
            
        }
        int fac = 1;
        for (int i = n; i>=1; i--)
        {
            fac = fac*i;
        }

        return fac;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the factorial : ");
        int n = sc.nextInt();

        System.out.println("The factorial of the number is : ");
        int fac = fact(n);
        System.out.println(fac);
    }
}