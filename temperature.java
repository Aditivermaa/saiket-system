import java.util.Scanner;
public class temperatureconverter
{
    public static double convertcelsiustofahrenhit(double celsius)
    {
        double f=(celsius*9/5)+32;
        return f;
    }
    public static double convertfahrenhittocelsius(double fahrenheit)
    {
        double c=(fahrenheit-32)*5/9;
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("temperature converter");
        System.out.println("1.celsius to fahrenheit");
                System.out.println("2.fahrenheit to celsius");
            System.out.println("enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
               { double t=sc.nextDouble();
                double r=convertcelsiustofahrenhit(t);
                System.out.println(r);
                break;
               }
            case 2:
                {double t=sc.nextDouble();
              double r=convertfahrenhittocelsius(t);
              System.out.println(r);
                break;
                }
            default:
            System.out.println("invalid choice");
        
    }
        sc.close();
    }
}