package trinsdar.ic2c_extras.util;

import ic2.core.IC2;
import ic2.core.item.block.ItemBlockRare;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import trinsdar.ic2c_extras.IC2CExtras;
import trinsdar.ic2c_extras.blocks.BlockIc2cEGenerator;
import trinsdar.ic2c_extras.blocks.BlockMachine;
import trinsdar.ic2c_extras.blocks.BlockMetal;
import trinsdar.ic2c_extras.blocks.BlockStoneDust;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityAdvancedSteamTurbine;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityCutter;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityExtruder;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityFluidCanningMachine;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityImpellerizedRoller;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityLiquescentExtruder;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityMetalBender;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityOreWashingPlant;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityPlasmaCutter;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityRoller;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityThermalCentrifuge;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityThermalWasher;
import trinsdar.ic2c_extras.blocks.tileentity.TileEntityTreeTapper;
import trinsdar.ic2c_extras.items.ItemCasings;
import trinsdar.ic2c_extras.items.ItemCrushedOre;
import trinsdar.ic2c_extras.items.ItemMiscs;
import trinsdar.ic2c_extras.items.ItemNuclearRod;
import trinsdar.ic2c_extras.items.ItemNuclearRod.NuclearRodTypes;
import trinsdar.ic2c_extras.items.ItemNuclearRod.NuclearRodVariants;
import trinsdar.ic2c_extras.items.ItemPlates;
import trinsdar.ic2c_extras.items.ItemPurifiedCrushedOre;
import trinsdar.ic2c_extras.items.ItemSmallDust;
import trinsdar.ic2c_extras.items.ItemTinyDust;
import trinsdar.ic2c_extras.items.ItemToolCrafting;
import trinsdar.ic2c_extras.items.itemblocks.ItemBlockGenerator;
import trinsdar.ic2c_extras.items.itemblocks.ItemBlockMachine;
import trinsdar.ic2c_extras.items.itemblocks.ItemBlockMetal;

public class Registry
{
    public static final BlockMachine
    oreWashingPlant = new BlockMachine("oreWashingPlant"),
    thermalCentrifuge = new BlockMachine("thermalCentrifuge"),
    thermalWasher = new BlockMachine("thermalWasher"),
    roller = new BlockMachine("roller"),
    extruder = new BlockMachine("extruder"),
    cutter = new BlockMachine("cutter"),
    impellerizedRoller = new BlockMachine("impellerizedRoller"),
    liquescentExtruder = new BlockMachine("liquescentExtruder"),
    plasmaCutter = new BlockMachine("plasmaCutter"),
    blastFurnace = new BlockMachine("blastFurnace"),
    metalBender = new BlockMachine("metalBender"),
    fluidCanningMachine = new BlockMachine("fluidCanningMachine"),
    treeTapper = new BlockMachine("treeTapper");
    public static final BlockIc2cEGenerator
    advancedSteamTurbine = new BlockIc2cEGenerator("advancedSteamTurbine"),
    solidFuelFirebox = new BlockIc2cEGenerator("solidFuelFirebox"),
    liquidFuelFirebox = new BlockIc2cEGenerator("liquidFuelFirebox"),
    electricHeater = new BlockIc2cEGenerator("electricHeater");
    public static final BlockMetal
    steelBlock = new BlockMetal("steelBlock", 0),
    refinedIronBlock = new BlockMetal("refinedIronBlock", 1),
    leadBlock = new BlockMetal("leadBlock", 2);
    public static final BlockStoneDust stoneDustBlock = new BlockStoneDust();

    static String copper = "copper";
    static String tin = "tin";
    static String silver = "silver";
    static String lead = "lead";
    static String iron = "iron";
    static String gold = "gold";
    static String steel = "steel";
    static String bronze = "bronze";
    static String uranium = "uranium";

    public static final ItemCasings
    copperCasing = new ItemCasings(copper, 0),
    tinCasing = new ItemCasings(tin, 1),
    silverCasing = new ItemCasings(silver, 2),
    leadCasing = new ItemCasings(lead, 3),
    ironCasing = new ItemCasings(iron, 4),
    goldCasing = new ItemCasings(gold, 5),
    refinedIronCasing = new ItemCasings("refinedIron", 6),
    steelCasing = new ItemCasings(steel, 7),
    bronzeCasing = new ItemCasings(bronze, 8);

    public static final ItemPlates
    copperPlate = new ItemPlates(copper, 0),
    tinPlate = new ItemPlates(tin, 1),
    silverPlate = new ItemPlates(silver, 2),
    leadPlate = new ItemPlates(lead, 3),
    ironPlate = new ItemPlates(iron, 4),
    goldPlate = new ItemPlates(gold, 5),
    refinedIronPlate = new ItemPlates("refinedIron", 6),
    steelPlate = new ItemPlates(steel, 7),
    bronzePlate = new ItemPlates(bronze, 8);

    public static final ItemCrushedOre
    ironCrushedOre = new ItemCrushedOre(iron, 0),
    goldCrushedOre = new ItemCrushedOre(gold, 1),
    copperCrushedOre = new ItemCrushedOre(copper, 2),
    tinCrushedOre = new ItemCrushedOre(tin, 3),
    silverCrushedOre = new ItemCrushedOre(silver, 4),
    leadCrushedOre = new ItemCrushedOre(lead, 5),
    uraniumCrushedOre = new ItemCrushedOre(uranium, 6);

    public static final ItemPurifiedCrushedOre
    ironPurifiedCrushedOre = new ItemPurifiedCrushedOre(iron, 0),
    goldPurifiedCrushedOre = new ItemPurifiedCrushedOre(gold, 1),
    copperPurifiedCrushedOre = new ItemPurifiedCrushedOre(copper, 2),
    tinPurifiedCrushedOre = new ItemPurifiedCrushedOre(tin, 3),
    silverPurifiedCrushedOre = new ItemPurifiedCrushedOre(silver, 4),
    leadPurifiedCrushedOre = new ItemPurifiedCrushedOre(lead, 5),
    uraniumPurifiedCrushedOre = new ItemPurifiedCrushedOre(uranium, 6);

    public static final ItemTinyDust
    ironTinyDust = new ItemTinyDust(iron, 0),
    goldTinyDust = new ItemTinyDust(gold, 1),
    copperTinyDust = new ItemTinyDust(copper, 2),
    tinTinyDust = new ItemTinyDust(tin, 3),
    silverTinyDust = new ItemTinyDust(silver, 4),
    leadTinyDust = new ItemTinyDust(lead, 5),
    uranium235TinyDust = new ItemTinyDust(uranium + "235", 6),
    obsidianTinyDust = new ItemTinyDust("obsidian", 7),
    bronzeTinyDust = new ItemTinyDust(bronze, 8),
    uranium238TinyDust = new ItemTinyDust(uranium + "238", 9),
    plutoniumTinyDust = new ItemTinyDust("plutonium", 10);

    public static final ItemSmallDust
    ironSmallDust = new ItemSmallDust(iron, 0),
    goldSmallDust = new ItemSmallDust(gold, 1),
    copperSmallDust = new ItemSmallDust(copper, 2),
    tinSmallDust = new ItemSmallDust(tin, 3),
    silverSmallDust = new ItemSmallDust(silver, 4),
    leadSmallDust = new ItemSmallDust(lead, 5),
    uranium235SmallDust = new ItemSmallDust(uranium + "235", 6),
    obsidianSmallDust = new ItemSmallDust("obsidian", 7),
    bronzeSmallDust = new ItemSmallDust(bronze, 8),
    uranium238SmallDust = new ItemSmallDust(uranium + "238", 9),
    plutoniumSmallDust = new ItemSmallDust("plutonium", 10);

    public static final ItemMiscs
    leadIngot = new ItemMiscs("leadIngot", 0, false),
    leadDust = new ItemMiscs("leadDust", 1, false),
    stoneDust = new ItemMiscs("stoneDust", 2, false),
    slag = new ItemMiscs("slag", 3, false),
    uranium235 = new ItemMiscs("uranium235", 4, false),
    uranium238 = new ItemMiscs("uranium238", 5, false),
    plutonium = new ItemMiscs("plutonium", 6, false),
    coil = new ItemMiscs("coil", 7, false),
    heatConductor = new ItemMiscs("heatConductor", 8, false),
    steelIngot = new ItemMiscs("steelIngot", 9, false),
    plutoniumEnrichedUraniumIngot = new ItemMiscs("plutoniumEnrichedUraniumIngot", 10, false),
    doubleEnrichedUraniumIngot = new ItemMiscs("doubleEnrichedUraniumIngot", 11, false),
    iridiumShard = new ItemMiscs("iridiumShard", 12, false),
    diamondDust = new ItemMiscs("diamondDust", 16, false),
    energiumDust = new ItemMiscs("energiumDust", 17, false),
    emptyFuelRod = new ItemMiscs("emptyFuelRod", 18, false),
    nearDepletedUOXCell = new ItemMiscs("nearDepletedUOXCell", 19,false),
    nearDepletedPlutoniumCell = new ItemMiscs("nearDepletedPlutoniumCell", 20, false),
    nearDepletedMOXCell = new ItemMiscs("nearDepletedMOXCell", 21, false),
    nearDepletedThroiumCell = new ItemMiscs("nearDepletedThroiumCell", 22, false),
    nearDepletedCaliforniumCell= new ItemMiscs("nearDepletedCaliforniumCell", 23, false),
    reEnrichedUOXCell = new ItemMiscs("reEnrichedUOXCell", 24,false),
    reEnrichedPlutoniumCell = new ItemMiscs("reEnrichedPlutoniumCell", 25, false),
    reEnrichedMOXCell = new ItemMiscs("reEnrichedMOXCell", 26, false),
    reEnrichedThroiumCell = new ItemMiscs("reEnrichedThroiumCell", 27, false),
    reEnrichedCaliforniumCell= new ItemMiscs("reEnrichedCaliforniumCell", 28, false),

    blankPress = new ItemMiscs("blankPress", 0, true),
    rollingPress = new ItemMiscs("rollingPress", 1, true),
    extrudingPress = new ItemMiscs("extrudingPress", 2, true),
    cuttingPress = new ItemMiscs("cuttingPress", 3, true),
    lathingPress = new ItemMiscs("lathingPress", 4, true),
    gearingPress = new ItemMiscs("gearingPress", 5, true);

    public static final ItemNuclearRod
    singleUOXCell = new ItemNuclearRod(NuclearRodTypes.SINGLE, NuclearRodVariants.UOX, 0),
    doubleUOXCell = new ItemNuclearRod(NuclearRodTypes.DOUBLE, NuclearRodVariants.UOX, 1),
    quadUOXCell = new ItemNuclearRod(NuclearRodTypes.QUAD, NuclearRodVariants.UOX, 2),
    isotopicUOXCell = new ItemNuclearRod(NuclearRodTypes.ISOTOPE, NuclearRodVariants.UOX, 3),
    singlePlutoniumCell = new ItemNuclearRod(NuclearRodTypes.SINGLE, NuclearRodVariants.PLUTONIUM, 4),
    doublePlutoniumCell = new ItemNuclearRod(NuclearRodTypes.DOUBLE, NuclearRodVariants.PLUTONIUM, 5),
    quadPlutoniumCell = new ItemNuclearRod(NuclearRodTypes.QUAD, NuclearRodVariants.PLUTONIUM, 6),
    isotopicPlutoniumCell = new ItemNuclearRod(NuclearRodTypes.ISOTOPE, NuclearRodVariants.PLUTONIUM, 7),
    singleMOXCell = new ItemNuclearRod(NuclearRodTypes.SINGLE, NuclearRodVariants.MOX, 8),
    doubleMOXCell = new ItemNuclearRod(NuclearRodTypes.DOUBLE, NuclearRodVariants.MOX, 9),
    quadMOXCell = new ItemNuclearRod(NuclearRodTypes.QUAD, NuclearRodVariants.MOX, 10),
    isotopicMOXCell = new ItemNuclearRod(NuclearRodTypes.ISOTOPE, NuclearRodVariants.MOX, 11),
    singleThoriumCell = new ItemNuclearRod(NuclearRodTypes.SINGLE, NuclearRodVariants.THORIUM, 12),
    doubleThoriumCell = new ItemNuclearRod(NuclearRodTypes.DOUBLE, NuclearRodVariants.THORIUM, 13),
    quadThoriumCell = new ItemNuclearRod(NuclearRodTypes.QUAD, NuclearRodVariants.THORIUM, 14),
    isotopicThoriumCell = new ItemNuclearRod(NuclearRodTypes.ISOTOPE, NuclearRodVariants.THORIUM, 15),
    singleCaliforniumCell = new ItemNuclearRod(NuclearRodTypes.SINGLE, NuclearRodVariants.CALIFORNIUM, 16),
    doubleCaliforniumCell = new ItemNuclearRod(NuclearRodTypes.DOUBLE, NuclearRodVariants.CALIFORNIUM, 17),
    quadCaliforniumCell = new ItemNuclearRod(NuclearRodTypes.QUAD, NuclearRodVariants.CALIFORNIUM, 18),
    isotopicCaliforniumCell = new ItemNuclearRod(NuclearRodTypes.ISOTOPE, NuclearRodVariants.CALIFORNIUM, 19);


    public static final ItemToolCrafting
    craftingHammer = new ItemToolCrafting(80, "craftingHammer", 0, true),
    wireCutters = new ItemToolCrafting(60, "wireCutters", 1, true);


    public static void init(){
        IC2.getInstance().createBlock(oreWashingPlant, ItemBlockMachine.class);
        IC2.getInstance().createBlock(thermalCentrifuge, ItemBlockMachine.class);
        IC2.getInstance().createBlock(thermalWasher, ItemBlockMachine.class);
        IC2.getInstance().createBlock(roller, ItemBlockMachine.class);
        IC2.getInstance().createBlock(extruder, ItemBlockMachine.class);
        IC2.getInstance().createBlock(cutter, ItemBlockMachine.class);
        IC2.getInstance().createBlock(impellerizedRoller, ItemBlockMachine.class);
        IC2.getInstance().createBlock(liquescentExtruder, ItemBlockMachine.class);
        IC2.getInstance().createBlock(plasmaCutter, ItemBlockMachine.class);
        IC2.getInstance().createBlock(metalBender, ItemBlockMachine.class);
        IC2.getInstance().createBlock(fluidCanningMachine, ItemBlockMachine.class);
        IC2.getInstance().createBlock(treeTapper, ItemBlockMachine.class);
        IC2.getInstance().createBlock(blastFurnace, ItemBlockRare.class);
        IC2.getInstance().createBlock(advancedSteamTurbine, ItemBlockGenerator.class);
        IC2.getInstance().createBlock(solidFuelFirebox, ItemBlockRare.class);
        IC2.getInstance().createBlock(liquidFuelFirebox, ItemBlockRare.class);
        IC2.getInstance().createBlock(electricHeater, ItemBlockRare.class);
        IC2.getInstance().createBlock(steelBlock, ItemBlockMetal.class);
        IC2.getInstance().createBlock(refinedIronBlock, ItemBlockMetal.class);
        IC2.getInstance().createBlock(leadBlock, ItemBlockMetal.class);
        IC2.getInstance().createBlock(stoneDustBlock, ItemBlockMetal.class);

        IC2.getInstance().createItem(copperCasing);
        IC2.getInstance().createItem(tinCasing);
        IC2.getInstance().createItem(silverCasing);
        IC2.getInstance().createItem(leadCasing);
        IC2.getInstance().createItem(ironCasing);
        IC2.getInstance().createItem(goldCasing);
        IC2.getInstance().createItem(refinedIronCasing);
        IC2.getInstance().createItem(steelCasing);
        IC2.getInstance().createItem(bronzeCasing);
        IC2.getInstance().createItem(ironCrushedOre);
        IC2.getInstance().createItem(goldCrushedOre);
        IC2.getInstance().createItem(copperCrushedOre);
        IC2.getInstance().createItem(tinCrushedOre);
        IC2.getInstance().createItem(silverCrushedOre);
        IC2.getInstance().createItem(leadCrushedOre);
        IC2.getInstance().createItem(uraniumCrushedOre);
        IC2.getInstance().createItem(ironPurifiedCrushedOre);
        IC2.getInstance().createItem(goldPurifiedCrushedOre);
        IC2.getInstance().createItem(copperPurifiedCrushedOre);
        IC2.getInstance().createItem(tinPurifiedCrushedOre);
        IC2.getInstance().createItem(silverPurifiedCrushedOre);
        IC2.getInstance().createItem(leadPurifiedCrushedOre);
        IC2.getInstance().createItem(uraniumPurifiedCrushedOre);
        IC2.getInstance().createItem(ironTinyDust);
        IC2.getInstance().createItem(goldTinyDust);
        IC2.getInstance().createItem(copperTinyDust);
        IC2.getInstance().createItem(tinTinyDust);
        IC2.getInstance().createItem(silverTinyDust);
        IC2.getInstance().createItem(leadTinyDust);
        IC2.getInstance().createItem(uranium235TinyDust);
        IC2.getInstance().createItem(obsidianTinyDust);
        IC2.getInstance().createItem(bronzeTinyDust);
        IC2.getInstance().createItem(uranium238TinyDust);
        IC2.getInstance().createItem(plutoniumTinyDust);
        IC2.getInstance().createItem(ironSmallDust);
        IC2.getInstance().createItem(goldSmallDust);
        IC2.getInstance().createItem(copperSmallDust);
        IC2.getInstance().createItem(tinSmallDust);
        IC2.getInstance().createItem(silverSmallDust);
        IC2.getInstance().createItem(leadSmallDust);
        IC2.getInstance().createItem(uranium235SmallDust);
        IC2.getInstance().createItem(obsidianSmallDust);
        IC2.getInstance().createItem(bronzeSmallDust);
        IC2.getInstance().createItem(uranium238SmallDust);
        IC2.getInstance().createItem(plutoniumSmallDust);
        IC2.getInstance().createItem(leadIngot);
        IC2.getInstance().createItem(leadDust);
        IC2.getInstance().createItem(stoneDust);
        IC2.getInstance().createItem(slag);
        IC2.getInstance().createItem(uranium235);
        IC2.getInstance().createItem(uranium238);
        IC2.getInstance().createItem(plutonium);
        IC2.getInstance().createItem(coil);
        IC2.getInstance().createItem(heatConductor);
        IC2.getInstance().createItem(steelIngot);
        IC2.getInstance().createItem(plutoniumEnrichedUraniumIngot);
        IC2.getInstance().createItem(doubleEnrichedUraniumIngot);
        IC2.getInstance().createItem(iridiumShard);
        IC2.getInstance().createItem(copperPlate);
        IC2.getInstance().createItem(tinPlate);
        IC2.getInstance().createItem(silverPlate);
        IC2.getInstance().createItem(leadPlate);
        IC2.getInstance().createItem(ironPlate);
        IC2.getInstance().createItem(goldPlate);
        IC2.getInstance().createItem(refinedIronPlate);
        IC2.getInstance().createItem(steelPlate);
        IC2.getInstance().createItem(bronzePlate);
        IC2.getInstance().createItem(diamondDust);
        IC2.getInstance().createItem(energiumDust);
        IC2.getInstance().createItem(blankPress);
        IC2.getInstance().createItem(rollingPress);
        IC2.getInstance().createItem(extrudingPress);
        IC2.getInstance().createItem(cuttingPress);
        IC2.getInstance().createItem(lathingPress);
        IC2.getInstance().createItem(gearingPress);
        IC2.getInstance().createItem(craftingHammer);
        IC2.getInstance().createItem(wireCutters);
    }

    public static void registerTiles()
    {
        GameRegistry.registerTileEntity(TileEntityOreWashingPlant.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityOreWashingPlant"));
        GameRegistry.registerTileEntity(TileEntityAdvancedSteamTurbine.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityAdvancedSteamTurbine"));
        GameRegistry.registerTileEntity(TileEntityThermalCentrifuge.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityThermalCentrifuge"));
        GameRegistry.registerTileEntity(TileEntityThermalWasher.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityThermalWasher"));
        GameRegistry.registerTileEntity(TileEntityRoller.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityRoller"));
        GameRegistry.registerTileEntity(TileEntityExtruder.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityExtruder"));
        GameRegistry.registerTileEntity(TileEntityCutter.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityCutter"));
        GameRegistry.registerTileEntity(TileEntityImpellerizedRoller.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityImpellerizedRoller"));
        GameRegistry.registerTileEntity(TileEntityLiquescentExtruder.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityLiquescentExtruder"));
        GameRegistry.registerTileEntity(TileEntityPlasmaCutter.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityPlasmaCutter"));
        GameRegistry.registerTileEntity(TileEntityMetalBender.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityMetalBender"));
        GameRegistry.registerTileEntity(TileEntityFluidCanningMachine.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityFluidCanningMachine"));
        GameRegistry.registerTileEntity(TileEntityTreeTapper.class, new ResourceLocation(IC2CExtras.MODID, "tileEntityTreeTapper"));
    }
}
