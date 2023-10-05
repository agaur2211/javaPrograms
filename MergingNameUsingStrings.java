import java.util.Scanner;

class MergingNameUsingStrings{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String first = sc.nextLine();

        System.out.println("Enter the second name : ");
        String second = sc.nextLine();

        String name = first +" "+ second;

        System.out.println("Your full name is :" + name);

        System.out.println(name.length());

       // for(int i = 0; i<=name.length(); i++)
       // {
       //     System.out.println(name.charAt(i));
       // }

        if(first.compareTo(second) == 0)
        {
            System.out.println("The first name and second name are equal");
        }

        else
        {
            System.out.println("First name and second name are not equal");
        }

    }
}