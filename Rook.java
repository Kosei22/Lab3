package Lab3;

public class Rook extends Piece{
    public Rook(){
        this.value = 5;
    }

    @Override
    void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString(){
        return "Rook{value=‘" + value + "’}";
    }

    @Override
    public boolean equals(Object Piece) {
        if(isWhite && Piece.equals(value)){
            return true;
        }return false;
    }
}
