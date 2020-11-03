import java.util.ArrayList;

public class NoteStore {
	
	public ArrayList<TextNote> textNoteArray = new ArrayList<TextNote>();
	public ArrayList<TextAndImageNote> textAndImageArray = new ArrayList<TextAndImageNote>();
	
	public void storeNote(String message) {
		TextNote textNote = new TextNote(message);
		textNoteArray.add(textNote);
	}
	
	public void storeNote(String message, String url) {
		TextAndImageNote textAndImageNote = new TextAndImageNote(message, url);
		textAndImageArray.add(textAndImageNote);
	}
	
	public ArrayList<TextNote> getAllTextNotes() {
		return textNoteArray;
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNote() {
		return textAndImageArray;
	}

}
