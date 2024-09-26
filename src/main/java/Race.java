
public class Race implements HeroInterface
{
	public int getSTR()
	{
		return 20;
	}
	public int getINT()
	{
		return 20;
	}
	public int getDEX()
	{
		return 20;
	}
	public String getRaceName() {
		return null;
	}
	@Override
	public int attack(int val) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return null;
	}
	Job job;
	
	private Race(Job job)
	{
		this.job = job;
	}
	Race race;
	private Race(Race race)
	{
		this.race = race;
	}
}


