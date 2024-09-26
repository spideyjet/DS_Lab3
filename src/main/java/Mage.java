public class Mage extends Job
{
	@Override
	public int attack(int val, Race hero)
	{
		return hero.getDEX() + hero.getINT() * val;
	}
		
	

}
