import java.util.Scanner;
import java.util.Random;
public class randomnumber
{
    public static void main(String[] args)
    {
                Scanner sc=new Scanner(System.in);
        double rand=Math.floor(Math.random() * (100 - 1 + 1)) + 1;
        int attempts=5;
        for(int i=0;i<attempts;i++)
        {
                System.out.println("guess the number");
                int guess=sc.nextInt();
                if(guess==rand)
                {
                    System.out.println("you correctly guessed it");
                }
                else if (guess<rand)
                {
                System.out.println("number is greater than guess");
                }
                else if (guess>rand)
                {
                System.out.println("number is smaller than guess");
                }
        }
       
                System.out.println("you have failed and no. of attempts exceeded");
             System.out.println("correct number is"+ rand);
             sc.close();   
    }
