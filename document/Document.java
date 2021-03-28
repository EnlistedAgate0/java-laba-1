package document;

public abstract class Document {
	   private String text;
	   
	   public Document(String text) {
		   super();
		   this.text = text;
	   }

	   public String getText() {
		return text;
	   }

	   public void setText(String text) {
		this.text = text;
	   }

	   @Override
	   public String toString() {
	      return "Document [text=" + text + "]";
	   }
	   
	   public static void main(String[] args) {
		   Extensions extensions = new FormatDoc();
		   extensions.writeCode();
	   }
	 /*  
	   public Memento saveText() {
		   return new Memento(text);
	   }
	   
	   public void restoreText(Memento memento) {
		   this.text = memento.getText();
	   }
	   */
	}

