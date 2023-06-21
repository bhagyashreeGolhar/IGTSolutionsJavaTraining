public class Method_Overriding {
    public void display()
    {
        System.out.println("Parent display method");
    }

}
class child extends Method_Overriding
{
    public void display()
    {
        System.out.println("Child display method");
    }
    public static void main(String args[])
    {
        child obj=new child();
        obj.display(); // calling child display
        Method_Overriding obj2=new Method_Overriding(); // calling parent display
        obj2.display();
        Method_Overriding obj1 = new child(); // calling childs disply
        obj1.display();
    }
}
