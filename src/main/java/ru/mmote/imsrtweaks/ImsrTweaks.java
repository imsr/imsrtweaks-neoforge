package ru.mmote.imsrtweaks;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ImsrTweaks.MODID)
public class ImsrTweaks
{
    public static final String MODID = "imsrtweaks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ImsrTweaks(IEventBus modEventBus, ModContainer modContainer)
    {}
}
