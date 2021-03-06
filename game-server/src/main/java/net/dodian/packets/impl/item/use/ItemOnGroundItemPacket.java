package net.dodian.packets.impl.item.use;

import lombok.Getter;
import net.dodian.old.net.packet.Packet;
import net.dodian.old.world.entity.impl.player.Player;
import net.dodian.packets.GamePacket;
import net.dodian.packets.Opcodes;
import org.springframework.stereotype.Component;

import static net.dodian.packets.PacketConstants.ITEM_ON_GROUND_ITEM_OPCODE;

@Component
@Getter
@Opcodes(ITEM_ON_GROUND_ITEM_OPCODE)
public class ItemOnGroundItemPacket extends GamePacket {

    @Override
    public ItemOnGroundItemPacket createFrom(Packet packet, Player player) {
        this.player = player;
        return this;
    }
}
