package f04041.piggybank.common;

import net.minecraft.block.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import f04041.piggybank.common.block.BlockPiggybank;
import f04041.piggybank.common.block.BlockSellingshop;

@Mod(modid="f04041-Piggybank", name="Piggybank", version="1.0")
public class Pigggybank
{
	public static Block blockPiggybank;
	public static Block blockSellingshop;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//ブロックのインスタンス生成
		blockPiggybank = new BlockPiggybank();
		blockSellingshop = new BlockSellingshop();
		//ブロックの登録
		GameRegistry.registerBlock(blockPiggybank, "bpiggybank");
		GameRegistry.registerBlock(blockSellingshop, "sellingshop");

	}
}