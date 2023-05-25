package com.redmagic.customworldgenerator.data;

import com.redmagic.customworldgenerator.CWGPlugin;
import lombok.NonNull;

public class ConfigManager {


    private final CWGPlugin plugin;

    public ConfigManager(@NonNull CWGPlugin plugin){
        this.plugin = plugin;
    }


}
