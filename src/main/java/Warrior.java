
public class Warrior extends Job
{
	@Override
	public int attack(int val, Race hero)
	{
		return hero.getSTR() * val + hero.getDEX();
	}
		
	

}


