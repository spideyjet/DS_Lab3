
public class Archer extends Job
{
	@Override
	public int attack(int val, Race hero)
	{
		return (int) (hero.getDEX() * 1.5 * val);
	}
		
	

}


