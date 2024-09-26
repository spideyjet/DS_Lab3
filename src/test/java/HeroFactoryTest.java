import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroFactoryTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDwarfWarrior() {
		HeroInterface Dwarf = HeroFactory.createHero("DWARF", "WARRIOR");
		
		assertEquals(20, Dwarf.getDEX());
		assertEquals(20, Dwarf.getINT());
		assertEquals(25, Dwarf.getSTR());
		
		assertEquals("DWARF", Dwarf.getRaceName());
		assertEquals("WARRIOR", Dwarf.getJobName());
		
		assertEquals(70, Dwarf.attack(2));
		
		assertNull(HeroFactory.createHero("DWARF", "WARIOR"));
		assertNull(HeroFactory.createHero("DWaRF", "WARRIOR"));
		assertNull(HeroFactory.createHero("DWARF", "warrior"));
		
		HeroInterface Dwarf2 = HeroFactory.createHero("DWARF", "MAGE");
		HeroInterface Dwarf3 = HeroFactory.createHero("DWARF", "ARCHER");
		
		assertEquals("MAGE", Dwarf2.getJobName());
		assertEquals("ARCHER", Dwarf3.getJobName());
	}
	
	@Test
	void testElfArcher() {
		HeroInterface Elf = HeroFactory.createHero("ELF", "ARCHER");
		
		assertEquals(25, Elf.getDEX());
		assertEquals(20, Elf.getINT());
		assertEquals(20, Elf.getSTR());
		
		assertEquals("ELF", Elf.getRaceName());
		assertEquals("ARCHER", Elf.getJobName());
		
		assertEquals(75, Elf.attack(2));
		
		assertNull(HeroFactory.createHero("ELF", "Archer"));
		assertNull(HeroFactory.createHero("ELR", "ARCHER"));
		assertNull(HeroFactory.createHero("ELF", "archer"));
		
		HeroInterface Elf2 = HeroFactory.createHero("ELF", "WARRIOR");
		HeroInterface Elf3 = HeroFactory.createHero("ELF", "MAGE");
		
		assertEquals("WARRIOR", Elf2.getJobName());
		assertEquals("MAGE", Elf3.getJobName());
	}
	@Test
	void testRobotMage() {
		HeroInterface Robot = HeroFactory.createHero("ROBOT", "MAGE");
		
		assertEquals(20, Robot.getDEX());
		assertEquals(25, Robot.getINT());
		assertEquals(20, Robot.getSTR());
		
		assertEquals("ROBOT", Robot.getRaceName());
		assertEquals("MAGE", Robot.getJobName());
		
		assertEquals(70, Robot.attack(2));
		
		assertNull(HeroFactory.createHero("RObOT", "MAGE"));
		assertNull(HeroFactory.createHero("ROBOT", "MADE"));
		assertNull(HeroFactory.createHero("ROBOT", "Mage"));
		
		HeroInterface Robot2 = HeroFactory.createHero("ROBOT", "ARCHER");
		HeroInterface Robot3 = HeroFactory.createHero("ROBOT", "WARRIOR");
		
		assertEquals("ARCHER", Robot2.getJobName());
		assertEquals("WARRIOR", Robot3.getJobName());
		
		
	}
}