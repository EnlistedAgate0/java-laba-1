package memento;

import java.util.ArrayList;
import java.util.List;


class CareTaker {
	private List<Save> history = new ArrayList<Save>();
	private int Size = 0;
	private int CurrentIndex = 0;
	
	private class Save {
		String time;
		Memento memento;
		Save(String time, Memento memento){
			this.time = time;
			this.memento = memento;
		}
	}
	
	public List<Save> getHistory()
	{
		return history;
	}
	
	public Save getSave(int index) {
		if (index < 0 | index > Size) {
			return null;
		}
		return history.get(index);
	}

	public Save getSave() {
		if (Size == 0) {
			return null;
		}
		if (CurrentIndex - 1 >= 0) {
			CurrentIndex -= 1;
			return history.get(CurrentIndex);
		}
		return history.get(Size);
	}

	public void setSave(String time, Memento memento) {
		history.add(new Save(time, memento));
		Size = history.size();
		CurrentIndex = Size;
	}
	
	
}

class Originator {
	String text;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	Memento createMomento() {
		return new Memento(text);
	}
	
	void getDataFromMomento(Memento memento) {
		this.text = memento.getText();
	}
}

class Memento{
	String text;
	
	public Memento(String text) {
		this.text = text;
	}
	public String getText() {
		return text;
	}
}