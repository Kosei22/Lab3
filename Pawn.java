package Lab3;

import java.util.Objects;

public class Pawn extends Piece {
    public boolean promoted;
    public Piece newPiece;

    public Pawn(int value, boolean isWhite, boolean promoted, Piece newPiece){
        super(value, isWhite);
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public Pawn(boolean isWhite){
        super(isWhite);
        super.value = 1;
    }

    @Override
    void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString(){
        return "Pawn{value=‘" + value + "’}";
    }

    public void promote(Piece newPiece){
        if (promoted){
            value = newPiece.value;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pawn pawn = (Pawn) o;
        return promoted == pawn.promoted && Objects.equals(newPiece, pawn.newPiece);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promoted, newPiece);
    }
}

