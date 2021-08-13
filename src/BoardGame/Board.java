package BoardGame;

public class Board {
	private int linha;
	private int coluna;
	
	
	public int getLinha() {
		return linha;
	}
	public void setLinha(int linha) {
		this.linha = linha;
	}
	public int getColuna() {
		return coluna;
	}
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	public Piece piece(int linha, int coluna) {	
		return null;
	}
	public Piece piece(Position position) {
		return null;
	}
	
	
	
	public void placePiece(Piece piece, Position position) {
	}
	
	public Piece removePiece(Position position) {
		return null;
	}
	
	public boolean positionExists(Position position) {
		return null != null;
	}
	
	public boolean thereIsAPiece(Position position) {
		return null != null;
	}
	
}

