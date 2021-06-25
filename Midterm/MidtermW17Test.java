import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;
import java.io.*;

import java.util.zip.Adler32;

/**
 * The test class MidtermW17Test.
 *
 * @author  Ilkka Kokkarinen
 * @version February 6, 2017
 */

public class MidtermW17Test {
    
    private static final int SEED = 7654321;
    private static final int TRIALS = 100000;
    
    @Test
    public void testIsTriangle() {
        MidtermW17 mp = new MidtermW17();
        Random rng = new Random(SEED);
        Adler32 check = new Adler32();
        for(int i = 0; i < TRIALS; i++) {
            int a = rng.nextInt(200) - 20;
            int b = rng.nextInt(200) - 20;
            int c = rng.nextInt(200) - 20;
            boolean ans = mp.isTriangle(a, b, c);
            if(ans) { check.update(i); } else { check.update(~i); }
        }
        assertEquals(check.getValue(), 3607100211L);
    }
    
    @Test
    public void testDisjointDifference() {
        MidtermW17 mp = new MidtermW17();
        Random rng = new Random(SEED);
        Adler32 check = new Adler32();
        for(int i = 0; i < TRIALS; i++) {
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            int l1 = rng.nextInt((int)Math.sqrt(i + 2));
            int l2 = rng.nextInt((int)Math.sqrt(i + 2));
            for(int j = 0; j < l1; j++) { s1.append((char)(100 + rng.nextInt(300))); }
            for(int j = 0; j < l2; j++) { s2.append((char)(100 + rng.nextInt(300))); }
            String result = mp.disjointDifference(s1.toString(), s2.toString());
            check.update(result.getBytes());
        }
        assertEquals(check.getValue(), 2422380104L);
    }
    
    @Test
    public void testLargestDigit() {
        MidtermW17 mp = new MidtermW17();
        Random rng = new Random(SEED);
        Adler32 check = new Adler32();
        for(int i = 0; i < TRIALS; i++) {
            int v = rng.nextInt(2_000_000_000) - 1_000_000_000;
            int ans = mp.largestDigit(v);
            check.update(ans);
        }
        assertEquals(check.getValue(), 2470501316L);
    }
    
    @Test
    public void testPatternMatch() {
        MidtermW17 mp = new MidtermW17();
        Random rng = new Random(SEED);
        Adler32 check = new Adler32();
        int count = 0;
        for(int i = 0; i < TRIALS; i++) {
            StringBuilder s1 = new StringBuilder();
            StringBuilder s2 = new StringBuilder();
            int len = rng.nextInt(40 + 10 * (i % 5));
            for(int j = 0; j < len; j++) {
                char c1 = (char)(rng.nextInt(20000) + 100);
                char c2 = c1;
                if(rng.nextInt(100) < 30) { c2 = (char)(rng.nextInt(20000) + 100); }
                if(rng.nextInt(100) < 20) { c2 = Character.toUpperCase(c2); }
                if(rng.nextInt(100) < 20) { c2 = Character.toLowerCase(c2); }
                if(rng.nextInt(100) < 5) { c2 = '?'; }
                if(rng.nextInt(100) < 5) { c1 = '?'; }
                s1.append(c1);
                s2.append(c2);
            }
            boolean ans = mp.patternMatch(s1.toString(), s2.toString());
            if(ans) { count++; check.update(i); } else { check.update(~i); }
        }
        assertEquals(count, 6401);
        assertEquals(check.getValue(), 2683356352L);
    }
}
