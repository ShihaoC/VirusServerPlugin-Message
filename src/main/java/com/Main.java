package com;

import com.listener.playerJoin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;

    public static Plugin getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        // Plugin startup logic
        System.out.println();
        getLogger().info("");
        getLogger().info("\n    _       __     __                          __  ___          \n" +
                "   | |     / /__  / /________  ____ ___  ___  /  |/  /________ _\n" +
                "   | | /| / / _ \\/ / ___/ __ \\/ __ `__ \\/ _ \\/ /|_/ / ___/ __ `/\n" +
                "   | |/ |/ /  __/ / /__/ /_/ / / / / / /  __/ /  / (__  ) /_/ / \n" +
                "   |__/|__/\\___/_/\\___/\\____/_/ /_/ /_/\\___/_/  /_/____/\\__, /  \n" +
                "                                                       /____/   \n");
        getLogger().info("");
        System.out.println();
        getServer().getPluginManager().registerEvents(new playerJoin(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("退出");
    }
}
