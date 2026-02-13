import java.util.Scanner;
public class calculator
{
     public static double addition(double a,double b)
    {
        double c=a+b;
        return c;
    }
      public static double subtraction(double a,double b)
    {
        double c=a-b;
        return c;
    }
      public static double multiplication(double a,double b)
    {
        double c=a*b;
        return c;
    }
      public static double division(double a,double b)
    {
        if(a>b)
            {
        double c=a/b;
        return c;
    }
    else{
        
        double c=b/a;
        return c;
    }
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("calculator");
        System.out.println("enter first number");
int number1=sc.nextInt();
        System.out.println("enter second number");
int number2=sc.nextInt();
System.out.println("perform arithematic operations");
System.out.println("1.addition");
System.out.println("2.subtraction");
System.out.println("3.multiplication");
System.out.println("4.divisions");
System.out.println("5.exit");
System.out.println("enter your choice of operation");
int choice=sc.nextInt();
switch(choice)
{
    case 1:
        {
            double result;
                result=addition(number1,number2);
                System.out.println(result);
                break;
        }
         case 2:
        {
            double result;
                result=subtraction(number1,number2);
                System.out.println(result);
                break;
        }
         case 3:
        {
            double result;
                result=multiplication(number1,number2);
                System.out.println(result);
                break;
        }
         case 4:
        {
            double result;
                result=division(number1,number2);
                System.out.println(result);
                break;
        }
        case 5:
                    System.out.println("Exiting...");
                    break;
        default:
        System.out.println("invalid choice");
}
    }
}