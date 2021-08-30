package isensehostility.recipe_enhancements;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("recipe_enhancements")
public class RecipeEnhancements
{
    public RecipeEnhancements() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
