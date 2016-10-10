package tr.xip.wanikani;

import junit.framework.TestCase;
import tr.xip.wanikani.JapaneseIME;

public class JapaneseIMETest extends TestCase {
    public void testKanjiToHiragana() {
        JapaneseIME.Replacement repl = new JapaneseIME().replace("kきく交わる", 6);
        assertNotNull(repl);
        assertEquals(1, repl.start);
        assertEquals(6, repl.end);
        assertEquals("きくまじわる", repl.text);
    }
}