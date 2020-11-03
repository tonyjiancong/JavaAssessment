public class TextAndImageNote {
	
	private String text;
	private String urlToImage;
	
	// constructor 
	public TextAndImageNote(String text, String urlToImage) {
		this.text = text;
		this.urlToImage = urlToImage;
	}
	
	public String getText() {
		return this.text;
	}
	
	public String getUrl() {
		return this.urlToImage;
	}

}
