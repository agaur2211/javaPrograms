import java.util.Scanner;

class HollowRectanglePattern
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the number of rows you want to insert : ");
        n = sc.nextInt();
        System.out.println("Enter the number of columns you want to print : ");
        m = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=m; j++)
            {
                if(i == 1 || j == 1 || i == n || j == m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}