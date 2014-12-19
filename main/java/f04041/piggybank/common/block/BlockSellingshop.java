package f04041.piggybank.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSellingshop extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public BlockSellingshop() {
        super(Material.rock);
        setCreativeTab(CreativeTabs.tabDecorations);/*クリエイティブタブの選択*/
        setBlockName("blockSample");/*システム名の設定*/
        setBlockTextureName("samplemod:block_sample");/*ブロックのテクスチャの指定(複数指定の場合は消してください。)*/
        /*以下のものは消しても結構です*/
        setHardness(1.5F);/*硬さ*/
        setResistance(1.0F);/*爆破耐性*/
        setStepSound(Block.soundTypeStone);/*ブロックの上を歩いた時の音*/
	/*setBlockUnbreakable();*//*ブロックを破壊不可に設定*/
	/*setTickRandomly(true);*//*ブロックのtick処理をランダムに。デフォルトfalse*/
	/*disableStats();*//*ブロックの統計情報を保存しない*/
        setLightOpacity(1);/*ブロックの透過係数。デフォルト０（不透過）*/
        setLightLevel(1.0F);/*明るさ 1.0F = 15*/
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
        //ブロックを右クリックした際の動作
        return true;
    }

    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
        //ブロックを左クリックした際の動作
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock){
        //周囲のブロックが更新された際の動作
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random){
        //ドロップするアイテムを返す
        return quantityDroppedWithBonus(fortune, random);
    }

    @Override
    public int quantityDropped(Random random){
        //ドロップさせる量を返す
        return 1;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("samplemod:block_sample");
        this.SideIcon = par1IconRegister.registerIcon("samplemod:block_sample-side");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
         if(par1 == 0 || par1 == 1)
         {
                  return TopIcon;
         }
         if(par1 == 2 || par1 == 3 || par1 == 4 || par1 == 5 || par1 == 6)
         {
                  return SideIcon;
         }
         else
         {
                 return null;
         }
    }
}