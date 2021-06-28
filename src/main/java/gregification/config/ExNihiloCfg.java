package gregification.config;

import gregification.util.GFValues;
import net.minecraftforge.common.config.Config;

@Config(modid = GFValues.MODID)
public class ExNihiloCfg {

    @Config.Comment("Enable Ex Nihilo integration")
    @Config.RequiresMcRestart
    public boolean enableExNihilo = true;

    @Config.Comment("") // todo
    @Config.RequiresMcRestart
    public boolean highTierSieve = true;

    @Config.Comment("Config category for sieve drops")
    @Config.RequiresMcRestart
    public SieveCategory drops = new SieveCategory();

    public static class SieveCategory {

        @Config.Comment("Sand Sieve drop list. Format is: { Material(string), Chance(double), Mesh Level(int) }. If empty, none will be generated")
        public String[] sandSieveDrops = new String[] {
                "tenorite", "0.1836", "2",
                "copper", "0.0612", "2",
                "cuprite", "0.0612", "2",
                "redstone", "0.1938", "2",
                "cinnabar", "0.0646", "2",
                "chromite", "0.01615", "2",
                "almandine", "0.0816", "2",
                "pyrope", "0.0816", "2",
                "sapphire", "0.0816", "2",
                "green_sapphire", "0.0272", "2",

                "chalcopyrite", "0.0969", "3",
                "iron", "0.0969", "3",
                "pyrite", "0.0969", "3",
                "copper", "0.0323", "3",
                "brown_limonite", "0.0507", "3",
                "yellow_limonite", "0.0507", "3",
                "banded_iron", "0.0507", "3",
                "malachite", "0.0169", "3",
                "garnierite", "0.0546", "3",
                "nickel", "0.0546", "3",
                "cobaltite", "0.0546", "3",
                "pentlandite", "0.0182", "3",
                "bentonite", "0.0507", "3",
                "magnesite", "0.0507", "3",
                "olivine", "0.0507", "3",
                "glauconite", "0.0169", "3",

                "beryllium", "0.0845", "4",
                "emerald", "0.0507", "4",
                "thorium", "0.0338", "4",
                "grossular", "0.0507", "4",
                "spessartine", "0.0507", "4",
                "pyrolusite", "0.0507", "4",
                "tantalite", "0.0169", "4"
        };

        @Config.Comment("Gravel Sieve drop list. Format is: { Material(string), Chance(double), Mesh Level(int) }. If empty, none will be generated")
        public String[] gravelSieveDrops = new String[] {
                "lignite", "0.064", "1",
                "coal", "0.192", "1",
                "dolomite", "0.0507", "1",
                "wollastonite", "0.0507", "1",
                "trona", "0.0507", "1",
                "andradite", "0.0169", "1",
                "lignite", "0.285", "1",
                "coal", "0.095", "1",
                "salt", "0.0952", "1",
                "rockSalt", "0.0833", "1",
                "lepidolite", "0.0357", "1",
                "spodumene", "0.0238", "1",
                "tin", "0.24225", "1",
                "cassiterite", "0.08075", "1",
                "basaltic_mineral_sand", "0.0546", "1",
                "granitic_mineral_sand", "0.0546", "1",
                "fullers_earth", "0.0364", "1",
                "gypsum", "0.0364", "1",

                "galena", "0.104", "2",
                "lead", "0.052", "2",
                "silver", "0.052", "2",
                "kaolinite", "0.0507", "2",
                "zeolite", "0.0507", "2",
                "fullers_earth", "0.0338", "2",
                "glauconite_sand", "0.0338", "2",
                "oilsands", "0.225", "2",
                "cassiterite_sand", "0.0432", "2",
                "garnet_sand", "0.0432", "2",
                "asbestos", "0.0432", "2",
                "diatomite", "0.0144", "2",

                "platinum", "0.07605", "3",
                "palladium", "0.05915", "3",
                "iridium", "0.0338", "3"
        };

        @Config.Comment("Granite Sieve drop list. Format is: { Material(string), Chance(double), Mesh Level(int) }. If empty, none will be generated")
        public String[] graniteSieveDrops = new String[] {
                "apatite", "0.1014", "1",
                "phosphor", "0.0676", "1",
                "bauxite", "0.153", "1",
                "aluminium", "0.0765", "1",
                "ilmenite", "0.0255", "1",
                "magnetite", "0.2505", "1",
                "iron", "0.0627", "1",
                "vanadium_magnetite", "0.0627", "1",
                "gold", "0.0418", "1",
                "quartzite", "0.09945", "1",
                "barite", "0.05525", "1",
                "certus_quartz", "0.0663", "1",
                "tennantite", "0.0663", "1",
                "tetrahedrite", "0.1836", "1",
                "copper", "0.0612", "1",
                "stibnite", "0.0612", "1",

                "redstone", "0.1938", "2",
                "ruby", "0.0646", "2",
                "cinnabar", "0.0646", "2",
                "chromite", "0.01615", "2",
                "bornite", "0.0969", "2",
                "chalcocite", "0.0969", "2",
                "enargite", "0.0969", "2",
                "copper", "0.0323", "2",
                "lazurite", "0.0585", "2",
                "sodalite", "0.039", "2",
                "lapis", "0.06825", "2",
                "calcite", "0.02925", "2",
                "topaz", "0.06", "2",
                "blueTopaz", "0.04", "2",

                "chalcopyrite", "0.0969", "3",
                "iron", "0.0969", "3",
                "pyrite", "0.0969", "3",
                "copper", "0.0323", "3",
                "brown_limonite", "0.0507", "3",
                "yellow_limonite", "0.0507", "3",
                "banded)iron", "0.0507", "3",
                "malachite", "0.0169", "3",
                "bastnasite", "0.1014", "3",
                "monazite", "0.0338", "3",
                "neodymium", "0.0338", "3",
                "garnierite", "0.0546", "3",
                "nickel", "0.0546", "3",
                "cobaltite", "0.0546", "3",
                "pentlandite", "0.0182", "3",
                "pitchblende", "0.0845", "3",
                "uraninite", "0.0676", "3",
                "uranium", "0.0169", "3",
                "kyanite", "0.0546", "3",
                "mica", "0.0546", "3",
                "cassiterite", "0.0364", "3",
                "pollucite", "0.0364", "3",

                "graphite", "0.1014", "4",
                "diamond", "0.0338", "4",
                "coal", "0.0338", "4",
                "wulfenite", "0.0676", "4",
                "molybdenite", "0.0676", "4",
                "powellite", "0.0338", "4",
                "soapstone", "0.056", "4",
                "talc", "0.056", "4",
                "glauconite", "0.056", "4",
                "pentlandite", "0.056", "4",
                "scheelite", "0.1014", "4",
                "tungstate", "0.0338", "4",
                "lithium", "0.0338", "4"
        };

        @Config.Comment("Diorite Sieve drop list. Format is: { Material(string), Chance(double), Mesh Level(int) }. If empty, none will be generated")
        public String[] dioriteSieveDrops = new String[] {
                "bauxite", "0.153", "1",
                "aluminium", "0.0765", "1",
                "ilmenite", "0.0255", "1",
                "chalcopyrite", "0.0585", "1",
                "vermiculite", "0.0585", "1",
                "cassiterite", "0.0585", "1",
                "alunite", "0.0195", "1",
                "quartzite", "0.09945", "1",
                "barite", "0.05525", "1",
                "certus_quartz", "0.0663", "1",
                "tennantite", "0.0663", "1",
                "tin", "0.24225", "1",
                "cassiterite", "0.08075", "1",

                "bornite", "0.0969", "2",
                "chalcocite", "0.0969", "2",
                "enargite", "0.0969", "2",
                "copper", "0.0323", "2",
                "galena", "0.104", "2",
                "lead", "0.052", "2",
                "silver", "0.052", "2",
                "lazurite", "0.0585", "2",
                "sodalite", "0.039", "2",
                "lapis", "0.06825", "2",
                "calcite", "0.02925", "2",

                "brown_limonite", "0.0507", "3",
                "yellow_limonite", "0.0507", "3",
                "banded_iron", "0.0507", "3",
                "malachite", "0.0169", "3",
                "pitchblende", "0.0845", "3",
                "uraninite", "0.0676", "3",
                "uranium", "0.0169", "3",
                "kyanite", "0.0546", "3",
                "mica", "0.0546", "3",
                "cassiterite", "0.0364", "3",
                "pollucite", "0.0364", "3",

                "graphite", "0.1014", "4",
                "diamond", "0.0338", "4",
                "coal", "0.0338", "4",
                "soapstone", "0.056", "4",
                "talc", "0.056", "4",
                "glauconite", "0.056", "4",
                "pentlandite", "0.056", "4"
        };

        @Config.Comment("Andesite Sieve drop list. Format is: { Material(string), Chance(double), Mesh Level(int) }. If empty, none will be generated")
        public String[] andesiteSieveDrops = new String[] {
                "redstone", "0.1938", "2",
                "ruby", "0.0646", "2",
                "cinnabar", "0.0646", "2",
                "chromite", "0.01615", "2",
                "almandine", "0.0816", "2",
                "pyrope", "0.0816", "2",
                "sapphire", "0.0816", "2",
                "green_sapphire", "0.0272", "2",
                "topaz", "0.06", "2",
                "blue_topaz", "0.04", "2",

                "chalcopyrite", "0.0969", "3",
                "iron", "0.0969", "3",
                "pyrite", "0.0969", "3",
                "copper", "0.0323", "3",
                "brown_limonite", "0.0507", "3",
                "yellow_limonite", "0.0507", "3",
                "banded_iron", "0.0507", "3",
                "malachite", "0.0169", "3",
                "bastnasite", "0.1014", "3",
                "monazite", "0.0338", "3",
                "neodymium", "0.0338", "3",
                "garnierite", "0.0546", "3",
                "nickel", "0.0546", "3",
                "cobaltite", "0.0546", "3",
                "pentlandite", "0.0182", "3",
                "bentonite", "0.0507", "3",
                "magnesite", "0.0507", "3",
                "olivine", "0.0507", "3",
                "glauconite", "0.0169", "3",
                "pitchblende", "0.0845", "3",
                "uraninite", "0.0676", "3",
                "uranium", "0.0169", "3",

                "beryllium", "0.0845", "4",
                "emerald", "0.0507", "4",
                "thorium", "0.0338", "4",
                "graphite", "0.1014", "4",
                "diamond", "0.0338", "4",
                "coal", "0.0338", "4",
                "soapstone", "0.056", "4",
                "talc", "0.056", "4",
                "glauconite", "0.056", "4",
                "pentlandite", "0.056", "4",
                "scheelite", "0.1014", "4",
                "tungstate", "0.0338", "4",
                "lithium", "0.0338", "4"
        };

        @Config.Comment("Netherrack Sieve drop list. Format is: { Material(string), Chance(double), Mesh Level(int) }. If empty, none will be generated")
        public String[] netherrackSieveDrops = new String[] {
                "chalcopyrite", "0.0432", "2",
                "iron", "0.0432", "2",
                "pyrite", "0.0432", "2",
                "copper", "0.0144", "2",
                "brown_limonite", "0.0324", "2",
                "yellow_limonite", "0.0324", "2",
                "banded_iron", "0.0324", "2",
                "malachite", "0.0108", "2",
                "magnetite", "0.1428", "2",
                "iron", "0.0357", "2",
                "vanadium_magnetite", "0.0357", "2",
                "gold", "0.0238", "2",
                "nether_quartz", "0.324", "2",
                "sulfur", "0.1632", "2",
                "pyrite", "0.0544", "2",
                "sphalerite", "0.0544", "2",
                "tennantite", "0.0816", "2",
                "tetrahedrite", "0.0936", "2",
                "copper", "0.0312", "2",
                "stibnite", "0.0312", "2",

                "garnierite", "0.0189", "4",
                "nickel", "0.0189", "4",
                "cobaltite", "0.0189", "4",
                "pentlandite", "0.0063", "4",
                "redstone", "0.0864", "4",
                "ruby", "0.0288", "4",
                "cinnabar", "0.0288", "4",
                "chromite", "0.0072", "4",
                "topaz", "0.0294", "4",
                "blue_topaz", "0.0196", "4"
        };

        @Config.Comment("Endstone Sieve drop list. Format is: { Material(string), Chance(double), Mesh Level(int) }. If empty, none will be generated")
        public String[] endstoneSieveDrops = new String[] {
                "beryllium", "0.0405", "2",
                "emerald", "0.0243", "2",
                "thorium", "0.0162", "2",

                "grossular", "0.0192", "3",
                "spessartine", "0.0192", "3",
                "pyrolusite", "0.0192", "3",
                "tantalite", "0.0064", "3",
                "wulfenite", "0.0256", "3",
                "molybdenite", "0.0256", "3",
                "powellite", "0.0128", "3",
                "garnierite", "0.0189", "3",
                "nickel", "0.0189", "3",
                "cobaltite", "0.0189", "3",
                "pentlandite", "0.0063", "3",
                "bentonite", "0.0192", "3",
                "magnesite", "0.0192", "3",
                "olivine", "0.0192", "3",
                "glauconite", "0.064", "3",
                "chromite", "0.064", "3",
                "cooperite", "0.0288", "3",
                "palladium", "0.0224", "3",
                "iridium", "0.0128", "3",
                "scheelite", "0.0384", "3",
                "tungstate", "0.0128", "3",
                "lithium", "0.0128", "3",

                "naquadah", "0.36", "4",
                "naquadah_enriched", "0.04", "4",
                "lazurite", "0.0216", "4",
                "sodalite", "0.0144", "4",
                "lapis", "0.0252", "4",
                "calcite", "0.0108", "4"
        };
    }
}
