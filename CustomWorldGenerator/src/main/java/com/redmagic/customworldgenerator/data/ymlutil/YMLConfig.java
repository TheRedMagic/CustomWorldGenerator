package com.redmagic.customworldgenerator.data.ymlutil;

import com.redmagic.customworldgenerator.CWGPlugin;
import lombok.NonNull;
import lombok.SneakyThrows;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class YMLConfig {

    @NonNull private final Map<File, FileConfiguration> configHaspMap = new HashMap<>();

    public void createYML(@NonNull String filePath){
        CWGPlugin cwgPlugin = JavaPlugin.getPlugin(CWGPlugin.class);
        if (!getFile(filePath).exists()){getFile(filePath).getParentFile().mkdirs();}
        cwgPlugin.saveResource(filePath, false);
        getConfiguration(filePath);
    }

    @SneakyThrows
    public void saveYML(@NonNull String filePath){
        if (configHaspMap.containsKey(getFile(filePath))) {
            configHaspMap.get(getFile(filePath)).save(getFile(filePath));
        }
    }

    public @NonNull FileConfiguration getConfiguration(@NonNull String filePath){
        if (configHaspMap.containsKey(getFile(filePath))){
            return configHaspMap.get(getFile(filePath));
        }else {
            FileConfiguration configuration = YamlConfiguration.loadConfiguration(getFile(filePath));
            configHaspMap.put(getFile(filePath), configuration);
            return configuration;
        }
    }

    public @NonNull File getFile(@NonNull String filePath){
        CWGPlugin cwgPlugin = JavaPlugin.getPlugin(CWGPlugin.class);
        return new File(cwgPlugin.getDataFolder() + filePath);
    }

    public void reloadYML(@NonNull String filePath){
        configHaspMap.put(getFile(filePath), YamlConfiguration.loadConfiguration(getFile(filePath)));
    }
}
