package Lab3;

public abstract class Piece{
    int value;
    boolean isWhite;

    abstract void move();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object Piece);

    public int getValue() {
        return value;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }
}
