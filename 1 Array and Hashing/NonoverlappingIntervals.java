import java.util.Arrays;

public class NonoverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i-1][1]>intervals[i][0] || intervals[i-1][0]==intervals[i][0])count++;
        }
        return count-count/2;
    }
}
