package chessgame;

import java.awt.*;
import javax.swing.*;

public class Board extends JPanel {
    
    protected static BoardSquare[][] squares;

    /** Creates a new instance of Board */
    public Board() {
        setSize(800, 700);
        setLayout(new GridLayout(8, 8));
        squares = new BoardSquare[8][8];
        createSquares();
        createPiece();
    }

 

    private void createSquares() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                BoardSquare panel = new BoardSquare("" + i + "" + j);
                
                panel.setSquareColor(getColor(i, j));
                panel.addMouseListener(new Action());
                add(panel);
                squares[i][j] = panel;
            }
        }
    }
    
        // add pawn piece
    private void createPiece() {
        for (int i = 0; i < 8; i++) {
            Piece w = new Pawn('w',true);
            w.addMouseListener(new Action());
            squares[1][i].addPiece(w);

            Piece p = new Pawn('b', true);

            p.addMouseListener(new Action());// movable pawns

            squares[6][i].addPiece(p);

        }

        // add castles
        Piece w10 = new Rook('w',true);
        w10.addMouseListener(new Action());
        squares[0][7].addPiece(w10);

        Piece b1 = new Rook('b', true);
        b1.addMouseListener(new Action());
        squares[7][7].addPiece(b1);
        
        Piece w1 = new Rook('w',true);
        w1.addMouseListener(new Action());
        squares[0][0].addPiece(w1);

        Piece p2 = new Rook('b', true);
        p2.addMouseListener(new Action());
        squares[7][0].addPiece(p2);

        // add horses
        
        Piece w2 = new Knight('w',true);
        w2.addMouseListener(new Action());
        squares[0][6].addPiece(w2);

        Piece p3 = new Knight('b', true);
        p3.addMouseListener(new Action());
        squares[7][6].addPiece(p3);
        
        Piece w3 = new Knight('w',true);
        squares[0][1].addPiece(w3);
        w3.addMouseListener(new Action());

        Piece p4 = new Knight('b', true);
        p4.addMouseListener(new Action());
        squares[7][1].addPiece(p4);

        // add Bishops
        Piece w4 = new Bishop('w',true);
        w4.addMouseListener(new Action());
        squares[0][5].addPiece(w4);

        Piece p5 = new Bishop('b', true);
        p5.addMouseListener(new Action());
        squares[7][5].addPiece(p5);
        
        Piece w6 = new Bishop('w',true);
        w6.addMouseListener(new Action());
        squares[0][2].addPiece(w6);
        
        Piece p6 = new Bishop('b', true);
        p6.addMouseListener(new Action());
        squares[7][2].addPiece(p6);

        // add queen
        Piece w7 = new Queen('w',true);
        w7.addMouseListener(new Action());
        squares[0][4].addPiece(w7);
        
        Piece p7 = new Queen('b', true);
        p7.addMouseListener(new Action());
        squares[7][4].addPiece(p7);

        // add king
        
        Piece w8 = new King('w',true);
        w8.addMouseListener(new Action());
        squares[0][3].addPiece(w8);

        Piece p8 = new King('b', true);
        p8.addMouseListener(new Action());
        squares[7][3].addPiece(p8);

      
    }

    private Color getColor(int x, int y) {
        if ((x + y) % 2 == 0)
            return Color.WHITE;
        else
            return Color.GRAY;
    }

    

}
