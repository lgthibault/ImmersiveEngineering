package blusunrize.immersiveengineering.common.blocks;

import net.minecraft.util.IStringSerializable;

import java.util.Locale;

public enum BlockTypes_MetalsIE implements IStringSerializable, BlockIEBase.IBlockEnum
{
	COPPER,
	ALUMINUM,
	LEAD,
	SILVER,
	NICKEL,
	URANIUM,
	CONSTANTAN,
	ELECTRUM,
	STEEL;
	
	@Override
	public String getName()
	{
		return this.toString().toLowerCase(Locale.ENGLISH);
	}
	@Override
	public int getMeta()
	{
		return ordinal();
	}
	@Override
	public boolean listForCreative()
	{
		return true;
	}
}