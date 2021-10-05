//Code to demonstrate StringBuilder class in Java
public class stringBuilder
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder();
        str.append("aabir");
        System.out.println("String value: "+str.toString());
        StringBuilder st = new StringBuilder("gauri");
        System.out.println("New String value: "+st.toString());
        StringBuilder s= new StringBuilder(10);
        System.out.println("Capacity of string: "+s.capacity());
        StringBuilder s1 = new StringBuilder(st.toString());
        System.out.println("Another String Value: "+s1.toString());
    }
}