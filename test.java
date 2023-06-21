 class abc
{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class test {
    public static void main(String[] args) {
     System.out.println("Hello world"); 
     abc obj=new abc();
     int sum=obj.add(10,20);
     System.out.println("Sum is with 2parameter function:"+ sum);
     sum=obj.add(10,20,30);
     System.out.println("Sum is with 3 parameters function "+ sum);


    }
}
