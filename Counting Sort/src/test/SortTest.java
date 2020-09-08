package test;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sorting.CountingSort;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    private Integer[] array1 = new Integer[10];
    private Integer[] array2 = new Integer[15];
    private Integer[] array3 = new Integer[50];

    @BeforeEach
    void populaArrays(){
        populaArray(array1);
        populaArray(array2);
        populaArray(array3);
    }

    @Test
    void array1test(){
        Integer[] ordenado = Arrays.copyOf(array1, array1.length);
        Arrays.sort(ordenado);
        CountingSort.countingSort(array1,0, array1.length);
        assertArrayEquals(ordenado, array1);

    }
    @Test
    void array2test(){
        Integer[] ordenado = Arrays.copyOf(array2, array2.length);
        Arrays.sort(ordenado);
        CountingSort.countingSort(array2,0, array2.length);
        assertArrayEquals(ordenado, array2);

    }
    @Test
    void array3test(){
        Integer[] ordenado = Arrays.copyOf(array3, array3.length);
        Arrays.sort(ordenado);
        CountingSort.countingSort(array3,0, array3.length);
        assertArrayEquals(ordenado, array3);

    }

    private void populaArray(Integer[] array){
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(20);
        }
    }
}
