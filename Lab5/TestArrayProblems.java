import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestArrayProblems {

    private static final int SEED = 12345;
    private static final int RUNS = 100;
    private static final int SIZE = 100;
    private ArrayProblems ap = new ArrayProblems();
  
    @Test
    public void testEveryOther() {
        java.util.Random rng = new java.util.Random(SEED);
        int[] a = new int[RUNS];
        for(int i = 0; i < RUNS; i++) {
            a[i] = rng.nextInt(100000) - 50000;
        }
        for(int i = 0; i < RUNS; i++) {
            int[] b = new int[i];
            System.arraycopy(a, 0, b, 0, i);
            int[] c = ap.everyOther(b);
            System.arraycopy(a, 0, b, 0, i);
            assertEquals(c.length, b.length / 2 + b.length % 2);
            for(int j = 0; j < c.length; j++) {
                assertEquals(c[j], b[j*2]);
            }
        }
    }
    
    @Test
    public void testCountInversions() {
        java.util.Random rng = new java.util.Random(SEED);
        for(int t = 0; t < RUNS; t++) {
            int[] a = new int[SIZE];
            for(int i = 0; i < a.length; i++) {
                a[i] = rng.nextInt(2000) - 1000;
            }
            int inv = ap.countInversions(a);
            int count = 0;
            for(int i = 0; i < a.length; i++) {
                int j = i;
                while(j > 0 && a[j] < a[j-1]) {
                    count++;
                    int tmp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = tmp;
                    j = j - 1;
                }
            }
            assertEquals(inv, count);
        }
    }
    
    @Test
    public void testSqueezeLeft() {
        Random rng = new Random(SEED);
        ArrayList<Integer> al1 = new ArrayList<Integer>(10 * RUNS);
        ArrayList<Integer> al2 = new ArrayList<Integer>(10 * RUNS);
        
        for(int i = 0; i < RUNS; i++) {
            al1.clear();
            al2.clear();
            for(int j = 0; j < RUNS; j++) {
                int d = rng.nextInt(100000) - 50000;
                if(d == 0) { d = 1; }
                al1.add(d);
                int zeros = rng.nextInt(20);
                for(int k = 0; k < zeros; k++) {
                    al2.add(0);
                }
                al2.add(d);
            }
            while(al1.size() < al2.size()) { al1.add(0); }   
            int[] a1 = new int[al1.size()];
            int[] a2 = new int[al2.size()];
            int loc = 0;
            for(Integer e: al1) { a1[loc++] = e; }
            loc = 0;
            for(Integer e: al2) { a2[loc++] = e; }
            ap.squeezeLeft(a2);
            assertArrayEquals(a1, a2);
        }
    }
    
    @Test
    public void testRunDecode() {
        Random rng = new Random(SEED);
        for(int i = 0; i < RUNS; i++) {
            int len = rng.nextInt(100);
            int[] a = new int[len * 2];
            for(int j = 0; j < len; j++) {
                a[2*j] = rng.nextInt(20);
                a[2*j + 1] = rng.nextInt(1000) - 500; 
            }
            int[] b = ap.runDecode(a);
            int loc = 0;
            for(int j = 0; j < len; j++) {
                for(int k = 0; k < a[2*j]; k++) {
                    assertTrue(loc < b.length);
                    assertTrue(b[loc++] == a[2*j + 1]);
                }
            }
            assertTrue(loc == b.length);
        }
    }
}
