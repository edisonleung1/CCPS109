
/**
 * Write a description of class MoreStringProblems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoreStringProblems
{
    /**
     * Constructor for objects of class MoreStringProblems
     */
    public String uniqueCharacters(String text){
        int i=0,j=0,count=0;StringBuilder answer =new StringBuilder();
        for(i=0;i<=(text.length()-1);i++){
           for(j=0;j<=(answer.length()-1);j++){
               if(text.charAt(i) == answer.charAt(j)){count=count+1;}}
           if(count==0){answer.append(text.charAt(i));}
           count=0;}
        return answer.toString();}
           
    public int countOccurrences(String text, String pattern){
        int patternlength=pattern.length(),i=0,count=0;
        String s="";
        if(pattern.length() > text.length()){return 0;}
        for(i=0;i<=text.length()-patternlength;i++){
            s=text.substring(i,patternlength+i);
            if(s.equals(pattern)){count=count+1;}}
        return count;}
 
    public String cyclicLeftShift(String s, int k){
        StringBuilder answer =new StringBuilder();
        int i=0;
        if(s.length()==0 || s.length()==1){return s;}
        if(s.length()<k && k%s.length()==0){return s;}
        for(i=0;i<=s.length()-1;i++){
            if(k%s.length()+i < s.length()){answer.append(s.charAt(k%s.length()+i));}
            else{answer.append(s.charAt(k%s.length()+i-s.length()));}}
        return answer.toString();}
             
    public int parseInt(String s){
        int sign=0,length=s.length(),k=1,i=0,answer=0,b=0;
        String a=s.substring(0,1);
        if(a.equals("-")){sign=0;}
        else{sign=1;}
        if(sign!=0){for(i=length-1;i>=0;i--){
            b=Character.getNumericValue(s.charAt(i));
            answer=answer+b*k;
            k=k*10;}}
        else{for(i=length-1;i>=1;i--){
            b=Character.getNumericValue(s.charAt(i));
            answer=answer+b*k;
            k=k*10;}}
        if(sign==0){answer=-answer;}
        return answer;}
}
