import java.util.Scanner;
//gun pattern
class GunPattern{
    public static void main(String args[])
    {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print : ");
        n = sc.nextInt();
        System.out.println("Enter the number of columns you want to print : ");
        m = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=m; j++)
            {
                if (i ==1 || i == 2 || j == m || j == m - 1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}