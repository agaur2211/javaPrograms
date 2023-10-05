import java.util.Scanner;

class SumOfNumbersUsingFunctions{
    public static float Sumprint(float a, float b)
    {
        float sum = a + b;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        float a = sc.nextFloat();
        System.out.println("Enter the value of b : ");
        float b = sc.nextFloat();


        System.out.println("The sum of a and b is");
        float sum = Sumprint(a, b);//called the function
        System.out.println(sum);
    }
}