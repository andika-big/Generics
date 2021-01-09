/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collection;

public class WildcardVSGenericsMethod {
   
    static void print(Collection<?> col) {
        for (Object o : col) {
            System.out.println(o);
        }
    }
    
   
    static <T> Collection arrayToCollection(T[] a) {
        Collection<T> c = new ArrayList();
        for (T o : a) {
            c.add(o);
        }
        return c;
    }
 
    public static void main(String[] args) {
        String[] sa = { "Happy", "Coding" };
        Collection r = arrayToCollection(sa);
        print(r);
    }
}
