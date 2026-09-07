package com.nocttech.sonystand;

import static org.junit.Assert.assertArrayEquals;

import java.nio.charset.StandardCharsets;
import org.junit.Test;

public class SonyProtocolTest {
    @Test
    public void buildsRecoveredSonyCommands() {
        assertArrayEquals("%000*".getBytes(StandardCharsets.US_ASCII), SonyProtocol.initialize());
        assertArrayEquals("%4100*".getBytes(StandardCharsets.US_ASCII), SonyProtocol.stop());
        assertArrayEquals("%4101*".getBytes(StandardCharsets.US_ASCII), SonyProtocol.move(SonyProtocol.Speed.SLOW, SonyProtocol.Direction.RIGHT));
        assertArrayEquals("%4102*".getBytes(StandardCharsets.US_ASCII), SonyProtocol.move(SonyProtocol.Speed.SLOW, SonyProtocol.Direction.LEFT));
        assertArrayEquals("%4104*".getBytes(StandardCharsets.US_ASCII), SonyProtocol.move(SonyProtocol.Speed.SLOW, SonyProtocol.Direction.UP));
        assertArrayEquals("%4108*".getBytes(StandardCharsets.US_ASCII), SonyProtocol.move(SonyProtocol.Speed.SLOW, SonyProtocol.Direction.DOWN));
        assertArrayEquals("%4131*".getBytes(StandardCharsets.US_ASCII), SonyProtocol.move(SonyProtocol.Speed.VERY_FAST, SonyProtocol.Direction.RIGHT));
    }
}
