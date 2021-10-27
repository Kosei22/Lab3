package Lab3;

public class Queen extends Piece{

    public Queen(int value, boolean isWhite){
        super(value,isWhite);
    }

    public Queen(boolean isWhite){
        super(isWhite);
        super.value = 9;
    }

    @Override
    void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString(){
        return "Queen{value=‘" + value + "’}";
    }

}
