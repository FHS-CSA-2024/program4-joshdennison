//Youre on your own!!
//Jk ask for help if you need it (but also look at previous programs!!)
import java. util. Scanner;
public class main
{
    public static void main(String[] args)
    {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner num3 = new Scanner(System.in);
        Scanner num4 = new Scanner(System.in);
        System.out.print("enter first number ");
        int Num1 = num1.nextInt();
         System.out.print("enter second number ");
        int Num2 = num2.nextInt();
         System.out.print("enter third number ");
        int Num3 = num3.nextInt();
         System.out.print("enter fourth number ");
        int Num4 = num4.nextInt();
        int sum = (Num1+Num2+Num3+Num4);
        System.out.println("the sum is  "+ sum);
        double avg = (double) sum/4;
        System.out.print( "the average is " + avg);
        
    }
}


//Paste console output below:
/*
enter first number 475
enter second number 821
enter third number 369
enter fourth number 562
the sum is  2227
the average is 556.75


*/
