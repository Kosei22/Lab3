package Lab3;

public class Knight extends Piece {

    public Knight(int value, boolean isWhite){
        super(value,isWhite);
    }

    public Knight(boolean isWhite){
        super(isWhite);
        super.value = 2;
    }


    @Override
    void move(){
        System.out.println("Like an L");
    }
    @Override
    public String toString(){
        return "King{value=‘" + value + "’}";
    }

}
