package slimeknights.tconstruct.library.materials.ore;

import org.jetbrains.annotations.Nullable;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.smeltery.data.SmelteryCompat.CompatType;

/**
 * Public description for addon-defined ore materials.
 * Addons can use this as a single source of truth for their own material, recipe, and smeltery datagen.
 */
public record CustomOreMaterial(MaterialId materialId, String fluidName, CompatType compatType, @Nullable MaterialId legacyRedirect) {
  public CustomOreMaterial(MaterialId materialId, String fluidName, CompatType compatType) {
    this(materialId, fluidName, compatType, null);
  }
}
