package train.common.entity;

import tmt.ModelConverter;

/**
 * @author 02skaplan
 * <p>Stores information about an individual custom load's model, texture, and offset.</p>
 * <p>Models may have more than one CargoSpecification, stored in the cargoSpecificationList of its entity's CargoManager.</p>
 */
public class CargoSpecification {
    public final Class<? extends ModelConverter> cargoModelClass;
    public final String textureFile;
    public final String textureName;
    public final double offsetX;
    public final double offsetY;
    public final double offsetZ;

    /**
     * @author 02skaplan
     * <p>Stores information about an individual custom load's model, texture, and offset.</p>
     * <p>Models may have more than one CargoSpecification, stored in the cargoSpecificationList of its entity's CargoManager.</p>
     * @param cargoModelClass Model class of the cargo.
     * @param textureFile Texture file of the cargo. ".PNG" extention is assumed. Ex. "loads/MixedLogs_Oak"
     * @param textureName Texture name of the cargo. Used for GUI display purposes only.
     * @param offsetX X offset relative to host model origin.
     * @param offsetY Y offset relative to host model origin.
     * @param offsetZ Z offset relative to host model origin.
     */
    public CargoSpecification(Class<? extends ModelConverter> cargoModelClass, String textureFile, String textureName, double offsetX, double offsetY, double offsetZ) {
        this.cargoModelClass = cargoModelClass;
        this.textureFile = textureFile;
        this.textureName = textureName;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.offsetZ = offsetZ;
    }
}