package util;

public enum Path {

	ENTRADA("C:\\Users\\Cristiano\\Documents\\source.txt"),
	SAIDA("C:\\Users\\Cristiano\\Documents\\out.txt");
	String path;
	private Path(String path) {
		this.path = path;
	}
	public String getPath() {
		return path;
	}
	
}
