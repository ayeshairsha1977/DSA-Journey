import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            if(!map.containsKey(i))
            map.put(i,1);
            else
            map.put(i,map.get(i)+1);
        }
        int[] ans=new int[k];
        List<Map.Entry<Integer,Integer>> l=new ArrayList<>(map.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<Integer,Integer>>(){
            public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b){
                return b.getValue()-a.getValue();
            }
        });
        for(int i=0;i<k;i++)ans[i]=l.get(i).getKey();
        return ans;
    }
}
