package Lab3;

public abstract class Piece{
    int value;
    boolean isWhite;

    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }

    public Piece(boolean isWhite) {}

    abstract void move();

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Piece that = (Piece) o;
        if(this.value == that.value && that.isWhite && this.isWhite){
            return true;
        }
        return false;
    }
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
