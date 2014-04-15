package com.github.mustard.jmus.command;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class MetaTest {

    @Test
    public void shouldGetStatusCommand() throws Exception {
        Assert.assertThat(Meta.STATUS.getCommand(), equalTo("status"));
    }
}
