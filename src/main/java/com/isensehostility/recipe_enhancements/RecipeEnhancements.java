package com.isensehostility.recipe_enhancements;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("recipe_enhancements")
public class RecipeEnhancements
{
    public static final String MOD_ID = "recipe_enhancements";
    private static final Logger LOGGER = LogManager.getLogger();

    public RecipeEnhancements() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
