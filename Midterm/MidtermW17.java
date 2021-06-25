
/**
 * Write a description of class MidtermW17 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MidtermW17
{
    /**
     * Constructor for objects of class MidtermW17
     */
    public boolean isTriangle(double a, double b, double c)
    {
        if(a > 0 && b > 0 && c > 0 && a<b+c && b<a+c && c<a+b){return true;}else{return false;}
    }
    
    /**
    */
    public String disjointDifference(String a, String b)
    {
        String result = "";
        for(int i = 0;i < a.length();i++){
            if(b.indexOf(a.charAt(i)) == -1)//char in a doenst exist in b
            {if(result.indexOf(a.charAt(i)) == -1){result = result + a.charAt(i);}}//char a which isnt in b also isnt in the result string
        }
        for(int i = 0;i < b.length();i++){
            if(a.indexOf(b.charAt(i)) == -1){if(result.indexOf(b.charAt(i)) == -1){result = result + b.charAt(i);}}
        }
        return result;
    }
    
    /**
    */
    public int largestDigit(int n)
    {
        int c = 0 ,max = 0;
        String ns = Integer.toString(n);
        if( ns.charAt(0) == '-'){c = 1;}
        for(int i = c;i < ns.length();i++)
        {if(Integer.parseInt(ns.substring(i,i+1)) > max){max = Integer.parseInt(ns.substring(i,i+1));}  
        }
        return max;
    }
    
    /**
    */
    public boolean patternMatch(String a, String b)
    {
        String a2 = a.toLowerCase(), b2 = b.toLowerCase();
        int s = 0;
        if(a.length() != b.length()){return false;}
        for(int i=0;i<a.length();i++)
        {if(a2.charAt(i) == b2.charAt(i) || a2.charAt(i) == '?' || b2.charAt(i) == '?'){s = s + 1;}
        }
        if(s == a.length()){return true;}else{return false;}
    }
}
