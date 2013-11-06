package com.github.mustard.jmus;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Daniel
 */
public class CmusClientTest {
    
    private CmusClient client;
    
    @BeforeTest
    public void setUp() {
        client = new CmusClient("localhost", 8888, "foobar");
    }

    @Test
    public void shouldCreateHostname() {
        assertThat(client.getHost(), equalTo("localhost"));
    }
    
    @Test
    public void shouldCreatePortNumber() {
        assertThat(client.getPort(), equalTo(8888));        
    }
    
    @Test
    public void shouldCreatePassword() {
        assertThat(client.getPassword(), equalTo("foobar"));
    }
    
//    @Test
//    public void shouldSendCommand() {
//        assertThat(client.issueCommand(Volume.UP));
//    }
    
}
