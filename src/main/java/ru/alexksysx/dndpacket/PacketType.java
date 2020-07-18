package ru.alexksysx.dndpacket;

import java.util.HashMap;
import java.util.Map;

public enum PacketType {
    AUTHORIZE(1),
    JOIN(2),
    LEAVE(3);


    private int value;
    private static Map map = new HashMap<>();

    PacketType(int value) {
        this.value = value;
    }

    static {
        for (PacketType t : PacketType.values()) {
            map.put(t.value, t);
        }
    }

    public int getValue() {
        return value;
    }

    public static PacketType valueOf(int packetType) {
        return (PacketType) map.get(packetType);
    }
}
