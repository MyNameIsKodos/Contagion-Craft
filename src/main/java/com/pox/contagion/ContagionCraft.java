package com.pox.contagion;

import com.pox.contagion.proxy.IProxy;
import com.pox.contagion.reference.MainRef;
import com.pox.contagion.utility.LogHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by surferconor425 on 16/04/2016.
 */
@Mod(modid = MainRef.MODID, name = MainRef.MODNAME, version = MainRef.VERSION)
public class ContagionCraft
{
    @SidedProxy(clientSide = MainRef.CLIENT_PROXY_CLASS, serverSide = MainRef.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.Instance(MainRef.MODID)
    public static com.pox.contagion.ContagionCraft instance;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Pre Initialization Complete");

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}

