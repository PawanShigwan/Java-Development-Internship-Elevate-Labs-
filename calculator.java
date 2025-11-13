
import java.util.Scanner;

interface calc {

    int operations();
}

//    int add()
//    {
//        return a+b;
//    }
//
//    int sub()
//    {
//        return a-b;
//    }
//
//    int mul()
//    {
//        return a*b;
//    }
//
//    int div()
//    {
//        return a/b;
//    }

class calcoperation implements calc
{
    int a,b;
    Character s;
    calcoperation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 2 numbers:");
        this.a=sc.nextInt();
        this.b=sc.nextInt();
        System.out.print("Enter operation(+,-,*,/):");
        this.s=sc.next().charAt(0);
    }

    public int operations()
    {
        if (s=='+')
        {
            return a+b;
        }
        else if(s=='-')
        {
            return a-b;
        }
        else if(s=='*')
        {
            return a*b;
        }
        else {
            return a/b;
        }
    }



}

public class calculator {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int exit=0;

       while(exit==0)
       {
           System.out.print("Do want close 1-Yes,0-No:");
           exit=sc.nextInt();
           if(exit!=1)
           {
               System.out.println("Result:"+new calcoperation().operations());
           }


       }


    }
}
