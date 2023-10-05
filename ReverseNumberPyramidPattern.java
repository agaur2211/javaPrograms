import java.util.Scanner;

class ReverseNumberPyramidPattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("ENter te number of rows you want to insert in the pyramind : ");
        n = sc.nextInt();
        int i, j;

        for(i = n; i >= 1; i--)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("" +j);
            }

            System.out.println(" ");
        }
    }
}