class Animal{
    public void run(){
        System.out.println("Animal is running");
    }
}
class cat extends Animal
{
    public void run()
    {
        System.out.println("Cat is Running");
    }
}
class dog extends Animal
{
    public void run()
    {
        System.out.println("Dog is running");
    }
}
public class polymorphism
{
    public static void main(String[] args) {

        Animal obj;
        obj=new Animal();
        obj.run();
        obj=new cat();
        obj.run();
        obj=new dog();
        obj.run();
    }
    
}
