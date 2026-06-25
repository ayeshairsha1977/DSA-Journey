import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] arr) {
        HashMap<Integer,Integer> map =new HashMap<>();
        map.put(0,-1);
        int maxlen=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=arr[i]==1?sum+1:sum-1;
            if(map.containsKey(sum))maxlen=Math.max(maxlen,i-map.get(sum));
            else map.put(sum,i);
        }
        return maxlen;
    }
}
