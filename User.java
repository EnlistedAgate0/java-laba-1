import java.text.SimpleDateFormat;
import java.util.Date;

import document.Extensions;
import document.FormatDoc;
import memento.CareTaker;
import memento.Memento;

public class User {
	static Extensions originator = new FormatDoc();
	static CareTaker careTaker = new CareTaker();
	static Memento memento = new Memento();
	
	public void setText(String text)
	{
		originator.setText(text);
		
	}
	
	public void printText()
	{
		System.out.println(originator.getText());
	}
	
	
	public void Save()
	{
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
		careTaker.setMemento(originator.createMomento(timeStamp));
	}
	
	public void printHistory()
	{
		for (int i = 0; i < careTaker.getHistory().size(); i++) {
			memento = careTaker.getMemento(i);
	        System.out.println("№" + i + " " + memento.getTime() + ": " +  memento.getText());
	    }
	}
	
	public void getLastSave()
	{
		originator.getDataFromMomento(careTaker.getMemento());
	}
	
	public void getSaveByIndex(int index)
	{
		originator.getDataFromMomento(careTaker.getMemento(index));
	}
	
	public void printMenu()
	{
		System.out.println("Выберите пункт меню");
		System.out.println("1 Ввести текст в документ");
		System.out.println("2 Вывести текст из документа");
		System.out.println("3 Сохранить");
		System.out.println("4 Откатить к прошлому сохранению");
		System.out.println("5 Вывести историю сохранений");
		System.out.println("6 Откатить к сохраенению, по номеру сохранения");
		System.out.println("7 Выход");
	}
}
