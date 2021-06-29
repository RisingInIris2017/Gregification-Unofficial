package gregification.config;

import gregification.util.GFValues;
import net.minecraftforge.common.config.Config;

@Config(modid = GFValues.MODID)
public class GFConfig {

    @Config.Comment("Config options for Ex Nihilo features")
    public static ExNihiloCfg exNihilo = new ExNihiloCfg();
}