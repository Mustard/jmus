package com.github.mustard.jmus;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class CmusClientTest {
    
    private CmusClient client;
    
    @Before
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
    
}
