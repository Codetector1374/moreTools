package cn.codetector.minecraft.moreTools;

import cn.codetector.minecraft.moreTools.Items.ObsidianPickaxe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Codetector on 2015/11/11.
 *
 * @author Codetector
 */
@Mod(modid = MoreToolsBase.MODID, version = MoreToolsBase.VERSION)
public class MoreToolsBase {
    public static final String MODID = "moretools";
    public static final String VERSION = "1.0.0";
    public static Item obsidianPickaxe;
    @EventHandler
    public void init(FMLInitializationEvent event){

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        obsidianPickaxe = new ObsidianPickaxe();

        GameRegistry.registerItem(obsidianPickaxe, "ObsidianPickaxe");
    }
}
