import java.util.Scanner;

class IncreasingNumbersPyramidPattern {
    public static void main(String args[])
    {
        int n;
        int number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows of the pyramid do you want to print : ");
        n = sc.nextInt();

        for(int i = 1; i<= n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(" " +number);
                number++;
            }
            System.out.println(" ");
        }

    }
}