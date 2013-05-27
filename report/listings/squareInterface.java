public interface Square {
  public int getX() throws StandardError;
  public int getY() throws StandardError;
  public Piece[] getPieces() throws StandardError;
  public String getImage() throws StandardError;
  public boolean isEmpty() throws StandardError;
  public boolean isOccupied() throws StandardError;
}
