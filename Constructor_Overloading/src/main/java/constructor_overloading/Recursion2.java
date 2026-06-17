package constructor_overloading;

public class Recursion2 {

    int values[];

    Recursion2(int i) {
        values = new int[i];
    }

    void arrayDisplay(int i) {
        if (i == 0) {
            return;
        }
        arrayDisplay(i - 1);

        System.out.print(values[i - 1] + " ");
    }

}
