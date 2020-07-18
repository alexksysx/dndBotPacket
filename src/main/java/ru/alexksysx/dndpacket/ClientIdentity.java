package ru.alexksysx.dndpacket;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public enum ClientIdentity implements Serializable {
    BOT(1),
    PANEL(2);

    private int value;
    private static Map map = new HashMap<>();

    private ClientIdentity(int value) {
        this.value = value;
    }

    static {
        for (ClientIdentity c : ClientIdentity.values()) {
            map.put(c.value, c);
        }
    }

    public int getValue() {
        return value;
    }

    public static ClientIdentity valueOf(int clientIdentity) {
        return (ClientIdentity) map.get(clientIdentity);
    }

}
