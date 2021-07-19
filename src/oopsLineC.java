import java.util.Scanner;

public class oopsLineC {
	public int Line(int X1, int X2,int Y1,int Y2)
    {
        int a = (int) Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        return a;

    }
    public int Line2(int A1, int A2,int B1,int B2)
    {
        int b= (int) Math.sqrt((A2 - A1) * (A2 - A1) + (B2 - B1) * (B2 - B1));
        return b;
    }
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for line_1");
        System.out.println("X1 is");
        int x1 = sc.nextInt();

        System.out.println("Y1 is");
        int y1 = sc.nextInt();

        System.out.println("Enter value for line_2");
        System.out.println("X2 is");
        int x2 = sc.nextInt();

        System.out.println("Y2 is");
        int y2 = sc.nextInt();

        System.out.println("Enter value for line_1");
        System.out.println("a1 is");
        int a1 = sc.nextInt();

        System.out.println("b1 is");
        int b1 = sc.nextInt();

        System.out.println("Enter value for line_2");
        System.out.println("a2 is");
        int a2 = sc.nextInt();

        System.out.println("b2 is");
        int b2 = sc.nextInt();


        oopsLineC obj=new oopsLineC();
        int length=obj.Line(x1,x2,y1,y2);
        int length2=obj.Line2(a1,a2,b1,b2);
        if(length == length2)
        {
            System.out.println("line are equal");
        }
        else
        {
            System.out.println("lines are not equal");
        }
        Integer input = (int) length;

        Integer input1 = (int) length2;
        int result= Double.compare(length,length2);
        System.out.println("result");
        if (result==0) {
            System.out.println("Equals");
        }
        else if (result>0)	{
            System.out.println("line1 is Greater");
        }
        else {
            System.out.println("line2 is Greater");
        }
    }

}
