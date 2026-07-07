public class MoveZeroes {
    public void moveZeroes(int[] arr) {
        // method 1:
        // int i=0,j=1;
        // while(j<arr.length){
        //     while(i<arr.length && arr[i]!=0 )i++;
        //     j=i+1;
        //     while(j<arr.length && arr[j]==0 )j++;
        //     if(i>=arr.length || j>=arr.length)break;
        //         int temp=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=temp;
        //     i++;
        //     j++;
        // }

        //method 2
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0)arr[i++]=arr[j];
        }
        while(i<arr.length)arr[i++]=0;
    }
}
