import java.util.ArrayList;
import java.util.Scanner;
class task
{
    String title;
    boolean complete;
    task(String title)
    {
        this.title=title;
        this.complete=false;
    }
}
public class todolist
{
    public static void main(String[] args)
    {
        ArrayList<task>tasks=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
int choice;
System.out.println("\n    to do list    ");
System.out.println("1. add task");
System.out.println("2. mark task complete");
System.out.println("3. view task");
System.out.println("4. exit task");
System.out.println("enter your choice");
choice=sc.nextInt();
switch(choice)
{
case 1:
    {
                sc.nextLine(); // consume newline
        System.out.println("enter new task title");
        String title = sc.nextLine();
        tasks.add(new task(title));
        System.out.println("new task added succesfully");
break;
    }
    case 2:
        {
            if(tasks.isEmpty())
            {
                System.out.println("no task to complete");
            }
                            System.out.println("enter task number");
            int index=sc.nextInt()-1;
                if(index >=0 && index < tasks.size())
                {
                tasks.get(index).complete = true;

                    System.out.println("task completed");
                }
                else {
                        System.out.println("Invalid task number");
                    }
                break;

         }
        
        case 3:
            {
                if(tasks.isEmpty())
             {       System.out.println("no task present");
            }
            else{
                for(int i=0;i<tasks.size();i++)
                {
                    String status=tasks.get(i).complete?"done":"pending";
                    System.out.println((i+1)+"."+tasks.get(i).title+"-"+ status);
                }
            }
            break;
}
case 4:
                    System.out.println("Exiting...");
                    break;
        default:
        System.out.println("invalid choice");
}
    
    }
 

}