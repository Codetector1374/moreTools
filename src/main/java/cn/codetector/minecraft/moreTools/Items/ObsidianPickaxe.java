package cn.codetector.minecraft.moreTools.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Codetector on 2015/11/11.
 *
 * @author Codetector
 */
public class ObsidianPickaxe extends ItemPickaxe{
    public static ToolMaterial MaterialObsidian = EnumHelper.addToolMaterial("OBSIDIAN",4,4000,40F,8,14);
    public ObsidianPickaxe(){
        super(ObsidianPickaxe.MaterialObsidian);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabTools);
        setUnlocalizedName("obsidianpickaxe");
        setTextureName("moretools:obsidianpickaxe");
    }

    @Override
    public float func_150893_a(ItemStack p_150893_1_, Block block) {

        if(block == Blocks.bedrock){
            return -0.1f;
        }

        if(block == Blocks.obsidian){
            return 120F;
        }else if(block.getMaterial() == Material.rock || block.getMaterial() == Material.iron || block.getMaterial() == Material.anvil){
            return 40F;
        }else{
            return 1F;
        }
    }

    @Override
    public boolean func_150897_b(Block block) {
        if(block == Blocks.bedrock){
            return true;
        }else {
            return super.func_150897_b(block);
        }
    }
}
