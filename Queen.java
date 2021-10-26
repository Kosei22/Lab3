package Lab3;

public class Queen extends Piece{
    public Queen(){
        this.value = 9;
    }

    @Override
    void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString(){
        return "Queen{value=‘" + value + "’}";
    }

    @Override
    public boolean equals(Object Piece) {
        if(isWhite && Piece.equals(value)){
            return true;
        }return false;
    }
}
