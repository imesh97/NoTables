package xyz.imdafatboss.notables;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.imdafatboss.notables.config.FileManager;

public class Home extends JavaPlugin implements Listener{

    FileManager fm = new FileManager(this);

    @Override
    public void onEnable(){

        this.getLogger().info("Created by imdafatboss.");
        fm.getConfig("config.yml").saveDefaultConfig();

    }

}
