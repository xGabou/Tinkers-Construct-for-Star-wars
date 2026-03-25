package slimeknights.tconstruct.tools.data.material;

import net.minecraft.Util;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.level.ItemLike;
import slimeknights.mantle.registration.object.MetalItemObject;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.shared.TinkerMaterials;
import slimeknights.tconstruct.world.TinkerWorld;

import java.util.Map;

/** Provider for trim materials */
public class TrimMaterialProvider {
  private static final String TRIM_FORMAT = TConstruct.makeDescriptionId("trim_material", "format");

  /** Registers all providers */
  public static void register(RegistrySetBuilder builder) {
    builder.add(Registries.TRIM_MATERIAL, TrimMaterialProvider::registerTrimMaterials);
  }

  /** Registers all trim materials with the context */
  private static void registerTrimMaterials(BootstapContext<TrimMaterial> context) {
    // we set model indexes as fallbacks for when trimmed is not installed so you have at least something on vanilla models
    material(context, MaterialIds.beskar,       TinkerMaterials.steel,       0x9AA28B, 0.8f);
    material(context, MaterialIds.cortosis,     TinkerMaterials.steel,       0x6E7C7B, 0.9f);
    material(context, MaterialIds.electrum,     Items.GOLD_INGOT,            0xF7E065, 0.1f);
    material(context, MaterialIds.alum,         Items.IRON_INGOT,            0xC9D8D8, 0.6f);
    material(context, MaterialIds.steel,        TinkerMaterials.steel,       0x959595, 0.2f);
    material(context, MaterialIds.ultrachrome,  Items.IRON_INGOT,            0x9DC6D6, 0.9f);
    material(context, MaterialIds.quadranium,   Items.AMETHYST_SHARD,        0x8A78D1, 1.0f);
    material(context, MaterialIds.titanium,     Items.NETHERITE_INGOT,       0xA7AEB7, 0.3f);
    material(context, MaterialIds.fireDiamond,  Items.DIAMOND,               0xFF7E44, 0.4f);
    material(context, MaterialIds.crystalWeave, Items.EMERALD,               0x58C78A, 0.7f);
    material(context, MaterialIds.aurodium,     Items.GOLD_INGOT,            0xF4D97A, 0.1f);
    material(context, MaterialIds.castIron,     Items.IRON_INGOT,            0x747474, 0.5f);
    
    material(context, MaterialIds.earthslime, TinkerWorld.earthGeode, 0x01cd4e, 0.7f); // emerald
    material(context, MaterialIds.skyslime,   TinkerWorld.skyGeode,   0x01cbcd, 0.8f); // diamond
    material(context, MaterialIds.ichor,      TinkerWorld.ichorGeode, 0xff970d, 0.5f); // copper
    material(context, MaterialIds.enderslime, TinkerWorld.enderGeode, 0xaf4cf6, 1.0f); // amethyst
  }

  /** Registers a trim materials using the ingot with the context */
  private static void material(BootstapContext<TrimMaterial> context, MaterialId material, MetalItemObject ingredient, int color, float modelIndex) {
    material(context, material, ingredient.getIngot(), color, modelIndex);
  }

  /** Registers a trim materials with the context */
  private static void material(BootstapContext<TrimMaterial> context, MaterialId material, ItemLike ingredient, int color, float modelIndex) {
    context.register(
      ResourceKey.create(Registries.TRIM_MATERIAL, material),
      TrimMaterial.create(material.getSuffix(), ingredient.asItem(), modelIndex,
        Component.translatable(TRIM_FORMAT, Component.translatable(Util.makeDescriptionId("material", material))).withStyle(style -> style.withColor(color)),
        Map.of())
    );
  }
}
