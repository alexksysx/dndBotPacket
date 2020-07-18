package ru.alexksysx.dndpacket.packets;

import ru.alexksysx.dndpacket.BotPacket;
import ru.alexksysx.dndpacket.PacketType;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class JoinPacket implements BotPacket {
    @Override
    public int getId() {
        return PacketType.JOIN.getValue();
    }

    @Override
    public void writeData(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(getId());
        dataOutputStream.flush();
    }

    @Override
    public void readData(DataInputStream dataInputStream) throws IOException {
    }
}
