package slimeknights.tconstruct.tools.data.material;

import net.minecraft.data.PackOutput;
import net.minecraft.tags.FluidTags;
import net.minecraftforge.common.crafting.conditions.OrCondition;
import slimeknights.mantle.recipe.condition.TagFilledCondition;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.common.json.ConfigEnabledCondition;
import slimeknights.tconstruct.library.data.material.AbstractMaterialDataProvider;
import slimeknights.tconstruct.library.materials.definition.MaterialId;

import static slimeknights.mantle.Mantle.commonResource;

public class MaterialDataProvider extends AbstractMaterialDataProvider {
  public MaterialDataProvider(PackOutput packOutput) {
    super(packOutput);
  }

  @Override
  public String getName() {
    return "Tinker's Construct Materials";
  }

  @Override
  protected void addMaterials() {
    // tier 1
    addMaterial(MaterialIds.wood,   0, ORDER_GENERAL, true);
    addMaterial(MaterialIds.rock,   1, ORDER_HARVEST, true);
    addMaterial(MaterialIds.flint,  1, ORDER_WEAPON,  true);
    addMaterial(MaterialIds.copper, 1, ORDER_SPECIAL, true);
    addMaterial(MaterialIds.bone,   1, ORDER_SPECIAL, true);
    addMaterial(MaterialIds.bamboo, 1, ORDER_RANGED,  true);
    // tier 1 - end
    addMaterial(MaterialIds.chorus, 1, ORDER_END,     true);
    // tier 1 - binding
    addMaterial(MaterialIds.string,  0, ORDER_GENERAL, true);
    addMaterial(MaterialIds.leather, 0, ORDER_BINDING, true);
    addMaterial(MaterialIds.vine,    1, ORDER_BINDING, true);
    // tier 1 - shield cores
    addMaterial(MaterialIds.cactus, 1, ORDER_BINDING, true);
    // tier 1 - ammo
    addMaterial(MaterialIds.feather, 0, ORDER_GENERAL, true);
    addMaterial(MaterialIds.wool,    1, ORDER_BINDING, true);
    addMaterial(MaterialIds.leaves,  1, ORDER_BINDING, true);
    addMaterial(MaterialIds.paper,   1, ORDER_BINDING, true);

    // tier 2
    addMaterial(MaterialIds.iron,        2, ORDER_GENERAL, false);
    addMaterial(MaterialIds.searedStone, 2, ORDER_HARVEST, false);
    addMaterial(MaterialIds.venombone,   2, ORDER_WEAPON,  true);
    addMaterial(MaterialIds.slimewood,   2, ORDER_SPECIAL, true);
    addMaterial(MaterialIds.slimeskin,   2, ORDER_BINDING, false);
    addMaterial(MaterialIds.gold,        2, ORDER_REPAIR, false);
    // tier 2 - nether
    addMaterial(MaterialIds.scorchedStone, 2, ORDER_NETHER, false);
    addMaterial(MaterialIds.necroticBone,  2, ORDER_NETHER, true);
    // tier 2 - end
    addMaterial(MaterialIds.whitestone, 2, ORDER_END, true);
    // tier 2 - binding
    addMaterial(MaterialIds.skyslimeVine, 2, ORDER_BINDING, true);
    addMaterial(MaterialIds.weepingVine,  2, ORDER_BINDING, true);
    addMaterial(MaterialIds.twistingVine, 2, ORDER_BINDING, true);
    // tier 2 - ammo
    addMaterial(MaterialIds.amethyst,   2, ORDER_REPAIR, false);
    addMaterial(MaterialIds.prismarine, 2, ORDER_REPAIR, true);
    addMaterial(MaterialIds.earthslime, 2, ORDER_REPAIR, true);
    addMaterial(MaterialIds.skyslime,   2, ORDER_REPAIR, true);
    addMaterial(MaterialIds.blaze,      2, ORDER_REPAIR, true);
    addMaterial(MaterialIds.enderPearl, 2, ORDER_REPAIR, false);
    addMaterial(MaterialIds.glass,      2, ORDER_REPAIR, false);
    addMaterial(MaterialIds.slimeball,  2, ORDER_REPAIR, true);
    addMaterial(MaterialIds.gunpowder,  2, ORDER_REPAIR, true);
    // bloodbone reworked into venombone
    addRedirect(new MaterialId(TConstruct.MOD_ID, "bloodbone"), redirect(MaterialIds.venombone));

    // tier 3
    addMaterial(MaterialIds.cortosis,       4, ORDER_WEAPON,  false);
    addMaterial(MaterialIds.electrum,       4, ORDER_SPECIAL, false);
    addMaterial(MaterialIds.alum,           4, ORDER_HARVEST, false);
    addMaterial(MaterialIds.ultrachrome,    4, ORDER_HARVEST, false);
    addMaterial(MaterialIds.crystalWeave,   4, ORDER_SPECIAL, false);
    addMaterial(MaterialIds.titanium,       3, ORDER_HARVEST, false);
    addMaterial(MaterialIds.fireDiamond,    3, ORDER_WEAPON,  false);
    addMaterial(MaterialIds.quadranium,     3, ORDER_GENERAL, false);
    addMaterial(MaterialIds.aurodium,       3, ORDER_SPECIAL, false);
    addMaterial(MaterialIds.doonium,        3, ORDER_WEAPON,  false);
    addMaterial(MaterialIds.castIron,       2, ORDER_GENERAL, false);
    addMaterial(MaterialIds.carbonite,      1, ORDER_SPECIAL, false);
    addCraftingOnly(MaterialIds.carbonite);
    addMaterial(MaterialIds.codoran,        1, ORDER_HARVEST, false);
    addCraftingOnly(MaterialIds.codoran);
    addMaterial(MaterialIds.lapis,          1, ORDER_REPAIR,  false);
    addCraftingOnly(MaterialIds.lapis);
    addMaterial(MaterialIds.redstone,       1, ORDER_REPAIR,  false);
    addCraftingOnly(MaterialIds.redstone);
    addMaterial(MaterialIds.coal,           1, ORDER_REPAIR,  false);
    addCraftingOnly(MaterialIds.coal);
    addMaterial(MaterialIds.sulfur,         1, ORDER_REPAIR,  false);
    addCraftingOnly(MaterialIds.sulfur);
    addMaterial(MaterialIds.lithium,        1, ORDER_RANGED,  false);
    addCraftingOnly(MaterialIds.lithium);
    addMaterial(MaterialIds.beryllium,      1, ORDER_RANGED,  false);
    addCraftingOnly(MaterialIds.beryllium);
    addMaterial(MaterialIds.nahuatl,        3, ORDER_WEAPON,  true);
    addMaterial(MaterialIds.obsidian,       3, ORDER_WEAPON,  false);
    // tier 3 (nether)
    addMaterial(MaterialIds.steel,          2, ORDER_NETHER,  false);
    // tier 3 - binding
    addMaterial(MaterialIds.darkthread, 3, ORDER_BINDING, false);
    addMaterial(MaterialIds.ichorskin,  3, ORDER_BINDING, false);
    // tier 3 - shield cores
    addMaterial(MaterialIds.ice, 3, ORDER_BINDING, true);
    // tier 3 - ammo
    addMaterial(MaterialIds.quartz,    3, ORDER_REPAIR, false);
    addMaterial(MaterialIds.ichor,     3, ORDER_REPAIR, true);
    addMaterial(MaterialIds.glowstone, 3, ORDER_REPAIR, true);
    addMaterial(MaterialIds.magnetite, 3, ORDER_REPAIR, true);
    addMaterial(MaterialIds.magma,     3, ORDER_REPAIR, true);

    // tier 4
    addMaterial(MaterialIds.blazingBone, 4, ORDER_SPECIAL, true);
    //addMetalMaterial(MaterialIds.soulsteel, 4, ORDER_SPECIAL, false, 0x6a5244);
    // tier 4 - binding
    addMaterial(MaterialIds.ancientHide, 4, ORDER_BINDING, false);
    addMaterial(MaterialIds.ancient,     4, ORDER_NETHER,  false, true, null);
    addMaterial(MaterialIds.blazewood,   4, ORDER_BINDING, true);
    // tier 4 - ammo
    addMaterial(MaterialIds.shulker,     4, ORDER_REPAIR, true);
    addMaterial(MaterialIds.dragonScale, 4, ORDER_REPAIR, true);
    addMaterial(MaterialIds.enderslime,  4, ORDER_REPAIR, true);
    addMaterial(MaterialIds.knightly,    4, ORDER_REPAIR, true);
    addMaterial(MaterialIds.endRod,      4, ORDER_REPAIR, true);

    // tier 5 binding, temporarily in book 4
    addMaterial(MaterialIds.enderslimeVine, 4, ORDER_BINDING, true);

    // tier 2 (mod integration)
    addCompatMetalMaterial(MaterialIds.lead,     2, ORDER_COMPAT + ORDER_HARVEST);
    addCraftingOnly(MaterialIds.lead);
    addCompatMetalMaterial(MaterialIds.aluminum, 2, ORDER_COMPAT + ORDER_RANGED);
    addCraftingOnly(MaterialIds.aluminum);
    addCompatMetalMaterial(MaterialIds.nickel,   2, ORDER_COMPAT + ORDER_GENERAL);
    addCraftingOnly(MaterialIds.nickel);
    addCompatMetalMaterial(MaterialIds.platinum, 2, ORDER_COMPAT + ORDER_SPECIAL);
    addCompatMetalMaterial(MaterialIds.uranium,  2, ORDER_COMPAT + ORDER_WEAPON);
    addCraftingOnly(MaterialIds.uranium);
    addCompatMetalMaterial(MaterialIds.chromium, 2, ORDER_COMPAT + ORDER_RANGED);
    // ironwood works in a part builder even though its ingots
    addCompatMaterial(MaterialIds.ironwood, 2, ORDER_COMPAT + ORDER_GENERAL, true, "ingots/ironwood");
    // treated wood comes from treated wood or creosote oil
    addMaterial(MaterialIds.treatedWood, 2, ORDER_COMPAT + ORDER_GENERAL, true, false,
      new OrCondition(ConfigEnabledCondition.FORCE_INTEGRATION_MATERIALS, tagExistsCondition("treated_wood"), new TagFilledCondition<>(FluidTags.create(commonResource("creosote")))));
    // tier 3 (mod integration)
    addCompatAlloy(MaterialIds.constantan,      3, ORDER_COMPAT + ORDER_HARVEST, "nickel");
    addCraftingOnly(MaterialIds.constantan);
    addCompatAlloy(MaterialIds.brass,           3, ORDER_COMPAT + ORDER_SPECIAL, "zinc");
    addCraftingOnly(MaterialIds.brass);

    // slimesuit - textures
    addMaterial(MaterialIds.blood, 2, ORDER_REPAIR, true);
    addMaterial(MaterialIds.clay,  1, ORDER_REPAIR, true);
    addMaterial(MaterialIds.honey, 1, ORDER_REPAIR, true);
    //addMaterial(MaterialIds.venom,      3, ORDER_REPAIR, true);
    // slimesuit - repair
    addMaterial(MaterialIds.phantom, 1, ORDER_REPAIR, true);

    // rose gold is most comparable to chain as you can use the extra slot for reinforced
    addRedirect(id("chain"), redirect(MaterialIds.aurodium));
    // zombies now use leather instead of flesh for their skull
    addRedirect(id("rotten_flesh"), redirect(MaterialIds.leather));
    addRedirect(id("steeleaf"), redirect(MaterialIds.steel));
  }
  /**
   * Creates a new material ID
   * @param name  ID name
   * @return  Material ID object
   */
  private static MaterialId id(String name) {
    return new MaterialId(TConstruct.MOD_ID, name);
  }
}
