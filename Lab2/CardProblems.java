
/**
 * Write a description of class Lab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardProblems
{
    /**
     * hasflush
     */
    public static boolean hasFlush (String hand)
    {
        if(hand.charAt(1) == hand.charAt(3) &&
        hand.charAt(1) == hand.charAt(5) &&
        hand.charAt(1) == hand.charAt(7) &&
        hand.charAt(1) == hand.charAt(9))
        { return true; }
        else { return false; }
    }
    

    /**
     * hasFourOfAKind
     */
    public static boolean hasFourOfAKind (String hand)
    {
       int r = 0;
       if(hand.charAt(0) == hand.charAt(2) &&
       hand.charAt(0) == hand.charAt(4) &&
       hand.charAt(0) == hand.charAt(6))
       { r = 1;}
       if(hand.charAt(0) == hand.charAt(2) &&
       hand.charAt(0) == hand.charAt(4) &&
       hand.charAt(0) == hand.charAt(8))
       { r = 1;}
       if(hand.charAt(0) == hand.charAt(2) &&
       hand.charAt(0) == hand.charAt(6) &&
       hand.charAt(0) == hand.charAt(8) )
       { r = 1;}
       if(hand.charAt(0) == hand.charAt(4) &&
       hand.charAt(0) == hand.charAt(6) &&
       hand.charAt(0) == hand.charAt(8) )
       { r = 1;}
       if(hand.charAt(2) == hand.charAt(4) &&
       hand.charAt(2) == hand.charAt(6) &&
       hand.charAt(2) == hand.charAt(8) )
       { r = 1;}
       if( r == 1 ){return true;}
       else {return false;}
    }
    
    /**
     * chasFourCardBadugi
     */
    public static boolean hasFourCardBadugi(String hand)
    {
    int r = 0;
    if(hand.charAt(0) != hand.charAt(2) &&
    hand.charAt(0) != hand.charAt(4) &&
    hand.charAt(0) != hand.charAt(6) &&
    hand.charAt(2) != hand.charAt(4) &&
    hand.charAt(2) != hand.charAt(6) &&
    hand.charAt(4) != hand.charAt(6)) 
    { r = r + 1;}
    if(hand.charAt(1) != hand.charAt(3) &&
    hand.charAt(1) != hand.charAt(5) &&
    hand.charAt(1) != hand.charAt(7) &&
    hand.charAt(3) != hand.charAt(5) &&
    hand.charAt(3) != hand.charAt(7) &&
    hand.charAt(5) != hand.charAt(7)) 
    { r = r + 1;}
    if ( r == 2 ){
        return true;}
    else{
        return false;}
    }
    
    /**
     * winningCard
     */
    private int getRank(char c){
        if(c=='2'){ return 2;}
        if(c=='3'){ return 3;}
        if(c=='4'){ return 4;}
        if(c=='5'){ return 5;}
        if(c=='6'){ return 6;}
        if(c=='7'){ return 7;}
        if(c=='8'){ return 8;}
        if(c=='9'){ return 9;}
        if(c=='T'){ return 10;}
        if(c=='J'){ return 11;}
        if(c=='Q'){ return 12;}
        if(c=='K'){ return 13;}
        if(c=='A'){ return 14;}
        return c;
    }
    
    /**
     * winningCard
     */
    public String winningCard(String play){
        int r1 =0,r2 =0 ,r3 = 0, r4 = 0;
        String c1 = play.substring(0,2);
        String c2 = play.substring(2,4);
        String c3 = play.substring(4,6);
        String c4 = play.substring(6,8);
        String wc = "";
        r1 = this.getRank(c1.charAt(0));//record rank for player 1
        int winner = 1;
        int max = r1;
        if(c2.charAt(1) == c1.charAt(1)){r2 = this.getRank(c2.charAt(0));}//record rank for player 2
        if(c3.charAt(1) == c1.charAt(1)){r3 = this.getRank(c3.charAt(0));}
        if(c4.charAt(1) == c1.charAt(1)){r4 = this.getRank(c4.charAt(0));}
        if (r2 != 0){if (r2 > max){winner = 2; max = r2;}}
        if (r3 != 0){if (r3 > max){winner = 3; max = r3;}}
        if (r4 != 0){if (r4 > max){winner = 4; max = r4;}}
        if (winner == 1){wc=c1;}
        if (winner == 2){wc=c2;}
        if (winner == 3){wc=c3;}
        if (winner == 4){wc=c4;}
        return wc;
    }
    
}