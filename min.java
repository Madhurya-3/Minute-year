import java.util.*;
class minute
{
    long num,n,yr,day,m,d;
    Scanner sc= new Scanner(System.in);
    void input()
    {
        System.out.println("Enter a long integer");
        n=sc.nextInt();num=n;
    }
    void cal()
    {
		d=60*24*365;
		yr=n/d;
		n=n-(yr*d);
		m=60*24;
		day=n/m;
    }
    void output()
    {
        System.out.println(num+" minutes is approximately "+yr+" years "+day+" days ");
    }
    public static void main()
    { 
        minute ob= new minute();
        ob.input();
        ob.cal();
        ob.output();
    }
}
