import java.util.ArrayList;
import java.util.Arrays;


public class ListArraysOpg {
    public static void main(String[] args) {

        // Opgave 1 og 2
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Hans", "Viggo", "Jens", "Bente", "Bent"));
        //Opgave 3
        System.out.println(names.size());

        //Opgave 4
        names.add(2,"Jane");

        //Opgave 5
        System.out.println(names);
        //Kan også gøres med et enhanced for loop:
        for(String name : names){
            System.out.println(name);
        }

        //Opgave 6
        names.remove(1);

        //Opgave 7
        names.add(0,"Pia");

        //Opgave 8
        names.add(names.size() - 1,"Ib");

        //Opgave 9
        System.out.println(names.size());

        //Opgave 10
        names.set(2,"Hansi");

        //Opgave 11
        System.out.println(names.size());

        //Opgave 12
        System.out.println(names);

        //Opgave 13
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Opgave 14
        for(String name : names){
            System.out.println(name);
        }

    }
}
