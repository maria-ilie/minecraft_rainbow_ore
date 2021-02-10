package com.maria.mccourse.block;


import net.minecraft.block.AbstractBlock;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RainbowOre extends OreBlock
{
    public RainbowOre()
    {
        super(AbstractBlock.Properties.create(Material.ROCK)
                .hardnessAndResistance(3f, 10f)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE));
    }
}
