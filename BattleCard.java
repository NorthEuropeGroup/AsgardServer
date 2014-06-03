import java.util.*;
public class BattleCard
{
	private String master;
	public ArrayList<AllCard> cardSelect;
	public BattleCard(String m, AllCard c1, AllCard c2)
	{
		master = m;
		cardSelect.add(c1);
		cardSelect.add(c2);
	}
}