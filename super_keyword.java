class parent
{
    int a=10;
    parent()
    {
        System.out.println("This is parent class Constructor");
    }
    public void display()
    {
        System.out.println("This is parent class display method");
    }
   
}

class child extends parent
{
    int a=20;
    {a=50;} //instance initializer block
    child()
    {
       // super();
        System.out.println("This is child class constructor");
    }
    public void display()
    {
        super.display();
        System.out.println("This is child class display method");
        System.out.println("Value of 'a' from child class"+a);
        System.out.println("Value of 'a' from parent class"+ super.a);

    }
}
public class super_keyword {
    /**
     * @param args
     */
    public static void main(String args[])
    {
        child obj=new child();
        obj.display();
    }
}


