package com.epam.mjc.stage0;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasonsArray = {"winter", "spring", "summer", "autumn"};
        return seasonsArray;
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] numbersArray = new int[length];
        for(int i = 0; i < length; i++){
            numbersArray[i] = i+1;
        }
        return numbersArray;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int result = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] == number){
                result = number;
                break;
            }
        }
        return result;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        int lastIndex = arr.length -1;
        String arrEl = "";
        if(arr.length % 2 == 0){
            for(int i = 0; i <= arr.length/2; i ++){
                arrEl = arr[i];
                arr[i]= arr[lastIndex];
                arr[lastIndex] = arrEl;
                lastIndex--;
            }
        }else{
            for(int i = 0; i < arr.length + 1; i++){
                if(i == arr.length +1){
                    continue;
                }else{
                    arrEl = arr[i];
                    arr[i]= arr[lastIndex];
                    arr[lastIndex] = arrEl;
                    lastIndex--;
                }
            }
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int negativeCount = 0;
        for(int i = 0;i <arr.length;i++){
            if(arr[i] < 0 ){
                negativeCount++;
            }
        }
        int[] resultArr = new int[arr.length - negativeCount];
        int arrIndex = 0;
        for(int i = 0;i < arr.length; i++){
            if(arr[i] > 0){
                resultArr[arrIndex] = arr[i];
                arrIndex++;
            }
        }
        return resultArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i = 0; i < arr.length; i++){
                if (i+1 < arr.length){
                    if(arr[i].length > arr[i+1].length){
                        int[] arrTmp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = arrTmp;
                        isSorted = false;
                    }
                }
            }
        }
        for(int i = 0; i < arr.length;i++){
            isSorted = false;
            if(arr[i].length < 2){
                continue;
            }else{
                while(!isSorted) {
                    isSorted = true;
                    for(int j = 0; j < arr[i].length;j++){
                        if (j+1 < arr[i].length ){
                            if(arr[i][j] > arr[i][j+1]){
                                int tmp = arr[i][j];
                                arr[i][j] = arr[i][j+1];
                                arr[i][j+1] = tmp;
                                isSorted = false;
                            }
                        }
                    }
                }
            }
        }
        return arr;
    }
}
