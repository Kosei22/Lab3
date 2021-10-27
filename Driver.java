package Lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Piece pawn = new Pawn(true);
        Piece knight = new Knight(true);
        Piece bishop = new Bishop(true);
        Piece rook = new Rook(true);
        Piece queen = new Queen(true);
        Piece king = new King(true);

        ArrayList<Piece> Pieces = new ArrayList<>(Arrays.asList(pawn, knight, bishop, rook, queen, king));

        for(int i = 0; i < Pieces.size(); i ++){
            Pieces.get(i).move();
        }

        Pawn p1 = new Pawn(1, true, true, new Queen(true));
        Pawn p2 = new Pawn(1, true, false, null);
        Pawn p3 = new Pawn(1, false, false, null);
        Pawn p4 = new Pawn(1, false, true, new Queen(true));
        Pawn p5 = new Pawn(1, true, true, new King(true));

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));

    }
}

