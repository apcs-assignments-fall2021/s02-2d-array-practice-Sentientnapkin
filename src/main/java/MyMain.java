import java.util.*;
public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int count = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j]>largest)
                    largest = mat[i][j];
            }
        }
        return largest;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        int placeholder;
        for(int i = 0;i<mat.length;i++){
            placeholder = mat[i][0];
            if (mat[i].length - 1 >= 0)
                System.arraycopy(mat[i], 1, mat[i], 0, mat[i].length - 1);
            mat[i][mat[i].length-1]=placeholder;
        }
        return mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int[][] mat = new int[arraySize][arraySize];
        for(int i = 0;i<arraySize;i++){
            for(int j = 0;j<arraySize;j++){
                mat[i][j]=i+j;
            }
        }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        int total  = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length;j++){
                total+=mat[i][j];
            }
        }
        return (double)total/(mat.length*mat[0].length);
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        ArrayList<Double> flat = new ArrayList<>();
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                flat.add(mat[i][j]);
            }
        }
        if((flat.size()%2)!=0){
            return flat.get(flat.size()/2);
        }
        else return (flat.get(flat.size()/2-1)+flat.get(flat.size()/2))/2;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int frequency = 1;
        int maxFrequency = 0;
        double modeNum = 0;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length-1; j++) {
                if(mat[i][j]==mat[i][j+1]){
                    frequency++;
                    if(frequency>maxFrequency){
                        modeNum=mat[i][j];
                        maxFrequency=frequency;
                    }
                }
                else frequency=1;
            }
            if (i<mat.length-1&&mat[i][mat[0].length-1]==mat[i+1][0]){
                frequency++;
                if(frequency>maxFrequency){
                    modeNum=mat[i][mat[0].length-1];
                    maxFrequency=frequency;
                }
            }
            else frequency=1;
        }
        return modeNum;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
