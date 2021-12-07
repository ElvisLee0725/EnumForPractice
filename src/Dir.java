public enum Dir {
    NORTH(-1, 0),
    SOUTH(1, 0),
    EAST(0, -1),
    WEST(0, 1);

    int deltaX;
    int deltaY;

    Dir(int x, int y) {
        this.deltaX = x;
        this.deltaY = y;
    }

    public int moveX(int x) {
        return x + this.deltaX;
    }

    public int moveY(int y) {
        return y + this.deltaY;
    }
}
