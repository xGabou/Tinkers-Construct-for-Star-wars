package slimeknights.tconstruct.tools.data.material;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialRenderInfoProvider;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.materials.definition.IMaterial;
import slimeknights.tconstruct.library.materials.definition.MaterialVariantId;
import slimeknights.tconstruct.library.tools.helper.ToolBuildHandler;

public class MaterialRenderInfoProvider extends AbstractMaterialRenderInfoProvider {
  public MaterialRenderInfoProvider(PackOutput packOutput, AbstractMaterialSpriteProvider spriteProvider, ExistingFileHelper existingFileHelper) {
    super(packOutput, spriteProvider, existingFileHelper);
  }

  @Override
  protected void addMaterialRenderInfo() {
    buildRenderInfo(IMaterial.UNKNOWN_ID);

    buildRenderInfo(MaterialIds.flint).color(0x3D3C3C).fallbacks("crystal", "rock", "stick");
    buildRenderInfo(MaterialIds.bone).color(0xE8E5D2).fallbacks("bone", "rock");
    buildRenderInfo(MaterialIds.chorus);
    buildRenderInfo(MaterialIds.string).color(0xFFFFFF);
    buildRenderInfo(MaterialIds.leather).color(0xC65C35);
    buildRenderInfo(MaterialIds.vine).color(0x48B518).fallbacks("vine");
    buildRenderInfo(MaterialIds.ice).color(0x74ABFE);
    buildRenderInfo(MaterialIds.cactus).color(0x649832);
    buildRenderInfo(MaterialIds.paper);
    redirect(MaterialIds.leaves, MaterialIds.vine);
    buildRenderInfo(MaterialIds.wood).color(0x876627).fallbacks("wood", "stick", "primitive");
    buildRenderInfo(MaterialIds.crimson);
    buildRenderInfo(MaterialIds.warped);
    buildRenderInfo(MaterialIds.bamboo);
    redirect(MaterialIds.rock, MaterialIds.stone);
    buildRenderInfo(MaterialIds.stone).color(0xB1AFAD);
    buildRenderInfo(MaterialIds.diorite);
    buildRenderInfo(MaterialIds.granite);
    buildRenderInfo(MaterialIds.blackstone);
    buildRenderInfo(MaterialIds.basalt);
    redirect(MaterialIds.andesite, MaterialIds.stone);
    redirect(MaterialIds.calcite, MaterialIds.diorite);
    redirect(MaterialIds.deepslate, MaterialIds.basalt);
    MaterialVariantId whiteWool = MaterialVariantId.create(MaterialIds.wool, DyeColor.WHITE.getName());
    redirect(MaterialIds.wool, whiteWool);
    for (DyeColor color : DyeColor.values()) {
      buildRenderInfo(MaterialVariantId.create(MaterialIds.wool, color.getName()));
    }
    redirect(MaterialIds.feather, whiteWool);

    buildRenderInfo(MaterialIds.iron).color(0xD8D8D8).fallbacks("metal");
    buildRenderInfo(MaterialIds.oxidizedIron).color(0xE9C8B1).fallbacks("metal");
    buildRenderInfo(MaterialIds.copper).color(0xE77C56).fallbacks("metal");
    buildRenderInfo(MaterialIds.oxidizedCopper).color(0x4FAB90).fallbacks("metal");
    buildRenderInfo(MaterialIds.searedStone).color(0x4F4A47).fallbacks("rock");
    buildRenderInfo(MaterialIds.scorchedStone).color(0x5B4C43).fallbacks("rock");
    buildRenderInfo(MaterialIds.venombone).color(0xA2935E).fallbacks("bone", "rock");
    buildRenderInfo(MaterialIds.necroticBone).color(0x2A2A2A).fallbacks("bone", "rock");
    buildRenderInfo(MaterialIds.endstone);
    redirect(MaterialIds.whitestone, MaterialIds.endstone);
    buildRenderInfo(MaterialIds.skyslimeVine).color(0x00F4DA).fallbacks("vine");
    buildRenderInfo(MaterialIds.weepingVine);
    buildRenderInfo(MaterialIds.twistingVine);
    redirect(MaterialIds.slimewood, MaterialIds.greenheart);
    buildRenderInfo(MaterialIds.greenheart);
    buildRenderInfo(MaterialIds.skyroot);
    buildRenderInfo(MaterialIds.bloodshroom);
    buildRenderInfo(MaterialIds.enderbark);
    buildRenderInfo(MaterialIds.slimeskin);
    redirect(MaterialIds.slimeball, MaterialIds.earthslime);
    redirect(MaterialVariantId.create(MaterialIds.slimeball, "sky"), MaterialIds.skyslime);
    redirect(MaterialVariantId.create(MaterialIds.slimeball, "ichor"), MaterialIds.ichor);
    redirect(MaterialVariantId.create(MaterialIds.slimeball, "ender"), MaterialIds.enderslime);

    buildRenderInfo(MaterialIds.nahuatl).color(0x3B2754).fallbacks("wood", "stick");
    buildRenderInfo(MaterialIds.steel).color(0x959595).fallbacks("metal");
    buildRenderInfo(MaterialIds.cortosis).color(0x6E7C7B).fallbacks("metal");
    buildRenderInfo(MaterialIds.electrum).color(0xFFEA65).fallbacks("metal");
    buildRenderInfo(MaterialIds.alum).color(0xC9D8D8).fallbacks("metal");
    buildRenderInfo(MaterialIds.ultrachrome).color(0x9DC6D6).fallbacks("metal");
    buildRenderInfo(MaterialIds.crystalWeave).color(0x58C78A).fallbacks("metal");
    buildRenderInfo(MaterialIds.titanium).color(0xA7AEB7).fallbacks("metal");
    buildRenderInfo(MaterialIds.fireDiamond).color(0xFF7E44).fallbacks("metal");
    buildRenderInfo(MaterialIds.quadranium).color(0x8A78D1).fallbacks("metal");
    buildRenderInfo(MaterialIds.aurodium).color(0xF4D97A).fallbacks("metal");
    buildRenderInfo(MaterialIds.doonium).color(0x5A5D73).fallbacks("metal");
    buildRenderInfo(MaterialIds.castIron).color(0x747474).fallbacks("metal");
    buildRenderInfo(MaterialIds.carbonite).color(0x3F444D).fallbacks("metal");
    buildRenderInfo(MaterialIds.codoran).color(0xD97C59).fallbacks("metal");
    buildRenderInfo(MaterialIds.lapis).color(0x3B64C4).fallbacks("metal");
    buildRenderInfo(MaterialIds.redstone).color(0xB02A2A).fallbacks("metal");
    buildRenderInfo(MaterialIds.coal).color(0x2B2B2B).fallbacks("metal");
    buildRenderInfo(MaterialIds.sulfur).color(0xD7C648).fallbacks("metal");
    buildRenderInfo(MaterialIds.lithium).color(0xC8CDD8).fallbacks("metal");
    buildRenderInfo(MaterialIds.beryllium).color(0x8FD4A7).fallbacks("metal");
    buildRenderInfo(MaterialIds.darkthread);
    buildRenderInfo(MaterialIds.ichorskin);

    buildRenderInfo(MaterialIds.blazingBone).color(0xF2D500).fallbacks("bone", "rock").luminosity(15);
    buildRenderInfo(MaterialIds.blazewood).fallbacks("wood", "stick").luminosity(7);
    buildRenderInfo(MaterialIds.ancientHide);
    buildRenderInfo(MaterialIds.ancient);
    buildRenderInfo(MaterialIds.enderslimeVine).color(0xA92DFF).fallbacks("vine");

    buildRenderInfo(MaterialIds.ironwood);
    buildRenderInfo(MaterialIds.lead).color(0x696579).fallbacks("metal");
    buildRenderInfo(MaterialIds.nickel).color(0xEBF1DE).fallbacks("metal");
    buildRenderInfo(MaterialIds.platinum).color(0xD8F1F4).fallbacks("metal");
    buildRenderInfo(MaterialIds.uranium).color(0xA3B1A8).fallbacks("metal");
    buildRenderInfo(MaterialIds.chromium).color(0xB8D5E3).fallbacks("metal");
    buildRenderInfo(MaterialIds.whitestoneComposite, MaterialIds.whitestone).color(0xE0E9EC).fallbacks("rock");
    buildRenderInfo(MaterialIds.treatedWood);
    redirect(MaterialIds.whitestoneAluminum, MaterialIds.whitestoneComposite);
    redirect(MaterialIds.whitestoneTin, MaterialIds.whitestoneComposite);
    redirect(MaterialIds.whitestoneZinc, MaterialIds.whitestoneComposite);
    buildRenderInfo(MaterialIds.aluminum);
    buildRenderInfo(MaterialIds.constantan).color(0xFF8B70).fallbacks("metal");
    buildRenderInfo(MaterialIds.brass).color(0xE6D08D).fallbacks("metal");

    buildRenderInfo(MaterialIds.amethyst);
    buildRenderInfo(MaterialIds.prismarine);
    buildRenderInfo(MaterialIds.glass);
    buildRenderInfo(MaterialIds.earthslime);
    buildRenderInfo(MaterialIds.skyslime);
    buildRenderInfo(MaterialIds.enderslime);
    buildRenderInfo(MaterialIds.blaze);
    buildRenderInfo(MaterialIds.enderPearl);
    buildRenderInfo(MaterialIds.quartz);
    buildRenderInfo(MaterialIds.ichor).luminosity(10);
    buildRenderInfo(MaterialIds.magma).luminosity(5);
    buildRenderInfo(MaterialIds.glowstone).luminosity(15);
    buildRenderInfo(MaterialIds.gunpowder);
    buildRenderInfo(MaterialIds.dragonScale);
    buildRenderInfo(MaterialIds.endRod);
    redirect(MaterialIds.magnetite, MaterialIds.steel);
    redirect(MaterialIds.shulker, MaterialIds.chorus);
    buildRenderInfo(MaterialIds.knightly);

    buildRenderInfo(MaterialIds.gold).color(0xFDF55F).fallbacks("metal");
    buildRenderInfo(MaterialIds.obsidian);
    buildRenderInfo(MaterialIds.blood);
    buildRenderInfo(MaterialIds.clay);
    buildRenderInfo(MaterialIds.honey);
    buildRenderInfo(MaterialIds.phantom);

    redirect(ToolBuildHandler.getRenderMaterial(0), MaterialIds.iron);
    redirect(ToolBuildHandler.getRenderMaterial(1), MaterialIds.wood);
    redirect(ToolBuildHandler.getRenderMaterial(2), MaterialIds.chromium);
    redirect(ToolBuildHandler.getRenderMaterial(3), MaterialIds.quadranium);
    redirect(ToolBuildHandler.getRenderMaterial(4), MaterialIds.copper);
  }

  @Override
  public String getName() {
    return "Tinkers' Construct Material Render Info Provider";
  }
}
