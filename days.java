import java.util.HashMap;
import java.util.Map;

public class days {
    public static void main(String []args) {
        int day = 1;
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "first");
        map.put("2", "second");
        map.put("3", "third");
        map.put("4", "fourth");
        map.put("5", "fifth");
        map.put("6", "sixth");
        map.put("7", "seventh");
        map.put("8", "eighth");
        map.put("9", "ninth");
        map.put("10", "tenth");
        map.put("11", "eleventh");
        map.put("12", "twelfth");
        while (day <= 12) {
            System.out.println("On the " + map.get(String.valueOf(day)) + " day of Christmas");
            System.out.println("my true love sent to me:");
            if (day == 12)
                System.out.println("12 Drummers Drumming");
            if (day >= 11)
                System.out.println("11 Pipers Piping");
            if (day >= 10)
                System.out.println("10 Lords a Leaping");
            if (day >= 9)
                System.out.println("9 Ladies Dancing");
            if (day >= 8)
                System.out.println("8 Maids a Milking");
            if (day >= 7)
                System.out.println("7 Swans a Swimming");
            if (day >= 6)
                System.out.println("6 Geese a Laying");
            if (day >= 5)
                System.out.println("5 Golden Rings");
            if (day >= 4)
                System.out.println("4 Calling Birds");
            if (day >= 3)
                System.out.println("3 French Hens");
            if (day >= 2)
                System.out.println("2 Turtle Doves");
            if (day == 1) {
                System.out.println("A Partridge in a Pear Tree");
            } else {
                System.out.println("and a Partridge in a Pear Tree");
            }
            day++;
            System.out.println("");
        }
    }
}
