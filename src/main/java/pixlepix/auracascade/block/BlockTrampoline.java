package pixlepix.auracascade.block;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import pixlepix.auracascade.data.EnumAura;
import pixlepix.auracascade.item.ItemMaterial;
import pixlepix.auracascade.registry.CraftingBenchRecipe;
import pixlepix.auracascade.registry.ITTinkererBlock;
import pixlepix.auracascade.registry.ThaumicTinkererRecipe;

/**
 * Created by localmacaccount on 2/5/15.
 */
public class BlockTrampoline extends Block implements ITTinkererBlock {
    public BlockTrampoline() {
        super(Material.cloth);
        //Block Bounds
        func_149676_a(0F, 0F, 0F, 1F, .8F, 1F);
        setLightLevel(1F);
        setHardness(2F);
    }

    @Override
    public ArrayList<Object> getSpecialParameters() {
        return null;
    }

    @Override
    public String getBlockName() {
        return "trampoline";
    }

    @Override
    public void onEntityCollidedWithBlock(World world, BlockPos pos, Entity entity) {
        entity.motionY = 10;

    }

    @Override
    public boolean shouldRegister() {
        return true;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean shouldDisplayInTab() {
        return true;
    }

    @Override
    public Class<? extends ItemBlock> getItemBlock() {
        return null;
    }

    @Override
    public Class<? extends TileEntity> getTileEntity() {
        return null;
    }

    @Override
    public ThaumicTinkererRecipe getRecipeItem() {
        return new CraftingBenchRecipe(new ItemStack(this), " S ", "SIS", " S ", 'I', ItemMaterial.getIngot(EnumAura.VIOLET_AURA), 'S', new ItemStack(Items.slime_ball));
    }

    @Override
    public int getCreativeTabPriority() {
        return -50;
    }
}
