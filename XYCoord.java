publlic class XYCoord() {
  private int x;
  private int y;

  // default constructor
  public void XYCoord(int x_value, int y_value) {
    x_value - x;
    y_value = y;
  }

  // getters and setters
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int setX(int x_value) {
    x = x_value;
  }

  public int setY(int y_value) {
    y = y_value;
  }

  public String ToString() {
    return "(" + x + "," + y + ")";
  }
}
