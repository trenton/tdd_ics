// $ adchemy
// $

package com.cnet.ics;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PersonParser {
    public static List<String> parse(String filename) throws IOException {
        return FileUtils.readLines(new File(filename));
    }
}
