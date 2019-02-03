package com.daniel4b.dprmod.blocks;

import java.util.List;

import com.daniel4b.dprmod.Main;
import com.daniel4b.dprmod.init.ModBlocks;
import com.daniel4b.dprmod.init.ModItems;
import com.daniel4b.dprmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MuisBlock extends BlockHorizontal implements IHasModel 
	{
	private static final AxisAlignedBB BOUNDING_BOX = new AxisAlignedBB(0.0625 * 5, 0, 0.0625 * 5, 0.0625 * 11, 0.0625 * 3, 0.0625 * 11);
	private static final AxisAlignedBB COLLISION_BOX = new AxisAlignedBB(0.0625 * 6, 0, 0.0625 * 6, 0.0625 * 10, 0.0625 * 2, 0.0625 * 10);
	
	public MuisBlock(String name, Material material) 
		{
		    super(Material.IRON);
			setUnlocalizedName(name);
			setRegistryName(name);
			setCreativeTab(Main.tutorialtab);
			setSoundType(SoundType.METAL);
			setHardness(5.0F);
			setResistance(15.0F);
			setHarvestLevel("pickaxe", 2);
				
			ModBlocks.BLOCKS.add(this);
			ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		}

	  public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
          return worldIn.getBlockState(pos).getBlock().isReplaceable(worldIn, pos)
                    && worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
     }

     public IBlockState withRotation(IBlockState state, Rotation rot) {
          return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
     }

     public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
          return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
     }

     public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
          return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
     }

     public IBlockState getStateFromMeta(int meta) {
          return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
     }

     public int getMetaFromState(IBlockState state) {
          return ((EnumFacing) state.getValue(FACING)).getHorizontalIndex();
     }

     @Override
     protected BlockStateContainer createBlockState() {
          return new BlockStateContainer(this, new IProperty[]{FACING});
     }
	
	    @Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		}
		
		@Override
		public boolean isFullCube(IBlockState state) {
		return false;
		}
		
		@Override
		public boolean isOpaqueCube(IBlockState state) {
		return false;
		}
		
		@Override
		public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
		}
		
		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BOUNDING_BOX;
		}
		
		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, Entity entityIn, boolean isActualState) {
			super.addCollisionBoxToList(pos, entityBox, collidingBoxes, COLLISION_BOX);
		}
}
