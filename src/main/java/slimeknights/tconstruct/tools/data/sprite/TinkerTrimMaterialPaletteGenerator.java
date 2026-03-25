package slimeknights.tconstruct.tools.data.sprite;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import slimeknights.tconstruct.TConstruct;
import slimeknights.tconstruct.library.client.data.material.AbstractMaterialSpriteProvider;
import slimeknights.tconstruct.library.client.data.material.TrimMaterialPaletteGenerator;
import slimeknights.tconstruct.library.client.data.spritetransformer.ISpriteTransformer;
import slimeknights.tconstruct.library.materials.definition.MaterialId;
import slimeknights.tconstruct.tools.data.material.MaterialIds;

public class TinkerTrimMaterialPaletteGenerator extends TrimMaterialPaletteGenerator {
  public TinkerTrimMaterialPaletteGenerator(PackOutput packOutput, ExistingFileHelper existingFileHelper, AbstractMaterialSpriteProvider materialProvider) {
    super(packOutput, TConstruct.MOD_ID, existingFileHelper, materialProvider, MaterialIds.TRIM_MATERIALS);
  }

  @Override
  protected ISpriteTransformer getTransformer(MaterialId material) {
    return super.getTransformer(material);
  }
}
