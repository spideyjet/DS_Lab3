public class HeroFactory
{
   public static HeroInterface createHero(String raceName, String jobName)   
   {
	Race R = null;
	Job J = null;
	if(raceName == ("DWARF"))
	{
		R = new Dwarf();
	}
	
		else if (raceName == ("ELF"))
	{
		R = new Elf();
		
	}
		else if (raceName ==("ROBOT"))
	{
		R = new Robot();
	}
		if(jobName == ("MAGE"))
	{
		J = new Mage();
	}
		else if (jobName == ("ARCHER"))
	{
		J = new Archer();
	}
		else if (jobName == ("WARRIOR"))
	{
		J = new Warrior();
	}
	if (R == null || J == null)
	{
		return null;
	}
	return R;
   }
  






}