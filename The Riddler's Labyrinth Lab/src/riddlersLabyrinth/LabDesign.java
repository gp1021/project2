package riddlersLabyrinth;

public class LabDesign {
	//instance variables
	private boolean[][] _lab;
	public static final LabPosition end = new LabPosition(10, 5);
	
	//gets a random position in the ladyrinth for questions to spawn at
	public LabPosition getQPos() {
		int x = (int) (Math.random() * 12);
		int[] row = {7, 3, 3, 1, 1, 6, 6, 9, 9, 3, 7, 5};
		int[] col = {5, 3, 7, 1, 9, 1, 9, 5, 9, 5, 7, 9};
		return new LabPosition(row[x], col[x]);
	}
	//holds the design of the labyrinth as a 2d boolean 
	public LabDesign() {
		//true = wall
		//false = space
		boolean[][] lab = {{true, true,  true,  true,  true,  true,  true,  true,  true,  true,  true},
		/*1*/			   {true, false, false, false, false, false, false, false, false, false, true},
		/*2*/			   {true, false, true,  true,  true,  true,  true,  true,  true,  false, true},
		/*3*/			   {true, false, true,  false, false, false, false, false, true,  false, true},
		/*4*/			   {true, false, true,  false, true,  true,  true,  false, true,  false, true},
		/*5*/			   {true, false, true,  false, false, false, true,  false, true,  false, true},
		/*6*/			   {true, false, true,  true,  true,  true,  true,  false, true,  false, true},
		/*7*/			   {true, false, false, false, false, false, false, false, true,  false, true},
		/*8*/			   {true, true,  true,  true,  true,  true,  true,  true,  true,  false, true},
		/*9*/			   {true, true,  true,  true,  true,  false, false, false, false, false, true},
		/*10*/			   {true, true,  true,  true,  true,  false, true,  true,  true,  true,  true}};
			_lab = lab;
		
		}
	//getters
	public boolean[][] getLab() { return _lab; }
	
	public LabPosition getEnd() { return end; }
	
}
