package train.common.tile;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;
import train.common.entity.TrustedPlayer;

import java.util.ArrayList;
import java.util.List;

public abstract class TileSwitchStand extends TileTraincraft {
    private ForgeDirection facing;
    private boolean locked = false;
    private String owner = "";
    private List<TrustedPlayer> trustedPlayerList = new ArrayList<>();

    @Override
    public void readFromNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.readFromNBT(nbtTag, false);
        trustedPlayerList.clear();
        facing = ForgeDirection.getOrientation(nbtTag.getByte("Orientation"));
        locked = nbtTag.getBoolean("locked");
        owner = nbtTag.getString("owner");
        trustedPlayerList = TrustedPlayer.importTrustedListFromNBT(nbtTag, "");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound nbtTag, boolean forSyncing) {
        //super.writeToNBT(nbtTag, forSyncing);
        if (facing != null) {

            nbtTag.setByte("Orientation", (byte) facing.ordinal());
        }
        else {

            nbtTag.setByte("Orientation", (byte) ForgeDirection.NORTH.ordinal());
        }
        nbtTag.setBoolean("locked", locked);
        nbtTag.setString("owner", owner);
        TrustedPlayer.exportToNBT(trustedPlayerList, nbtTag);
        return nbtTag;
    }

    public ForgeDirection getFacing() {
        if(facing!=null){
            return this.facing;
        }
        return ForgeDirection.UNKNOWN;
    }


    public void setFacing(ForgeDirection face) {

        if (facing != face)
            this.facing = face;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public AxisAlignedBB getRenderBoundingBox()
    {
        return AxisAlignedBB.getBoundingBox(xCoord-1, yCoord-1, zCoord-1, xCoord + 2, yCoord + 2, zCoord + 2);
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<TrustedPlayer> getTrustedList() {
        return trustedPlayerList;
    }

    public void setTrustedList(List<TrustedPlayer> trustedPlayerList) {
        this.trustedPlayerList = trustedPlayerList;
    }
}