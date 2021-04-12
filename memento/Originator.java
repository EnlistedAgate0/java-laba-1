package memento;

public class Originator {
	String text;
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public Memento createMomento(String time) {
		return new Memento(time, text);
	}
	
	public void getDataFromMomento(Memento memento) {
		this.text = memento.getText();
	}
}
