package com.noxcrew.noxesium.feature.rule;

import com.noxcrew.noxesium.api.protocol.rule.ServerRuleIndices;
import com.noxcrew.noxesium.feature.rule.impl.BooleanServerRule;
import com.noxcrew.noxesium.feature.rule.impl.CameraLockedRule;
import com.noxcrew.noxesium.feature.rule.impl.EnableMusicRule;
import com.noxcrew.noxesium.feature.rule.impl.IntegerServerRule;
import com.noxcrew.noxesium.feature.rule.impl.ItemStackServerRule;
import net.minecraft.world.item.ItemStack;

/**
 * A class that stores all known server rules.
 */
public class ServerRules {
    /**
     * If `true` disables the riptide spin attack on the trident from colliding with any entities,
     * useful for non-pvp mini-games where the trident is used as a movement tool.
     */
    public static ClientServerRule<Boolean> DISABLE_SPIN_ATTACK_COLLISIONS = new BooleanServerRule(ServerRuleIndices.DISABLE_SPIN_ATTACK_COLLISIONS, false);

    /**
     * An integer pixel amount to vertically offset the HUD held item name.
     * Useful for avoiding overlapping faction icons. Positive values move the text up.
     */
    public static ClientServerRule<Integer> HELD_ITEM_NAME_OFFSET = new IntegerServerRule(ServerRuleIndices.HELD_ITEM_NAME_OFFSET, 0);

    /**
     * Whether the player should currently prevent any mouse inputs from moving their camera.
     */
    public static ClientServerRule<Boolean> CAMERA_LOCKED = new CameraLockedRule(ServerRuleIndices.CAMERA_LOCKED);

    /**
     * Whether custom music is being used. When enabled vanilla background music is fully disabled.
     */
    public static ClientServerRule<Boolean> ENABLE_CUSTOM_MUSIC = new EnableMusicRule(ServerRuleIndices.DISABLE_VANILLA_MUSIC);

    /**
     * When true, disables boat collision on the client side, useful for movement games involving
     * boats and other entities in one area. Similar mechanism must exist server side to prevent lagbacks with this enabled.
     */
    public static ClientServerRule<Boolean> DISABLE_BOAT_COLLISIONS = new BooleanServerRule(ServerRuleIndices.DISABLE_BOAT_COLLISIONS, false);

    /**
     * Allows overriding the item that is used when resolving the capabilities of an empty item slot.
     */
    public static ClientServerRule<ItemStack> HAND_ITEM_OVERRIDE = new ItemStackServerRule(ServerRuleIndices.HAND_ITEM_OVERRIDE);

    /**
     * Allows server to override whether experimental UI optimizations are on.
     */
    public static ClientServerRule<Boolean> DISABLE_UI_OPTIMIZATIONS = new BooleanServerRule(ServerRuleIndices.DISABLE_UI_OPTIMIZATIONS, false);
}
