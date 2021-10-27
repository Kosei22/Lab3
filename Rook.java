package Lab3;

public class Rook extends Piece{

    public Rook(int value, boolean isWhite){
        super(value,isWhite);
    }

    public Rook(boolean isWhite){
        super(isWhite);
        super.value = 5;
    }

    @Override
    void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString(){
        return "Rook{value=‘" + value + "’}";
    }

}
