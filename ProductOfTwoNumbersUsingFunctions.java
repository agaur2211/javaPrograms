import java.util.Scanner;

class ProductOfTwoNumbersUsingFunctions {
    public static float product(float a, float b)
    {
        float pro = a*b;
        return pro;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        float a = sc.nextFloat();

        System.out.println("Enter the value of b : ");
        float b = sc.nextFloat();

        System.out.print("The product of the a and b is : ");
        float pro = product(a, b);
        System.out.println(pro);
    }
}
