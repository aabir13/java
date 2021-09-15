//Code to understand the concept of static block and instance block
public class StaticBlock 
{
    /*Static block is that segment of code which is executed before the main method.
    A particular code can have multiple static blocks each of which shall be executed before the main method.*/
    static 
    {
        System.out.println("2");
    }
    /*Instance block also called init block is executed only when an object is created in the main method*/
    {
        System.out.println("4");
    }
    public static void main(String[] args)
    {
        System.out.println("1");
        new StaticBlock();
    }
    static
    {
        System.out.println("3");
    }
}
