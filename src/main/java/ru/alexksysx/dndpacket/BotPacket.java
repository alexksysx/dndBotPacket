package ru.alexksysx.dndpacket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public interface BotPacket {
    short getId();

    void writeData(DataOutputStream dataOutputStream) throws IOException;

    void readData(DataInputStream dataInputStream) throws IOException;
}
