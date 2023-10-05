import java.util.Scanner;

class Switch{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter the button number: ");
        a = sc.nextInt();

        switch (a)
        {
            case 1:
            System.out.println("Namaste");
            break;

            case 2:
            System.out.println("Hola amigo!");
            break;

            case 3:
            System.out.println("Hello");
            break;

        }
    }
}