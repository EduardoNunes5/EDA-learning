package sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CountingSort {


    public static <T extends Comparable<T>> T[] countingSort(T[] array, int left, int right){
        if(left >= right || array == null) return array;

        Integer max = getMax(array,left,right);
        Integer[] indexes = (Integer[]) new Integer[max+ 1];
        Arrays.fill(indexes, 0);

        //registrando as ocorrencias
        for(int i = left; i < right; i ++){
            indexes[(Integer)array[i]]++;
        }

        //somando o registro das ocorrencias
        int soma = 0;
        for(int i = 0; i < indexes.length; i++){
            soma += indexes[i];
            indexes[i] = soma;
        }

        Integer[] sorted = new Integer[right];
        for(int i = left; i < right; i ++){
            sorted[indexes[(Integer)array[i]]-1] = (Integer)array[i];
            indexes[(Integer)array[i]]--;
        }

        for(int i = left; i < right; i++){
            array[i] = (T) sorted[i];
        }

        return array;

    }

    public static <T extends Comparable<T>> Integer getMax(T[] array, int left, int right){

        Integer max = (Integer) array[left];
        for(int i = left+1; i < right; i++){
            if(((Integer)array[i]).compareTo(max)> 0)
                max = (Integer) array[i];
        }
        return max;

    }
}
