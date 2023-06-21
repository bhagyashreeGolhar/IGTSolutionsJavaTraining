final public class FinalKeyword {
    final int a=10 ;

    final void display()
    {
        System.out.println("Value of a is ",a);
    }
    
}
class child extends FinalKeyword  // can not override final class
{
    void display()   //Can not override final method
    {
        System.out.println("This is child diplay method");
    }
}
