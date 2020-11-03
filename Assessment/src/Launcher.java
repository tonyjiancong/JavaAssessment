import java.util.ArrayList;

public class Launcher {
	
	public static void displayTextNotes(NoteStore ref) {
		ArrayList<TextNote> allTextNotes = ref.getAllTextNotes();
		// for loop to get attributes within each arraylist object
		for (int i = 0; i < allTextNotes.size(); i++) {
			System.out.println("Text Note " + (i+1) + " : "  + allTextNotes.get(i).getText());
		}
	}
	
	public static void displayTextAndImageNotes(NoteStore ref) {
		ArrayList<TextAndImageNote> allTextAndImageNotes = ref.getAllTextAndImageNote();
		// for loop to get attributes within each arraylist object
		for (int i = 0; i < allTextAndImageNotes.size(); i++) {
			System.out.println("Text and Image Note " + (i+1) + " : "  + allTextAndImageNotes.get(i).getText()
													+ ", "    + allTextAndImageNotes.get(i).getUrl());
		}
	}

	public static void main(String[] args) {
		
		NoteStore ref = new NoteStore();
		
		// store text notes
		ref.storeNote("Tony is No.1 and a Java guru.");
		ref.storeNote("Shafeeq is No.2 and Tony's best friend.");
		
		// store text and image notes
		ref.storeNote("Tony shopping list", "//image/haha.jpg");
		ref.storeNote("Shafeeq shopping list", "//imgage/lala.jpg");
		
		//display
		displayTextNotes(ref);
		displayTextAndImageNotes(ref);
	}

}
