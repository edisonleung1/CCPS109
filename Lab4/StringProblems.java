
/**
 * Write a description of class StringProblems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringProblems
{
    /**
     * Constructor for objects of class StringProblems
     */
    public String removeDuplicates(String s)
    {
      int i = 0;StringBuilder answer =new StringBuilder();
      if(s.length() != 0){
        answer.append(s.charAt(0));
        for (i = 1;i <= (s.length()-1);i++){
          if(s.charAt(i) != s.charAt(i-1)){answer.append(s.charAt(i));}}}
      return answer.toString();
    }
    /**
     * Constructor for objects of class StringProblems
     */
    public int countWords(String s)
    {
        int i=0,count=0,m=0; 
        for(i=0;i<=(s.length()-1);i++){
           char c=s.charAt(i);
           if(m == 0){
             if(!Character.isWhitespace(c)){
                 m=1;count=count+1;}}
           else{
             if(Character.isWhitespace(c)){
               m=0;}}}
        return count;
    }
    
    /**
     * Constructor for objects of class StringProblems
     */
    public String convertToTitleCase(String s)
    {
        int i=0;StringBuilder answer =new StringBuilder();
        if(s.length() != 0){
          if(!Character.isWhitespace(s.charAt(0)))
            {answer.append(Character.toTitleCase(s.charAt(0)));}
          else
             {answer.append(s.charAt(0));}
          for(i=1;i<=(s.length()-1);i++){
            if(Character.isWhitespace(s.charAt(i-1)) && !Character.isWhitespace(s.charAt(i)))
              {answer.append(Character.toTitleCase(s.charAt(i)));}
            else
              {answer.append(s.charAt(i));}
          }}
        return answer.toString();
    }
    
    /**
     * Constructor for objects of class StringProblems
     */
    public String stretch(String s, int n)
    {
        int i=0,j=0;
        StringBuilder answer =new StringBuilder();
        if(s.length() != 0 && s.length() != 1)
          {if(s.length() != 2)
            {if(n !=0)
              {answer.append(s.charAt(0));
              for(i=1;i<=(s.length()-2);i++){
                for(j=1;j<=n;j++){
                  answer.append(s.charAt(i));}}
              answer.append(s.charAt(s.length()-1));}
            else{answer.append(s.charAt(0));answer.append(s.charAt(s.length()-1));}}
          else{answer.append(s.charAt(0));answer.append(s.charAt(s.length()-1));}}
        else{answer.append(s);}
        return answer.toString();
    }
}
