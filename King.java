package Lab3;

public class King extends Piece {

    public King(int value, boolean isWhite){
        super(value,isWhite);
    }

    public King(boolean isWhite){
        super(isWhite);
        super.value = 1000;
    }

    @Override
    void move() {
        System.out.println("One square");
    }

    @Override
    public String toString(){
        return "King{value=‘" + value + "’}";
    }

}
