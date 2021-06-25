
/**
 * Write a description of class ArrayProblems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayProblems
{
    /**
     * Constructor for objects of class ArrayProblems
     */
  public static void main(String[] args){}
  public int[] everyOther(int[] a){
     int length=a.length;
     int answer[];
     if(a.length % 2 ==0){
         answer=new int [length/2];
            for(int i=0;i<=(a.length-1);i=i+2){
                answer[i/2]=a[i];}} 
     else{
         answer=new int [length/2+1];
            for(int i=0;i<=(a.length-1);i=i+2){
                answer[i/2]=a[i];}}           
     return answer;}
  
  public int countInversions(int[] a){
      int count=0;
      for(int i=0;i<=a.length-1;i++){
          for(int j=0;j<=a.length-1;j++){
              if(i==j){continue;}
              if(i<j && a[i]>a[j]){count=count+1;}}}
      return count;
  }
  
  public int[] squeezeLeft(int[] a){
      int count=0,i=0;
      int answer[]=new int [a.length];
      for(i=0;i<=a.length-1;i++){
          if(a[i]!=0){answer[count]=a[i];count=count+1;}}
      for(i=count;i<=a.length-1;i++){
          answer[i]=0;}
      System.arraycopy(answer,0,a,0,a.length);return a;}
      
  public int[] runDecode(int[] a){
      int i=0,j=0,count=0,alength=0,anslength=0,answer[];
      alength=a.length;
      for(i=0;i<=alength-1;i=i+2){
        anslength=anslength+a[i];}
      answer=new int[anslength];
      for(i=0;i<=alength-1;i=i+2){
          for(j=0;j<=a[i]-1;j++){
              answer[count]=a[i+1];
              count=count+1;}}        
      return answer;}
}
