import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {

                String str1 = new String("Hello World!");
                String str2 = new String("My name is Kirill");
                String str3 = new String("I love Java");
                String str4 = new String("I live in Moscow");

                LinkedList<String> earlBio = new LinkedList<>();
                earlBio.add(str1);
                earlBio.add(str2);
                earlBio.add(str3);
                earlBio.add(str4);

                System.out.println(earlBio);


                Iterator<String> iterator = earlBio.descendingIterator();

                while (iterator.hasNext())
                {
                    System.out.println(iterator.next());
                }

    }
}