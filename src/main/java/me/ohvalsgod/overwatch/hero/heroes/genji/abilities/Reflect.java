package me.ohvalsgod.overwatch.hero.heroes.genji.abilities;

import me.ohvalsgod.overwatch.hero.abilities.Ability;
import me.ohvalsgod.overwatch.util.cooldown.Cooldown;
import org.bukkit.entity.Player;

public class Reflect implements Ability {

    @Override
    public String getName() {
        return "Reflect";
    }

    @Override
    public String getFancyName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getFancyDescription() {
        return null;
    }

    @Override
    public void cast(Player player) {

    }

    @Override
    public Cooldown getCooldown() {
        return new Cooldown(8);
    }

}
