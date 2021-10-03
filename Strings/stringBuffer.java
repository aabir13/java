//Code to demonstrate StringBuffer class in Java
public class stringBuffer 
{
    public static void main(String[] args)
    {    
        StringBuffer s = new StringBuffer("aabirushka");
        int p=s.length();
        int q=s.capacity();
        System.out.println("Length of the string: "+p);
        System.out.println("Capacity of the string: "+q);

        s.insert(10,"forever");
        System.out.println(s);

        s.insert(0,1);
        System.out.println(s);

        char us[] = {'a','n','d','b','e','y','o','n','d'};
        s.insert(18,us);
        System.out.println(s);

        s.deleteCharAt(0);
        System.out.println(s);
        
        s.replace(17,20,"&");
        System.out.println(s);

        s.reverse();
        System.out.println(s);
    }
}
