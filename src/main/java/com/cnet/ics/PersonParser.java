// $ adchemy
// $

package com.cnet.ics;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PersonParser {
    public static List<String> parse(String filename) throws IOException {
        return FileUtils.readLines(new File(filename));
    }
}
