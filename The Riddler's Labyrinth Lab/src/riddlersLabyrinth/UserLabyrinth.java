package riddlersLabyrinth;

import javax.swing.*;

public class UserLabyrinth {
	private WindowLabyrinth _w;
	private LabDesign _l;
	private LabPlayer _p;
	private LabQuestion _q1;
	private LabQuestion _q2;
	private LabQuestion _q3;
	private LabQuestion _q4;
	private LabQuestion _q5;
	private LabQuestion _q6;
	private LabString _s;
	public static final String[] BUTTONS = {"North", "South", "West", "East", "Help", "Exit"};
	
	public UserLabyrinth() {
		ImageIcon w = new ImageIcon(getClass().getResource("winscreen.png"));
		_w = new WindowLabyrinth();
		_l = new LabDesign();
		_p = new LabPlayer();
		_q1 = new LabQuestion(_l);
		_q2 = new LabQuestion(_l);
		_q3 = new LabQuestion(_l);
		_q4 = new LabQuestion(_l);
		_q5 = new LabQuestion(_l);
		_q6 = new LabQuestion(_l);
		_s = new LabString();
		
		
		if (checkEqual(_q1.getPos(), _q2.getPos()) || checkEqual(_q1.getPos(), _q3.getPos()) ||
				checkEqual(_q1.getPos(), _q4.getPos()) || checkEqual(_q1.getPos(), _q5.getPos()) ||
				checkEqual(_q1.getPos(), _q6.getPos())) {
			_q1 = new LabQuestion(_l);
		}
		if (checkEqual(_q2.getPos(), _q1.getPos()) || checkEqual(_q2.getPos(), _q3.getPos()) ||
				checkEqual(_q2.getPos(), _q4.getPos()) || checkEqual(_q2.getPos(), _q5.getPos()) ||
				checkEqual(_q2.getPos(), _q6.getPos())) {
			_q2 = new LabQuestion(_l);
		}
		if (checkEqual(_q3.getPos(), _q1.getPos()) || checkEqual(_q3.getPos(), _q2.getPos()) ||
				checkEqual(_q3.getPos(), _q4.getPos()) || checkEqual(_q3.getPos(), _q5.getPos()) ||
				checkEqual(_q3.getPos(), _q6.getPos())) {
			_q3 = new LabQuestion(_l);
		}
		if (checkEqual(_q4.getPos(), _q1.getPos()) || checkEqual(_q4.getPos(), _q2.getPos()) ||
				checkEqual(_q4.getPos(), _q3.getPos()) || checkEqual(_q4.getPos(), _q5.getPos()) ||
				checkEqual(_q4.getPos(), _q6.getPos())) {
			_q4 = new LabQuestion(_l);
		}
		if (checkEqual(_q5.getPos(), _q1.getPos()) || checkEqual(_q5.getPos(), _q2.getPos()) ||
				checkEqual(_q5.getPos(), _q3.getPos()) || checkEqual(_q5.getPos(), _q4.getPos()) ||
				checkEqual(_q5.getPos(), _q6.getPos())) {
			_q5 = new LabQuestion(_l);
		}
		if (checkEqual(_q6.getPos(), _q1.getPos()) || checkEqual(_q6.getPos(), _q2.getPos()) ||
				checkEqual(_q6.getPos(), _q3.getPos()) || checkEqual(_q6.getPos(), _q4.getPos()) ||
				checkEqual(_q6.getPos(), _q5.getPos())) {
			_q5 = new LabQuestion(_l);
		}
		
		_w.msg1("THE RIDDLER'S LABYRINTH\n\n"
				+ "You wake up with no recollection of how you got there.\n"
				+ "You take in your strange surroundings.\n"
				+ "The only opening you see is in front of you, the only difference\n"
				+ "to the other three walls.\n"
				+ "It is your only chance.\n\n"
				+ "Take it."); //intro
		while (!(_p.getPos().getRow() == _l.getEnd().getRow() && 
				_p.getPos().getCol() == _l.getEnd().getCol())) {
			int x = _w.option1(BUTTONS, _s.updateLab(_l, _p, _q1, _q2, _q3, _q4, _q5, _q6));
			_p.move(_l, x, _w);
			askQuestion();
			whispers();
		}
		_w.msg1("As you exit the Labyrinth, sunlight floods your vision.\n\n"
				+ "You can no longer hear the beckoning whispers in the wind.\n\n"
				+ "You've made it.");
		_w.msg(w);
		_w.msg1("Congratulations, you've beat the Riddler.");
		//_w.msg1(_s.updateLab(_l, _p, _q)); labyrinth shell
	}
	public boolean checkEqual(LabPosition x, LabPosition y) {
		if ((x.getRow() == y.getRow()) && (x.getCol() == y.getCol())) {
			return true;
		} else {
			return false;
		}
	}
	
	public void askQuestion() {
		String question;
		String answer;
		if (checkEqual(_p.getPos(), _q1.getPos())) {
			_q1.makeArray();
			question = _q1.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q1.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q2.getPos())) {
			_q2.makeArray();
			question = _q2.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q2.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q3.getPos())) {
			_q3.makeArray();
			question = _q3.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q3.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q4.getPos())) {
			_q4.makeArray();
			question = _q4.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q4.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q5.getPos())) {
			_q5.makeArray();
			question = _q5.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q5.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else if (checkEqual(_p.getPos(), _q6.getPos())) {
			_q6.makeArray();
			question = _q6.getQuestion();
			answer = _w.in(question);
			if (answer.equalsIgnoreCase(_q6.getAnswer(question))) {
				_w.msg1("Correct!");
			} else {
				_w.msg1("Incorrect!");
				new UserLabyrinth();
			}
			
		} else {
			
		}
	}
	
	public void whispers() {
		LabPosition a = new LabPosition(7, 3);
		LabPosition b = new LabPosition(4, 1);
		LabPosition c = new LabPosition(1, 5);
		LabPosition d = new LabPosition(3, 9);
		LabPosition e = new LabPosition(9, 7);
		if (checkEqual(_p.getPos(), a)) {
			_w.msg1("You hear whispers.");
		}
		if (checkEqual(_p.getPos(), b)) {
			_w.msg1("Stay.");
		}
		if (checkEqual(_p.getPos(), c)) {
			_w.msg1("Stay here.");
		}
		if (checkEqual(_p.getPos(), d)) {
			_w.msg1("Why do you want to leave?");
		}
		if (checkEqual(_p.getPos(), e)) {
			_w.msg1(" S t a y . ");
		}
	}
	
}
