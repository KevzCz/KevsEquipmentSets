package net.kevsequipmentsets;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KevsEquipmentSets implements ModInitializer {
    public static String MOD_ID = " kevsequipmentsets";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Hello from " + MOD_ID + "!");
        LOGGER.info("Loading gear core data pack for " + MOD_ID);
    }
}