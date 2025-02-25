package ru.mmote.imsrtweaks;

import net.minecraft.client.gui.screens.TitleScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ScreenEvent;
import ru.mmote.imsrtweaks.gui.CustomTitleScreen;


@EventBusSubscriber(modid = ImsrTweaks.MODID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void onScreenOpen(ScreenEvent.Opening e) {
        if (e.getNewScreen() instanceof TitleScreen) {
            e.setNewScreen(new CustomTitleScreen());
        }
    }
}
