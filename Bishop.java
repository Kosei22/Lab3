package Lab3;

public class Bishop extends Piece{
    public Bishop(){
        this.value = 3;
    }

    @Override
    void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString(){
        return "Bishop{value=‘" + value + "’}";
    }

    @Override
    public boolean equals(Object Piece) {
        if(isWhite && Piece.equals(value)){
            return true;
        }return false;
    }
}
