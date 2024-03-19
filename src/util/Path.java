package util;

public enum Path {

	ENTRADA("C:\\Users\\source.txt"),
	SAIDA("C:\\Users\\out.txt");
	String path;
	
	private Path(String path) {
		this.path = path;
	}
	public String getPath() {
		return path;
	}
	
}
