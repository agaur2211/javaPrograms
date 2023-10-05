import java.util.Scanner;

class CallingNameUsingFunctions{
    public static void MyName(String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        

        System.out.print("Hello! ");
        MyName(name);//called the function in this line
    }
}
