
/**
 * Write a description of class RecursionProblems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecursionProblems{
    
    public boolean allEqual(int[] arr, int start, int end){
        if (start >= end){return true;}
        if (arr[start] != arr[end]){return false;}
        return allEqual(arr, start+1, end);
    }

    public void arraycopy(double[] src, int start, double[] tgt, int start2, int len){
        if(len<1){return;}
        tgt[start2]=src[start];
        arraycopy(src,start+1,tgt,start2+1,len-1);
    }
    
    public boolean linearSearch(int[] arr, int x, int start, int end){
        if(start > end) { return false; }
        if(arr[start] == x) { return true; }
        return linearSearch(arr, x, start+1, end);
    }
    
    public void reverse(int[] arr, int start, int end){
        if(start > end) {return;}
        int a=0;
        a=arr[start];arr[start]=arr[end];arr[end]=a;
        reverse(arr,start+1,end-1);
    }
    
    public void parityPartition(int[] arr, int start, int end){
        int a=0,b=0;
        if(start > end || start == end) {return;}
        if(arr[start]%2==0){
            a=arr[start];arr[start]=arr[end];arr[end]=a;
            parityPartition(arr,start,end-1);}
        else{parityPartition(arr, start+1, end);}
    }
  
    
    public int countRuns(int[] arr, int start, int end){
        if(start > end) {return 0;}
        if(start == end) { return 1; }
        if(arr[start]==arr[start+1]){ return countRuns(arr,start+1,end) ;}
        else { return countRuns(arr,start+1,end) + 1; }
    }
}
