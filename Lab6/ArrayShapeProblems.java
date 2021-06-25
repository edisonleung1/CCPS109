
/**
 * Write a description of class ArrayShapeProblems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayShapeProblems
{
    /**
     * Constructor for objects of class ArrayShapeProblems
     */
    public int countUpsteps(int[] a){
        int i=0,count=0;
        for(i=0;i<=a.length-2;i++){
            if(a[i] < a[i + 1]){count=count+1;}}
        return count;}
        
    public boolean sameStepShape(int[] a, int[] b){
        int i=0,count=0;
        for(i=0;i<=a.length-2;i++){
            if(a[i] < a[i + 1] && b[i] < b[i + 1]){count=count+1;}
            if(a[i] > a[i + 1] && b[i] > b[i + 1]){count=count+1;}
            if(a[i] == a[i + 1] && b[i] == b[i + 1]){count=count+1;}}
        if(count == a.length-1){return true;}else{return false;}}
            
    public boolean isSawtooth(int[] a){
        int i=0,count=0;
        if(a.length <=1){return true;}
        if(a.length == 2){
            if(a[0] != a[1]){return true;}
                else{return false;}}
        for(i=1;i<=a.length-2;i++){
                if(a[i-1] < a[i] && a[i] > a[i+1]){count=count+1;}
                if(a[i-1] > a[i] && a[i] < a[i+1]){count=count+1;}}
        if(count==a.length-2){return true;}else{return false;}}
                   
    public boolean isMountain(int[] a){
        int i=0,ucount=0,dcount=0,count=0;
        if(a.length <=1){return true;}//zero upstep or downstep
        if(a.length == 2){
            if(a[0] != a[1]){return true;}
                else{return false;}}//it means there is 1 upstep or 1 downstep
        for(i=0;i<=a.length-2;i++){ 
            if(a[i]==a[i+1]){return false;}
            if(a[i]>a[i+1]){count=count+1;}
            if(count>0 && a[i]<a[i+1]){return false;}}
         return true;}
}
