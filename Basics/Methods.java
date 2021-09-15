//Code to understand the types of methods
public class Methods 
{
    //Non-static method
    void show()
    {
        System.out.println("Show!");
    }
    //Static method
    static void display()
    {
        System.out.println("Display!");
    }
    //Main method
    public static void main(String[] args)
    {
        Methods m = new Methods();
        m.show();
        display();
    }
}
