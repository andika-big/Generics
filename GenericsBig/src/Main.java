/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList(); 
        lo.add("lo - String 1"); 
        lo.add(new Planet("Mercury", 0.06)); 
        for (Object o : lo) {
            Planet p = (Planet) o;
            p.print();
        }
        List<Planet> lp = new ArrayList(); 
        lp.add(new Planet("Mercury", 0.06)); 
        lp.add(new Planet("Venus", 0.82));
        for (Planet p : lp) {
            p.print();
        }
    }
}
