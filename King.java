package Lab3;

public class King extends Piece {
    public King(){
        this.value = 1000;
    }

    @Override
    void move() {
        System.out.println("One square");
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
