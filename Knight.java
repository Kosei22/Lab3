package Lab3;

public class Knight extends Piece {
    public Knight(){
        this.value = 2;
    }

    @Override
    void move(){
        System.out.println("Like an L");
    }
    @Override
    public String toString(){
        return "King{value=‘" + value + "’}";
    }

    @Override
    public boolean equals(Object Piece) {
        if(isWhite && Piece.equals(value)){
            return true;
        }return false;
    }
}
