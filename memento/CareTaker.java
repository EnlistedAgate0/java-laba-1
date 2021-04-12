package memento;

import java.util.ArrayList;
import java.util.List;


public class CareTaker {
	private List<Memento> history = new ArrayList<Memento>();
	private int Size = 0;
	private int CurrentIndex = -1;
	
//	private class Save {
//		String time;
//		Memento memento;
//		Save(String time, Memento memento){
//			this.time = time;
//			this.memento = memento;
//		}
//	}
	
	public List<Memento> getHistory()
	{
		return history;
	}
	
	public int getSize() {
		return Size;
	}

	public Memento getMemento(int index) {
		if (index < 0 | index > Size-1) {
			return null;
		}
		CurrentIndex = index;
		return history.get(index);
	}

	public Memento getMemento() {
//		if (Size == 0) {
//			return null;
//		}
		if (CurrentIndex >= 0) {
			int index = CurrentIndex;
			CurrentIndex -= 1;
			return history.get(index);
		}
		return null;
	}

	public void setMemento(Memento memento) {
		history.add(memento);
		Size = history.size();
		CurrentIndex = Size -1;
	}
	
	
}
