package Lab3;

import sun.security.pkcs11.P11TlsKeyMaterialGenerator;

public class Pawn extends Piece {
    public boolean promoted;
    public Piece newPiece;

    public Pawn(){
        this.value = 1;
    }

    @Override
    void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString(){
        return "Pawn{value=‘" + value + "’}";
    }

    @Override
    public boolean equals(Object Piece){
        if(Piece.equals(promoted)){
            return false;
        }else if(value == newPiece.value){
            return false;
        }
        return true;
    }

    public void promote(Piece newPiece){
        if (promoted){
            value = newPiece.value;
        }
    }
}

