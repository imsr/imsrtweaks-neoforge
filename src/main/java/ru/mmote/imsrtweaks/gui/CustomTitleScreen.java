package ru.mmote.imsrtweaks.gui;

import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CustomTitleScreen extends TitleScreen {
    @Override
    protected void init() {
        super.init();
        var realmsButton = children().stream()
            .filter(e ->
                e instanceof Button btn
                    && btn.getMessage().getContents() instanceof TranslatableContents tr
                    && tr.getKey().equals("menu.online")
            )
            .findFirst();

        realmsButton.ifPresent(this::removeWidget);
    }


}
