package chessgame;

import java.awt.event.*;

public class Action extends MouseAdapter
{
   private static int numOfClicks;
   private static String pieceName;
   private static BoardSquare pieceOrigin;
   private static BoardSquare pieceNew;
    
    
    public Action() 
    {
        reset();
    }

    public void mouseClicked(MouseEvent e) 
    {
        if(e.getSource() instanceof BoardSquare)
        {
            boardClicked(e);
        }
        else if(e.getSource() instanceof Piece)
        {
            pieceClicked(e);
        }
    }
    
    private void boardClicked(MouseEvent boardEvent)
    {
        if((pieceName != null) && (numOfClicks == 1))
        {
            pieceNew = (BoardSquare)boardEvent.getComponent();
            pieceOrigin.removePiece();
            pieceNew.removePiece();
            Piece p = new Piece(pieceName,true);
            p.addMouseListener(this);
            pieceNew.addPiece(p);
            reset();
        }       
    }
    
    private void pieceClicked(MouseEvent pieceEvent)
    { 
        Piece temp = (Piece)pieceEvent.getComponent();
        if((pieceName == null) && temp.getIfMovable() && (numOfClicks == 0)) 
        {
            pieceName= temp.getName();
            pieceOrigin = (BoardSquare)temp.getParent();
            numOfClicks = 1;
        }
        else if((pieceName != null) && (numOfClicks == 1)) {
            pieceNew = (BoardSquare)temp.getParent();
            pieceOrigin.removePiece();
            pieceNew.removePiece();
            Piece p = new Piece(pieceName,true);
            p.addMouseListener(this);
            pieceNew.addPiece(p);
            reset();
        }
    }
    
    private void reset()
    {
        numOfClicks = 0;
        pieceNew = null;
        pieceOrigin = null;
        pieceName = null;  
    }
}