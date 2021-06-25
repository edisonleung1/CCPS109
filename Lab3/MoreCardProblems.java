
/**
 * Write a description of class MoreCardProblems here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MoreCardProblems
{
    /**
     * Constructor for objects of class MoreCardProblems
     */
    private int point(char c){
        if( c =='A'){return 4;}
        if( c =='K'){return 3;}
        if( c =='Q'){return 2;}
        if( c =='J'){return 1;} 
        return 0;
    }
    public int bridgePointCount(String hand){
        int points = 0,count = 0;
        do{points = points + this.point(hand.charAt(count));
           count = count + 1;
        
    }while (count != 25);
    return points;
    }
    
    /**
     * Constructor for objects of class MoreCardProblems
     */
    private int point2(char c){
        if( c =='A'){return 1;}
        if( c =='K'){return 10;}
        if( c =='Q'){return 10;}
        if( c =='J'){return 10;}
        if(c=='2'){ return 2;}
        if(c=='3'){ return 3;}
        if(c=='4'){ return 4;}
        if(c=='5'){ return 5;}
        if(c=='6'){ return 6;}
        if(c=='7'){ return 7;}
        if(c=='8'){ return 8;}
        if(c=='9'){ return 9;}
        if(c=='T'){ return 10;}
        return 0;
    }
    public int countDeadwood(String hand){
        int points = 0;
        int cn = (hand.length())/2;
        if( cn != 0){do{ points = points + this.point2(hand.charAt(cn*2-2));
            cn = cn - 1;
        } while (cn != 0);}
        else{points = 0;}
        return points;
    }
    
     /**
     * Constructor for objects of class MoreCardProblems
     */
    public String bridgeHandShape(String hand){
        int s=0,h=0,d=0,c=0,count=1;
        do{if(hand.charAt(count) == 's'){s = s + 1;}
           if(hand.charAt(count) == 'h'){h = h + 1;}
           if(hand.charAt(count) == 'd'){d = d + 1;}
           if(hand.charAt(count) == 'c'){c = c + 1;}
           count = count + 2;
        }while(count <= 25);
        return(Integer.toString(s)+','+' '+Integer.toString(h)+','+' '+Integer.toString(d)+','+' '+Integer.toString(c));
    }
     /**
     * Constructor for objects of class MoreCardProblems
     */
    public boolean hasFullHouse(String hand){
        int count=0,s0=0,s1=0,s2=0,s3=0,s4=0;
        do{if(hand.charAt(0) == hand.charAt(count)){ s0 = s0 + 1;}
        count = count + 2;
        }while(count <= 8);
        count=0;
        do{if(hand.charAt(2) == hand.charAt(count)){ s1 = s1 + 1;}
        count = count + 2;
        }while(count <= 8);
        count=0;
        do{if(hand.charAt(4) == hand.charAt(count)){ s2 = s2 + 1;}
        count = count + 2;
        }while(count <= 8);
        count=0;
        do{if(hand.charAt(6) == hand.charAt(count)){ s3 = s3 + 1;}
        count = count + 2;
        }while(count <= 8);
        count=0;
        do{if(hand.charAt(8) == hand.charAt(count)){ s4 = s4 + 1;}
        count = count + 2;
        }while(count <= 8);
        if(s0+s1+s2+s3+s4 == 13){return true;}else{return false;}//all 
    }
}

