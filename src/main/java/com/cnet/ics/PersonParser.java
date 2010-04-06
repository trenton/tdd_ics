// $ adchemy
// $

package com.cnet.ics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonParser {
    public static List<String> parse(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));

        List<String> out = new ArrayList<String>();

        String line = null;
        while((line = reader.readLine()) != null) {
            out.add(line);
        }


        return out;
    }
}
