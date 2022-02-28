package main.java.interfaces;

public class Team2 extends Object implements BasketballTeam1, FootballTeam  {

	private String name = null;
	final int y=9;
	
	public Team2(String name) {
		this.name = name;
	}

	@Override
	public void printFootballName() {
		System.out.println("Football Team: \"" + name + " F.C.\"");
	}

	@Override
	public void printBasketballName() {
		System.out.println("Basketball Team: \"" + name + " B.C.\"");
	}
	
	public static void main(String[] args) {
		Team2 t = new Team2("Team A");
		t.printBasketballName();
		t.printFootballName();
		t.setName("himanshu");
		System.out.println(t.getName());
		BasketballTeam1 bt = new Team2("pppppppppppp");
		((Team2) bt).printFootballName();		//class casting
		((FootballTeam) bt).setFage();
		bt.setName("");
		
	}
	
	@Override
	public void setName(String nname) {
		// TODO Auto-generated method stub
		this.name = nname;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setFage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	
	

}
