package ru.alexksysx.dndpacket.packets;

import ru.alexksysx.dndpacket.BotPacket;
import ru.alexksysx.dndpacket.ClientIdentity;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class AuthorizePacket implements BotPacket {
    private ClientIdentity identity;

    public ClientIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(ClientIdentity identity) {
        this.identity = identity;
    }

    @Override
    public short getId() {
        return 0;
    }

    @Override
    public void writeData(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(getId());
        dataOutputStream.writeInt(identity.getValue());
        dataOutputStream.flush();
    }

    @Override
    public void readData(DataInputStream dataInputStream) throws IOException {
        identity = ClientIdentity.valueOf(dataInputStream.readInt());
    }
}
