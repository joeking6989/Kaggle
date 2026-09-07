package com.nocttech.sonystand;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class MainActivityContractTest {
    @Test
    public void controllerActivityExists() throws Exception {
        assertNotNull(Class.forName("com.nocttech.sonystand.MainActivity"));
    }
}
