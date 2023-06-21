abstract public class child  {
    abstract void display();
  
}
class AbstractClass extends child
{
    void display()
    {
        System.out.println("This implemented Abstract method of abstractClass");
    }
    public static void main(String[] args) {
        child obj=new AbstractClass();
        obj.display();
    }
}
