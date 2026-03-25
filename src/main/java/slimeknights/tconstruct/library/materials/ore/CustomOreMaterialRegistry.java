package slimeknights.tconstruct.library.materials.ore;

import com.google.common.collect.ImmutableList;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.smeltery.data.SmelteryCompat.CompatType;
import slimeknights.tconstruct.tools.data.material.MaterialIds;

import java.util.ArrayList;
import java.util.List;

/**
 * Lightweight registry for ore-style addon materials.
 * Tinkers already supports fully data-driven materials; this API exists to give addons a stable place to declare
 * ore-specific identities and legacy redirects before feeding them into their own datagen.
 */
public final class CustomOreMaterialRegistry {
  private static final List<CustomOreMaterial> REGISTERED = new ArrayList<>();

  static {
    registerBuiltin(MaterialIds.aluminum, "aluminum", CompatType.ORE);
    registerBuiltin(MaterialIds.lead, "lead", CompatType.ORE);
    registerBuiltin(MaterialIds.nickel, "nickel", CompatType.ORE);
    registerBuiltin(MaterialIds.platinum, "platinum", CompatType.ORE);
    registerBuiltin(MaterialIds.uranium, "uranium", CompatType.ORE, MaterialIds.necronium);
    registerBuiltin(MaterialIds.chromium, "chromium", CompatType.ORE);
    registerBuiltin(MaterialIds.electrum, "electrum", CompatType.ALLOY);
    registerBuiltin(MaterialIds.constantan, "constantan", CompatType.ALLOY);
    registerBuiltin(MaterialIds.brass, "brass", CompatType.ALLOY, MaterialIds.platedSlimewood);
    registerBuiltin(MaterialIds.steel, "steel", CompatType.ORE);
  }

  private CustomOreMaterialRegistry() {}

  public static void register(CustomOreMaterial material) {
    REGISTERED.add(material);
  }

  public static List<CustomOreMaterial> getRegistered() {
    return ImmutableList.copyOf(REGISTERED);
  }

  private static void registerBuiltin(MaterialId materialId, String fluidName, CompatType compatType) {
    registerBuiltin(materialId, fluidName, compatType, null);
  }

  private static void registerBuiltin(MaterialId materialId, String fluidName, CompatType compatType, MaterialId legacyRedirect) {
    REGISTERED.add(new CustomOreMaterial(materialId, fluidName, compatType, legacyRedirect));
  }
}
