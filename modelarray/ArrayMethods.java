package modelarray;

import java.util.Arrays;

public class ArrayMethods {
    public void printArray(int[] tabel) {
        System.out.print("{");
        for (int i = 0; i < tabel.length; i++) {
            if (i == 0) {
                System.out.print(tabel[i]);
            } else {
                System.out.print(", " + tabel[i]);
            }
        }
        System.out.println("}  ");
    }

    /**
     * @return et array med indhold [0,0,0,0,0,0,0,0,0,0]
     */
    public int[] fyldArrayA() {
        int[] result = new int[10];
        return result;
    }


    /**
     * @return et array med indhold [2,44,-23,99,8,-5,7,10,20,30]
     */
    public int[] fyldArrayB() {
//        int[] result = new int[10];
        //TODO
        int[] result = {2, 44, -23, 99, 8, -5, 7, 10, 20, 30};

        return result;
    }

    /**
     * @return et array med indhold [0,1,2,3,4,5,6,7,8,9]
     */
    public int[] fyldArrayC() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++)
            result[i] = i;
        return result;
    }

    /**
     * @return et array med indhold [2,4,6,8,10,12,14,16,18,20]
     */
    public int[] fyldArrayD() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i * 2 + 2;
        }
        return result;
    }

    /**
     * @return et array med indhold [1,4,9,16,25,36,49,64,81,100]
     */
    public int[] fyldArrayE() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + 1) * (i + 1);
        }
        return result;
    }

    /**
     * @return et array med indhold [0,1,0,1,0,1,0,1,0,1]
     */
    public int[] fyldArrayF() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 2;
        }
        return result;
    }

    /**
     * @return et array med indhold [0,1,2,3,4,0,1,2,3,4]
     */
    public int[] fyldArrayG() {
        int[] result = new int[10];
        //TODO
        for (int i = 0; i < result.length; i++) {
            result[i] = i % 5;
        }

        return result;
    }

    public int findMax(int[] tabel) {
        int max = -1;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] > max) {
                max = tabel[i];
            }
        }
        return max;
    }

    public int sum(int[] t) {
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            sum += t[i];
        }
        return sum;
    }

    public double sumDouble(double[] d) {
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        return sum;
    }

    public int[] makeSum(int[] a, int[] b) {
        int[] sum = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }
        return sum;
    }

    //Opgave 4.1
    public void switchArrays(int[] a) {
        int firstValue = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = firstValue;
    }

    //Opgave 4.2
    public void switchPositions(int[] a) {
        //Sætter en variabel til den sidste i array'et da den skal om på index 0 plads
        int last = a[a.length - 1];
        //Så lopper vi alle de andre igennem
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = last;
    }

    //Opgave 4.3
    public void replaceEvenWithZero(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                a[i] = 0;
            }
        }
    }
    //Opgave 4.4
    public int returnNextLargestIndex(int[] a){
        Arrays.sort(a);
        return a[a.length - 2];
    }
    //Opgave 4.5
    public Boolean checkIfAscending(int[] a){
        boolean isAscending = false;
        for (int i = 1; i < a.length; i++) {
            if(a[i] > a[i-1]){
                isAscending = true;
            }else {
                isAscending = false;
            }
        }
        return isAscending;
    }
    //Opgave 4.6
    public boolean checkDuplicates(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i] == (input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}

