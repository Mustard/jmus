package com.github.mustard.jmus;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Daniel
 */
public class ResponseTest {

    private Response response;

    @Before
    public void setUp() {
        response = Response.parse(
                "status playing\n"
                        + "file /media/my_book/shared/music/Dire Straits/Sultans of Swing- The Very Best of Dire Straits/15 Your Latest Trick [Live].wma\n"
                        + "duration 341\n"
                        + "position 262\n"
                        + "tag title Your Latest Trick [Live]\n"
                        + "tag artist Dire Straits\n"
                        + "tag date 1998\n"
                        + "tag genre Rock\n"
                        + "tag album Sultans of Swing: The Very Best of Dire Straits\n"
                        + "tag albumartist Dire Straits\n"
                        + "tag tracknumber 15\n"
                        + "set aaa_mode all\n"
                        + "set continue true\n"
                        + "set play_library false\n"
                        + "set play_sorted false\n"
                        + "set replaygain disabled\n"
                        + "set replaygain_limit true\n"
                        + "set replaygain_preamp 6.000000\n"
                        + "set repeat true\n"
                        + "set repeat_current false\n"
                        + "set shuffle true\n"
                        + "set softvol false\n"
                        + "set vol_left 76\n"
                        + "set vol_right 76\n"
        );
    }

    @Test
    public void shouldReturnNullOnNull() {
        assertNull(Response.parse(null));
    }

    @Test
    public void shouldParseStatus() {
        assertThat(response.getStatus(), equalTo("playing"));
    }

    @Test
    public void shouldParseNowPlayingTitle() {
        assertThat(response.getNowPlayingTitle(), is("Your Latest Trick [Live]"));
    }

    @Test
    public void shouldParseNowPlayingArtist() {
        assertThat(response.getNowPlayingArtist(), equalTo("Dire Straits"));
    }

}
