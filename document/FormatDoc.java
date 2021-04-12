package document;

import memento.Memento;

public class FormatDoc implements Extensions {
	
	String text;
	
	@Override
	public String getText() {
		return text;
	}
	
	@Override
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public Memento createMomento(String time) {
		return new Memento(time, text);
	}
	
	@Override
	public void getDataFromMomento(Memento memento) {
		this.text = memento.getText();
	}
	
	@Override
	public void writeCode() {
		System.out.println("Document in .doc format.");
		
	}
   
}
