import java.util.Scanner;

class AreaOfRectangle
{
    public static void main(String args[])
    {
        Scanner yt = new Scanner(System.in);
        int length, breadth;
        System.out.println("Enter the length of the rectangle  :");
        length = yt.nextInt();
        System.out.println("Enter the breadth of the rectangle  :");
        breadth = yt.nextInt();
        int area = length*breadth;
        System.out.println("The area of the rectangle is : " +area);
        int peri = 2*(length + breadth);
        System.out.println("The perimeter of the given rectangle is : " +peri);


    }
}