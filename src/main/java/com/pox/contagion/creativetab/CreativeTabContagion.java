package com.pox.contagion.creativetab;

import com.pox.contagion.reference.MainRef;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by surferconor425 on 17/04/2016.
 */
public class CreativeTabContagion
{
    public static final CreativeTabs ContagionTab = new CreativeTabs(MainRef.MODID)
    {
        @Override
        public Item getTabIconItem()
        {
            return null;
        }
    };
}