package net.dodian.plugins.impl;

import net.dodian.game.events.EventHandler;
import net.dodian.game.events.EventListener;
import net.dodian.game.events.impl.player.interact.npc.PlayerAttackNpcEvent;
import org.springframework.stereotype.Component;

@Component
public class DadBossPlugin implements EventListener {

    @EventHandler
    public Boolean onAttackDad(PlayerAttackNpcEvent event) {
        if(event.getNpc().getId() != 4130) {
            return true;
        }

        if(event.player.skillManager.getCombatLevel() < 50) {
            event.player.packetSender.sendMessage("You need to be more than 50 combat to attack Dad.");
            return false;
        }

        return true;
    }
}
