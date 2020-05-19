package riddlersLabyrinth;

public class LabPlayer {
	private int _r;
	private int _c;
	private LabPosition _curPos;
	
	public LabPlayer() {
		_curPos = new LabPosition(5, 5);
	}
	
	public LabPosition move(LabDesign l, int buttons, WindowLabyrinth w) {
		if (buttons == 0) {
			if (l.getLab()[_curPos.getRow()-1][_curPos.getCol()]) {
				w.msg1("Don't walk into walls.");
			} else {
				_curPos = new LabPosition(_curPos.getRow()-1, _curPos.getCol());
			}
		} else if (buttons == 1) {
			if (l.getLab()[_curPos.getRow()+1][_curPos.getCol()]) {
				w.msg1("If you walk into a wall again you're getting a concussion.");
			} else {
				_curPos = new LabPosition(_curPos.getRow()+1, _curPos.getCol());
			}
		} else if (buttons == 2) {
			if (l.getLab()[_curPos.getRow()][_curPos.getCol()-1]) {
				w.msg1("Do you need glasses?");
			} else {
				_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()-1);
			}
		} else if (buttons == 3) {
			if (l.getLab()[_curPos.getRow()][_curPos.getCol()+1]) {
				w.msg1("Please don't try to step through the walls.");
			} else {
				_curPos = new LabPosition(_curPos.getRow(), _curPos.getCol()+1);
			}
		} else if (buttons == 4){
			w.msg1("Help Screen: \n\n"
					+ "◈ - This is you! You start in the middle of the Labyrinth,\n"
					+ "use the North, South, West, and East buttons to move!\n\n"
					+ "█ - This is the wall, you can't move through it.\n\n"
					+ "░ - This is a space, this is what your character can move on.\n\n"
					+ "◌ - This is a question. If you step on it, you will be asked\n"
					+ "a question. Be careful - answer wrong, and the game restarts!\n\n"
					+ "The exit is at the very bottom of the Labyrinth, so \n"
					+ "follow the path to get there, good luck!");
		} else {
			System.exit(0);
		}
		return _curPos;
	}
	
	public LabPosition getPos() { return _curPos; }
	
	public int getRow() { return _r; }
	public int getCol() { return _c; }
}
