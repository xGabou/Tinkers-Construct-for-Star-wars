package slimeknights.tconstruct.common.data.tags;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.common.TinkerTags;
import slimeknights.tconstruct.library.data.tinkering.AbstractMaterialTagProvider;
import slimeknights.tconstruct.tools.data.material.MaterialIds;

public class MaterialTagProvider extends AbstractMaterialTagProvider {
  public MaterialTagProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
    super(packOutput, TConstruct.MOD_ID, existingFileHelper);
  }

  @Override
  protected void addTags() {
    tag(TinkerTags.Materials.EXCLUDE_FROM_LOOT)
      .add(MaterialIds.ancientHide);
    tag(TinkerTags.Materials.NETHER).add(
      MaterialIds.wood, MaterialIds.flint, MaterialIds.rock, MaterialIds.bone,
      MaterialIds.leather, MaterialIds.string,
      MaterialIds.gold, MaterialIds.slimewood,
      MaterialIds.nahuatl, MaterialIds.obsidian, MaterialIds.darkthread, MaterialIds.steel,
      MaterialIds.ancient
    ).addTag(TinkerTags.Materials.NETHER_GATED);

    tag(TinkerTags.Materials.NETHER_GATED).add(
      MaterialIds.twistingVine, MaterialIds.weepingVine,
      MaterialIds.scorchedStone, MaterialIds.necroticBone,
      MaterialIds.steel,
      MaterialIds.beskar, MaterialIds.cortosis, MaterialIds.electrum,
      MaterialIds.alum, MaterialIds.ultrachrome, MaterialIds.crystalWeave,
      MaterialIds.fireDiamond, MaterialIds.quadranium, MaterialIds.doonium,
      MaterialIds.blazingBone, MaterialIds.blazewood, MaterialIds.jeweledHide,
      MaterialIds.glowstone, MaterialIds.ichor, MaterialIds.quartz, MaterialIds.blaze, MaterialIds.magma
    );

    tag(TinkerTags.Materials.BASIC_AMMO).add(
      MaterialIds.flint, MaterialIds.wool, MaterialIds.glass,
      MaterialIds.wood, MaterialIds.bamboo, MaterialIds.cactus,
      MaterialIds.feather, MaterialIds.paper, MaterialIds.leaves
    );

    tag(TinkerTags.Materials.BLAZING_BLOOD).add(
      MaterialIds.beskar, MaterialIds.cortosis, MaterialIds.electrum,
      MaterialIds.alum, MaterialIds.ultrachrome, MaterialIds.crystalWeave,
      MaterialIds.fireDiamond, MaterialIds.quadranium, MaterialIds.doonium,
      MaterialIds.blazingBone, MaterialIds.blazewood, MaterialIds.jeweledHide
    );
    tag(TinkerTags.Materials.DISTANT).add(
      MaterialIds.chorus, MaterialIds.whitestone,
      MaterialIds.beskar, MaterialIds.knightly, MaterialIds.quadranium, MaterialIds.enderslimeVine, MaterialIds.ancient,
      MaterialIds.shulker, MaterialIds.dragonScale, MaterialIds.enderslime, MaterialIds.endRod
    ).addOptional(MaterialIds.ironwood);

    tag(TinkerTags.Materials.BARTERED).add(
      MaterialIds.nahuatl, MaterialIds.obsidian, MaterialIds.darkthread,
      MaterialIds.steel, MaterialIds.titanium, MaterialIds.aurodium,
      MaterialIds.beskar, MaterialIds.cortosis, MaterialIds.electrum,
      MaterialIds.alum, MaterialIds.ultrachrome, MaterialIds.crystalWeave,
      MaterialIds.fireDiamond, MaterialIds.quadranium, MaterialIds.doonium,
      MaterialIds.blazingBone, MaterialIds.blazewood, MaterialIds.jeweledHide, MaterialIds.ancient
    );

    tag(TinkerTags.Materials.COMPATABILITY_METALS).addOptional(
      MaterialIds.lead, MaterialIds.aluminum,
      MaterialIds.nickel, MaterialIds.platinum, MaterialIds.uranium, MaterialIds.chromium,
      MaterialIds.ironwood,
      MaterialIds.steel
    ).addTag(TinkerTags.Materials.COMPATABILITY_BLOCKS);
    tag(TinkerTags.Materials.COMPATABILITY_BLOCKS).addTag(TinkerTags.Materials.COMPATABILITY_ALLOYS);
    tag(TinkerTags.Materials.COMPATABILITY_ALLOYS).addOptional(MaterialIds.brass, MaterialIds.constantan, MaterialIds.electrum);

    tag(TinkerTags.Materials.GENERAL).add(
      MaterialIds.wood, MaterialIds.string, MaterialIds.vine, MaterialIds.leather,
      MaterialIds.iron, MaterialIds.slimewood,
      MaterialIds.castIron, MaterialIds.beskar, MaterialIds.quadranium,
      MaterialIds.electrum, MaterialIds.carbonite, MaterialIds.enderslimeVine
    ).addOptional(
      MaterialIds.treatedWood,
      MaterialIds.ironwood,
      MaterialIds.nickel, MaterialIds.brass
    );
    tag(TinkerTags.Materials.HARVEST).add(
      MaterialIds.rock, MaterialIds.copper,
      MaterialIds.searedStone, MaterialIds.whitestone, MaterialIds.skyslimeVine, MaterialIds.twistingVine,
      MaterialIds.alum, MaterialIds.ultrachrome, MaterialIds.titanium,
      MaterialIds.chromium, MaterialIds.platinum, MaterialIds.codoran, MaterialIds.jeweledHide
    ).addOptional(
      MaterialIds.lead,
      MaterialIds.constantan, MaterialIds.aluminum
    );
    tag(TinkerTags.Materials.MELEE).add(
      MaterialIds.flint, MaterialIds.bone, MaterialIds.chorus,
      MaterialIds.scorchedStone, MaterialIds.necroticBone, MaterialIds.venombone, MaterialIds.weepingVine,
      MaterialIds.nahuatl, MaterialIds.steel, MaterialIds.darkthread,
      MaterialIds.cortosis, MaterialIds.fireDiamond, MaterialIds.doonium, MaterialIds.blazingBone
    ).addOptional(
      MaterialIds.uranium,
      MaterialIds.electrum
    );

    tag(TinkerTags.Materials.BALANCED).add(
      MaterialIds.wood, MaterialIds.chorus,
      MaterialIds.string, MaterialIds.vine, MaterialIds.leather,
      MaterialIds.slimewood, MaterialIds.necroticBone, MaterialIds.skyslimeVine,
      MaterialIds.darkthread, MaterialIds.beskar, MaterialIds.castIron, MaterialIds.crystalWeave,
      MaterialIds.blazingBone, MaterialIds.jeweledHide, MaterialIds.enderslimeVine
    ).addOptional(
      MaterialIds.treatedWood,
      MaterialIds.ironwood, MaterialIds.nickel,
      MaterialIds.constantan, MaterialIds.brass
    );
    tag(TinkerTags.Materials.LIGHT).add(
      MaterialIds.bamboo, MaterialIds.bone,
      MaterialIds.venombone, MaterialIds.twistingVine,
      MaterialIds.nahuatl, MaterialIds.aurodium,
      MaterialIds.lithium, MaterialIds.beryllium, MaterialIds.crystalWeave
    ).addOptional(
      MaterialIds.aluminum,
      MaterialIds.constantan, MaterialIds.electrum
    );
    tag(TinkerTags.Materials.HEAVY).add(
      MaterialIds.copper, MaterialIds.cactus,
      MaterialIds.iron, MaterialIds.weepingVine,
      MaterialIds.steel, MaterialIds.titanium, MaterialIds.chromium,
      MaterialIds.cortosis, MaterialIds.quadranium, MaterialIds.fireDiamond
    ).addOptional(
      MaterialIds.lead, MaterialIds.uranium,
      MaterialIds.platinum, MaterialIds.brass
    );

    tag(TinkerTags.Materials.SLIMESKULL).add(
      MaterialIds.glass,
      MaterialIds.leather, MaterialIds.iron, MaterialIds.copper,
      MaterialIds.string, MaterialIds.darkthread,
      MaterialIds.bone, MaterialIds.ice, MaterialIds.necroticBone,
      MaterialIds.gold, MaterialIds.aurodium, MaterialIds.castIron,
      MaterialIds.blaze, MaterialIds.enderPearl, MaterialIds.dragonScale,
      MaterialIds.venombone, MaterialIds.blazingBone, MaterialIds.beskar
    );
  }

  @Override
  public String getName() {
    return "Tinkers' Construct Material Tag Provider";
  }
}
