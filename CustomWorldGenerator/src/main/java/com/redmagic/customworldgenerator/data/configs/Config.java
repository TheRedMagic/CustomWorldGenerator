package com.redmagic.customworldgenerator.data.configs;

import com.redmagic.customworldgenerator.data.ymlutil.YMLConfig;
import lombok.Getter;
import lombok.NonNull;
import org.bukkit.configuration.file.FileConfiguration;

public class Config extends YMLConfig {
    @Override
    public void createYML(String filePath) {
        super.createYML(filePath);
    }

    @Override
    public FileConfiguration getConfiguration(String filePath) {
        return super.getConfiguration(filePath);
    }

    @Override
    public void saveYML(String filePath) {
        super.saveYML(filePath);
    }

    @Override
    public void reloadYML(@NonNull String filePath) {
        super.reloadYML(filePath);
    }




}
