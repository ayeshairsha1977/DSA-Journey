import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        List<int[]> l=new ArrayList<>();
        for(int[] interval:arr){
            if(l.isEmpty() || interval[0]>l.get(l.size()-1)[1])
            l.add(interval);
            else{
                l.get(l.size()-1)[1]=Math.max(interval[1],l.get(l.size()-1)[1]);
            }
        }
        return l.toArray(new int[l.size()][2]);


        // Arrays.sort(arr,(a,b)-> a[0]-b[0]);
        // HashMap<Integer,int[]> map=new HashMap<>();
        // map.put(0,new int[]{arr[0][0],arr[0][1]});
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i][0]<=arr[i-1][1] ){
        //         int first=arr[i][0]<arr[i-1][0]?arr[i][0]:arr[i-1][0];
        //         int end=arr[i][1]>arr[i-1][1]?arr[i][1]:arr[i-1][1];
        //         map.put(i-1,new int[]{first,end});
        //     }
        //     else{
        //         map.put(i,new int[]{arr[i][0],arr[i][1]});
        //     }
        // }
        // int[][] num=new int[map.size()][2];
        // int i=0;
        // for(int key: map.keySet()){
        //     num[i++]=map.get(key);
        // }
        // return num; 
    }
}
