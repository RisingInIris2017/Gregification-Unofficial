package gregification.exnihilo;

import gregification.util.GFUtility;
import gregification.util.GFValues;
import gregtech.api.unification.material.MaterialIconType;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraftforge.common.util.EnumHelper;

import static gregtech.api.unification.material.type.DustMaterial.MatFlags.GENERATE_ORE;
import static gregtech.api.unification.ore.OrePrefix.Flags.DISALLOW_RECYCLING;
import static gregtech.api.unification.ore.OrePrefix.Flags.ENABLE_UNIFICATION;

public class ExNihiloEnums {

    // TODO Rework when moving to GTCEu
    public static void preInit() {

        EnumHelper.addEnum(MaterialIconType.class, "oreChunk", new Class[0]);
        EnumHelper.addEnum(MaterialIconType.class, "oreEnderChunk", new Class[0]);
        EnumHelper.addEnum(MaterialIconType.class, "oreNetherChunk", new Class[0]);
        EnumHelper.addEnum(MaterialIconType.class, "oreSandyChunk", new Class[0]);

        EnumHelper.addEnum(OrePrefix.class, "oreChunk", GFValues.ORE_PREFIX,
                "Ore Chunk", -1L, null, MaterialIconType.valueOf("oreChunk"), ENABLE_UNIFICATION | DISALLOW_RECYCLING,
                GFUtility.pred((mat) -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE)));

        EnumHelper.addEnum(OrePrefix.class, "oreEnderChunk", GFValues.ORE_PREFIX,
                "Ender Ore Chunk", -1L, null, MaterialIconType.valueOf("oreEnderChunk"), ENABLE_UNIFICATION | DISALLOW_RECYCLING,
                GFUtility.pred((mat) -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE)));

        EnumHelper.addEnum(OrePrefix.class, "oreNetherChunk", GFValues.ORE_PREFIX,
                "Nether Ore Chunk", -1L, null, MaterialIconType.valueOf("oreNetherChunk"), ENABLE_UNIFICATION | DISALLOW_RECYCLING,
                GFUtility.pred((mat) -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE)));

        EnumHelper.addEnum(OrePrefix.class, "oreSandyChunk", GFValues.ORE_PREFIX,
                "Sandy Ore Chunk", -1L, null, MaterialIconType.valueOf("oreSandyChunk"), ENABLE_UNIFICATION | DISALLOW_RECYCLING,
                GFUtility.pred((mat) -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE)));

        // TODO NEW CODE (GTCEu): (maybe move out of this class?)
        // OrePrefix.oreChunk.setGenerationCondition(mat -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE);
        // OrePrefix.oreEnderChunk.setGenerationCondition(mat -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE);
        // OrePrefix.oreNetherChunk.setGenerationCondition(mat -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE);
        // OrePrefix.oreSandyChunk.setGenerationCondition(mat -> mat instanceof DustMaterial && mat.hasFlag(GENERATE_ORE);
    }
}
