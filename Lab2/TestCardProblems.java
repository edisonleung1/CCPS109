import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.zip.Adler32;

public class TestCardProblems {

    private static final int SEED = 12345;
    private static final int RUNS = 100000;
    private static final int SIZE = 100;
    private CardProblems cp = new CardProblems();
    
    private String createHand(Random rng, int len) {
        String result = "";
        for(int i = 0; i < len; i++) {
            String card = "";
            outer:
            while(true) {
                card = "23456789TJQKA".charAt(rng.nextInt(13)) + "" + "cdhs".charAt(rng.nextInt(4));
                for(int j = 0; j < result.length(); j += 2) {
                    if(result.substring(j, j + 2).equals(card)) { continue outer; }
                }
                break;
            }
            result += card;
        }
        return result;
    }
    
    @Test
    public void testHasFlush() {
        java.util.Random rng = new java.util.Random(SEED);
        Adler32 check = new Adler32();
        for(int i = 0; i < RUNS; i++) {
            String hand = createHand(rng, 5);
            check.update(cp.hasFlush(hand) ? i : ~i);
        }
        assertEquals(check.getValue(), 1990048361L);
    }
    
    @Test
    public void testFourOfAKind() {
        java.util.Random rng = new java.util.Random(SEED);
        Adler32 check = new Adler32();
        for(int i = 0; i < RUNS; i++) {
            String hand = createHand(rng, 5);
            check.update(cp.hasFourOfAKind(hand) ? i : ~i);
        }
        assertEquals(check.getValue(), 3699029383L);
    }
    
    @Test
    public void testWinningCard() {
        java.util.Random rng = new java.util.Random(SEED);
        Adler32 check = new Adler32();
        for(int i = 0; i < RUNS; i++) {
            String hand = createHand(rng, 4);
            check.update(cp.winningCard(hand).getBytes());
        }
        assertEquals(check.getValue(), 2975449442L);
    }
    
    @Test
    public void testHasFourCardBadugi() {
        java.util.Random rng = new java.util.Random(SEED);
        Adler32 check = new Adler32();
        for(int i = 0; i < RUNS; i++) {
            String hand = createHand(rng, 4);
            check.update(cp.hasFourCardBadugi(hand) ? i : ~i);
        }
        assertEquals(check.getValue(), 2525277488L);
    }
}
