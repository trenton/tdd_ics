// $ adchemy
// $

package com.cnet.ics;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"SuspiciousMethodCalls"})
public class Puzzle1 {
    public static void main(String[] args) {
        Set<Short> s = new HashSet<Short>();

        int count = 1;
        for (short i = 0; i < count; i++) {
            s.add(i);
            s.remove(i - 1);
        }

        System.out.println(s.size());
    }
}
