public class ImmutableChip extends Chip
{
       
	ImmutableChip(String chipNumber,float chipRange)
	{
		this.chipNumber = chipNumber;
		this.message = "NOT_URGENT";
		this.chipRange = chipRange;
	}
		
	public String getMessage()
	{
		return this.message;
	}
	public float getChipRange()
	{
		return this.chipRange;
	}
	public String getChipNumber()
	{
		return this.chipNumber;
	}
}
