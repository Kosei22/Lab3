package Lab3;

public class Bishop extends Piece{

    public Bishop(int value, boolean isWhite){
        super(value,isWhite);
    }

    public Bishop(boolean isWhite){
        super(isWhite);
        super.value = 3;
    }

    @Override
    void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString(){
        return "Bishop{value=‘" + value + "’}";
    }

}
