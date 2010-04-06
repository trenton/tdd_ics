// $ adchemy
// $

package com.cnet.ics;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class UnitTest {
    @Test
    public void testNoop() throws IOException {
        assertThat(true, is(true));

        List<String> lines = PersonParser.parse("/var/tmp/people.txt");

        assertThat(lines.size(), is(3));
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileNotFound() throws IOException {
        PersonParser.parse("/no/way/monet");
    }
}
