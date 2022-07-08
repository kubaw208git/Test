package me.kubaw208.Test.main;

import me.kubaw208.Test.events.Events;
import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {

    public static Test plugin;

    @Override
    public void onEnable() {
        plugin = this;

        getServer().getPluginManager().registerEvents(new Events(), this);
    }

}
