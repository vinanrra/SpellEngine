package net.spell_engine.internals;

import net.spell_engine.api.spell.Spell;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.spell_engine.api.spell.SpellContainer;

import java.util.List;

public interface SpellCasterClient extends SpellCasterEntity {
    List<Entity> getCurrentTargets();
    Entity getCurrentFirstTarget();
    boolean hasAmmoToStart(SpellContainer container, ItemStack itemStack);
    void castStart(SpellContainer spell, ItemStack itemStack, int remainingUseTicks);
    void castTick(ItemStack itemStack, int remainingUseTicks);
    void castRelease(ItemStack itemStack, int remainingUseTicks);
}
