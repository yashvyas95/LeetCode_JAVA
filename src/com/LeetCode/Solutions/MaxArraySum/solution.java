package com.LeetCode.Solutions.MaxArraySum;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;

public class solution {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new FileReader("C:\\Users\\Itachi_yv\\IdeaProjects\\LeetCode_JAVA\\src\\com\\LeetCode\\Solutions\\MaxArraySum\\data.txt"));
        var x = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(maxSubsetSum(x));
    }

    public static int maxSubsetSum(int[] arr) {
        if (arr.length == 0) return 0;
        arr[0] = Math.max(0, arr[0]);
        if (arr.length == 1) return arr[0];
        arr[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++)
            arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
        return arr[arr.length - 1];
    }
}
        /*
        if(x.length == 1 ){
            if(x[0]>0)
                System.out.println(x[0]);
            else{
                System.out.println(0);
            }
        }
        else if(x.length == 2){
            int[] x_clone = x.clone();
            Arrays.sort(x_clone);
            if(x_clone[x_clone.length-1]>0)
                System.out.println(x_clone[x_clone.length-1]);
            else
                System.out.println(0);
        }
        else{
            if(x.length > 4){
                long[] max_Sums = new long[3];
                max_Sums[0] = find_neighbours(x,1);
                max_Sums[1] = find_neighbours(x,2);
                max_Sums[2] = find_neighbours(x,3);
                Arrays.sort(max_Sums);
                if(max_Sums[max_Sums.length-1]>0)
                    System.out.println(max_Sums[max_Sums.length-1]);
                else{
                    System.out.println(0);
                }
            }
            else{
                long[] max_Sums = new long[2];
                max_Sums[0] = find_neighbours(x,1);
                max_Sums[1] = find_neighbours(x,2);
                Arrays.sort(max_Sums);
                if(max_Sums[max_Sums.length-1]>0)
                    System.out.println(max_Sums[0]);
                else{
                    System.out.println(0);
                }
            }
        }
    }

    static long find_neighbours(int[] data, int mode){
        if(mode==1){
            var data_clone = data.clone();
            Arrays.sort(data_clone);
            if(data_clone[data_clone.length-1]>0) return data_clone[data_clone.length-1];
            else return 0;
        }
        if(mode==2){
            HashMap<Integer,Long> sum_container = new HashMap<>();
            long max_sum = Long.MIN_VALUE;
            for(int i = 0 ; i < data.length ; i++){
                int center_element = data[i];
                if(i-1 >=1 && i+2<=data.length-1){
                    int[] left = Arrays.copyOfRange(data,0,i-1);
                    int[] right = Arrays.copyOfRange(data,i+2,data.length);
                    Arrays.sort(left);
                    Arrays.sort(right);
                    if(left[left.length-1]>right[right.length-1] && left[left.length-1]>=0){
                        if(!sum_container.containsKey(i))
                            if(max_sum<(data[i] + left[left.length-1]))
                                max_sum = data[i]+left[left.length-1];
                            sum_container.put(i, (long) (data[i] + left[left.length-1]));
                    }
                    else if(right[right.length-1] > left[left.length-1] && right[right.length-1]>=0) {
                        if(!sum_container.containsKey(i))
                            sum_container.put(i, (long) (data[i] + right[right.length-1]));
                            if(max_sum<data[i] + right[right.length-1])
                                max_sum = data[i]+right[right.length-1];

                    }
                    else
                    {
                        sum_container.put(i,0L);
                        if(max_sum<data[i] + right[right.length-1])
                            max_sum = 0;
                    }
                }
                else if(i+1< data.length-1){
                    int[] right = Arrays.copyOfRange(data,i+2,data.length);
                    Arrays.sort(right);
                    if(!sum_container.containsKey(i))
                        sum_container.put(i, (long) (data[i] + right[right.length-1]));
                        if(max_sum<data[i] + right[right.length-1])
                            max_sum = data[i]+right[right.length-1];

                }
                else if(i-1>=0){
                    int[] left = Arrays.copyOfRange(data,0,i-1);
                    Arrays.sort(left);
                    if(!sum_container.containsKey(i))
                        sum_container.put(i, (long) (data[i] + left[left.length-1]));
                    if(max_sum<data[i] + left[left.length-1])
                        max_sum = data[i]+left[left.length-1];
                }
                else{
                    sum_container.put(i,0L);
                    if(max_sum<0)
                        max_sum = 0;
                }
            }
            return max_sum;
        }

        if(mode==3){
            HashMap<Integer,Long> sum_container = new HashMap<>();
            long max_sum = Long.MIN_VALUE;
            for(int i = 0 ; i < data.length ; i++)
            {
                int[] left ;
                int[] right;
                if(i-1>0 && i+2 <=data.length-1) {
                    left = Arrays.copyOfRange(data, 0, i - 1);
                    right = Arrays.copyOfRange(data, i + 2, data.length);
                    if(left.length>2 && right.length>2){
                        var left_clone = left.clone();
                        var right_clone = right.clone();
                        if(left_clone[left_clone.length-1]>right_clone[right_clone.length-1]){
                            if(left_clone[left.length-2]>right_clone[right_clone.length-1]){
                                int index_in_array_bigger = fetch_index(left,left_clone[left.length-1]);
                                int index_in_array_smaller = fetch_index(left,left_clone[left.length-2]);
                                if(index_in_array_bigger> index_in_array_smaller+1){
                                    if(max_sum<left[index_in_array_bigger]+left[index_in_array_smaller]+ data[i]){
                                        max_sum = left[index_in_array_bigger]+left[index_in_array_smaller]+ data[i];
                                        sum_container.put(i,(long)left[index_in_array_bigger]+left[index_in_array_smaller]+ data[i]);
                                    }
                                }
                            }
                            else{
                                if(max_sum<(long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1])
                                    max_sum = (long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1];
                                sum_container.put(i,(long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1]);
                            }
                        }
                        else if(left_clone[left_clone.length-1]<right_clone[right_clone.length-1]){
                            if(right_clone[right_clone.length-2]>left_clone[left_clone.length-1]){
                                int index_in_array_bigger = fetch_index(right,left_clone[left.length-1]);
                                int index_in_array_smaller = fetch_index(right,left_clone[left.length-2]);
                                if(index_in_array_bigger> index_in_array_smaller+1){
                                    if(max_sum<right[index_in_array_bigger]+right[index_in_array_smaller]+ data[i]){
                                        max_sum = right[index_in_array_bigger]+right[index_in_array_smaller]+ data[i];
                                        sum_container.put(i,(long)right[index_in_array_bigger]+right[index_in_array_smaller]+ data[i]);
                                    }
                                }
                                else{
                                    if(max_sum<(long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1])
                                        max_sum = (long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1];
                                    sum_container.put(i,(long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1]);
                                }
                            }
                            else{
                                if(max_sum<(long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1])
                                    max_sum = (long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1];
                                sum_container.put(i,(long) data[i]+left_clone[left_clone.length-1]+right_clone[right_clone.length-1]);
                            }
                        }
                    }
                    else if(left.length<=2 && right.length<=2){
                        var left_clone = left.clone();
                        var right_clone = right.clone();
                        Arrays.sort(left_clone);
                        Arrays.sort(right_clone);
                        max_sum = max_sum < data[i]+right_clone[right_clone.length-1]+left_clone[left_clone.length-1] ? data[i]+right_clone[right_clone.length-1]+left_clone[left_clone.length-1] : max_sum;
                        sum_container.put(i,max_sum);
                    }
                }
            }
            return max_sum;
        }
        return -1;
    }

    static int fetch_index(int[] data, int element){
        for(int i = 0 ; i < data.length ; i++){
            if(element == data[i])return i;
        }
        return -1;
    }


}
*/