package riddlersLabyrinth;

public class LabPosition {
	//instance variables
	private int _r;
	private int _c;
	//constructor for a position class
	public LabPosition(int row, int col) {
		_r = row;
		_c = col;
	}
	//getters
	public int getRow() { return _r; }
	public int getCol() { return _c; }
	
	
}
