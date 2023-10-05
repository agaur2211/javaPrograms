import java.util.Scanner;

class RectangleStarPattern 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("Enter the number of the rows you want to insert : ");
        i = sc.nextInt();

        System.out.println("enter the number of columns to be inerted in the pattern : ");
        j = sc.nextInt();

        //now we will print the pattern using for loop
        for(int a = 0; a <= i; a++)
        {
            for(int b = 0; b<=j; b++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}