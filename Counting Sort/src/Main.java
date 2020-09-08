import sorting.CountingSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] desordenado = {4, 9, 2, 4, 7, 6,0,1};

        CountingSort.countingSort(desordenado, 0, desordenado.length);

    }
}
