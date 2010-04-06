// $ adchemy
// $

package com.cnet.ics;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonParser {
    public static List<String> parse(String filename) throws IOException {
        List<String> out = new ArrayList<String>();
        out.addAll(FileUtils.readLines(new File(filename)));
        return out;
    }
}
