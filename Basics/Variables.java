//Program to understand the types of variables
public class Variables 
{
    //Static Variable
    static int a = 11;
    //Instance Variable
    int b = 7;
    /**
     * This is main method
     * @param args
     */
    public static void main(String[]args)
    {
        //Local Variable
        int c = 9;
        Variables v =  new Variables();
        System.out.println("Jersey Numbers:");
        System.out.println("Gareth Bale: "+a);
        System.out.println("Cristiano Ronaldo: "+v.b);
        System.out.println("Karim Benzema: "+c);
    }
}
