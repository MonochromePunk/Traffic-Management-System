public class MutableChip extends Chip {
	
	MutableChip(String chipNumber,float chipRange)
	{
		this.chipNumber = chipNumber;
		this.message = "NOT_URGENT";
		this.chipRange = chipRange;
	}
		
	public void setMessage(String message) 
	{
		this.message = message;
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
