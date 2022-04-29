import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        //Calculating square of each element of list and prepare a new list
        /* List<Integer> squaredList = new ArrayList<>();
        for(int i:numberList) {
            squaredList.add(i*i);
        } */
        //Writing the above logic using streams
        List<Integer> squaredList = numberList.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println("Number: "+numberList);
        System.out.println("Squared List of numbers: "+squaredList);
        /*HashSet<Integer> squaredSet = new HashSet<>();
        for(Integer i:numberList) {
            squaredSet.add(i*i);
        }
        System.out.println(squaredSet);*/
        Set<Integer> squaredSet = numberList.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("Squared set of numbers: "+squaredSet);

        List<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("r");
        languages.add("cpp");
        /*List<String> filterResult = new ArrayList<>();
        for(String s:languages) {
            if(s.startsWith("p")) {
                filterResult.add(s);
            }
        }*/
        List<String> filterResult = languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
        System.out.println("Filtered List, languages starting with \"p\": "+filterResult);

        List<String> sortedList = languages.stream().sorted().collect(Collectors.toList());
        System.out.println("Alphabetically sorted list: "+sortedList);

        //Iterating over the list without loops
        System.out.println("Printing all elements one by one: ");
        //Single line of code inside stream
        languages.stream().forEach(y -> System.out.println("element is: "+y));
        //Multi line of code inside stream
        languages.stream().forEach(z->{
            System.out.println("Element: "+z);
        });

        //Reduce method is used to change the representation of the complete collection into a single result
        int sum = numberList.stream().reduce(0,(ans,i) -> ans+i);
        System.out.println("Sum of the elements of the list: "+sum);
    }
}