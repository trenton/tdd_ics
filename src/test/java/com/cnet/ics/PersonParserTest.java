// $ adchemy
// $

package com.cnet.ics;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PersonParserTest {
    @Test
    public void testNoop() throws IOException {
        List<String> lines = PersonParser.parse("src/test/resources/people.txt");
        assertThat(lines.size(), is(4));
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileNotFound() throws IOException {
        PersonParser.parse("/no/way/monet");
    }
}
