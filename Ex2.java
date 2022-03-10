package ArrayListOpgaver;

import java.lang.annotation.ElementType;
import java.util.ArrayList;

public class Ex2 {

    /**
     * Tests all the methods.
     */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(12);
        ints.add(0);
        ints.add(45);
        ints.add(7);
        ints.add(-16);
        ints.add(0);
        ints.add(23);
        ints.add(-10);
//        ints.addAll(Arrays.asList(12, 0, 45, 7, -16, 0, 23, -10));
        System.out.println("ints: " + ints);
        System.out.println();

        // Test of sum() method: correct sum is 61.
        int total = sum(ints);
        System.out.println("Sum: " + total);

        // Test of minimum() method: correct minimum is -16.
        System.out.println("Smallest number is: " + minimum(ints));

        // Test of maximum() method: correct maximum is 45.
        System.out.println("Highest number is: " + maximum(ints));

        // Test of average() method: correct average is 7.625.
        System.out.println("Average is: " + average(ints));

        // Test of zeroes() method: correct number of zeroes is 2.
        System.out.println("Number of zeroes is: " + zeroes(ints));

        // Test of evens() method: correct result is [12, 0, -16, 0, -10].
        System.out.println("All evens in the list: " + evens(ints));

        // Test of Replacing every even number with Zero
        replaceEvensWithZero(ints);
        System.out.println(ints);
    }

    // sum made with for statement
    public static int sum1(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }
    public static int sum(ArrayList<Integer> list){
        int sum = 0;
        for(int element : list){
            sum = sum+ element;
        }
        return sum;
    }
    //Opgave 2.1
    public static int minimum(ArrayList<Integer> list){
        int minimum = Integer.MAX_VALUE;
        for (int element : list){
            if(element < minimum){
                minimum = element;
            }
        }
        return minimum;
    }

    public static int maximum(ArrayList<Integer> list){
        int maximum = Integer.MIN_VALUE;
        for(int element : list){
            if(element > maximum){
                maximum = element;
            }
        }
        return maximum;
    }

    //Opgave 2.2
    public static double average(ArrayList<Integer> list){
        double average = 0;
        for(int element : list){
            average = average + element;
        }
        return average / list.size();
    }

    //Opgave 2.3
    public static int zeroes(ArrayList<Integer> list){
        int numberOfZeroes = 0;
        for (int element : list){
            if(element == 0){
                numberOfZeroes++;
            }
        }
        return numberOfZeroes;
    }
    //Opgave 2.4
    public static void replaceEvensWithZero(ArrayList<Integer> list){
        for(int element : list){
            int index = list.indexOf(element);
            if(element % 2 == 0){
                list.set(index,0);
            }
        }
    }
    //Opgave 2.5
    public static ArrayList<Integer> evens(ArrayList<Integer> list){
        ArrayList<Integer> evens = new ArrayList<>();
        for(int element : list){
            if(element % 2 == 0){
                evens.add(element);
            }
        }
        return evens;
    }

}
