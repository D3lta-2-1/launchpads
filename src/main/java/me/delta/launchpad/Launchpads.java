package me.delta.launchpad;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Launchpads implements ModInitializer {
    public static final String MOD_ID = "launchpad";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize()
    {
        LaunchPadBlocks.register();
        LaunchPadItems.register();
        LOGGER.info("Initializing Launchpads");
    }

    /**
     * @param launchpad The launchpad to set the yaw from
     * @return The yaw of the launchpad
     */
    public static ItemStack setYaw(ItemStack launchpad, float yaw)
    {
        launchpad.getOrCreateSubNbt("BlockEntityTag").putFloat("yaw", yaw);
        return launchpad;
    }

    /**
     * @param launchpad The launchpad to set the pitch from
     * @return The pitch of the launchpad
     */
    public static ItemStack setPitch(ItemStack launchpad, float pitch)
    {
        launchpad.getOrCreateSubNbt("BlockEntityTag").putFloat("pitch", Math.max(pitch, 0));
        return launchpad;
    }

    /**
     * @param launchpad The launchpad to set the power from
     * @return The power of the launchpad
     */
    public static ItemStack setPower(ItemStack launchpad, float power)
    {
        launchpad.getOrCreateSubNbt("BlockEntityTag").putFloat("power", power);
        return launchpad;
    }
}
