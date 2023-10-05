import java.util.Scanner;

class OneZeroPyramidPattern{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of rows you want to print :");
        n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                int x;
                x = i+j;
                if(x%2 == 0)
                {
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }

            System.out.println(" ");
        }
    }
}