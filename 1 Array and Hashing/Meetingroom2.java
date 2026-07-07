import java.util.Arrays;
import java.util.PriorityQueue;

public class Meetingroom2 {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int[][] arr=new int[start.length][2];
        for(int i=0;i<start.length;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int[] a: arr){
            
            if(!p.isEmpty() && p.peek()<=a[0])p.poll();
            p.offer(a[1]);
        }
        return p.size();
    }
}
