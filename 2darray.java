import java.util.Scanner;

class darray{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int rows, columns;
        System.out.println("Enter the rows in the array : ");
        rows = sc.nextInt();
        System.out.println("Enter the numbers of columns in the array : ");
        columns = sc.nextInt();

        int[][] marks = new int[rows][columns];

        for(int i = 1; i<rows; i++)
        {
            for(int j = 1; j<columns; j++)
            {
                System.out.println("enter the elements of the array :");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i<rows; i++)
        {
            for (int j = 1; j<columns; j++)
            {
                System.out.print.(marks[i][j]);
            }
        }

    }

}