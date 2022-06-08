package de.maxhenkel.easyvillagers.gui;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.player.Inventory;

public class IncubatorScreen extends InputOutputScreen<IncubatorContainer> {

    public IncubatorScreen(IncubatorContainer container, Inventory playerInventory, Component name) {
        super(container, playerInventory, name);
    }

    @Override
    protected MutableComponent getTopText() {
        return Component.translatable("gui.easy_villagers.input_villagers");
    }

    @Override
    protected MutableComponent getBottomText() {
        return Component.translatable("gui.easy_villagers.output_villagers");
    }

}