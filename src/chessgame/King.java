package chessgame;

public class King extends Piece
{
    
    public King() 
    {
        super();
    }
    
     public King(char clr, boolean mvbl)
    {
        this();
        if(clr == 'w' || clr == 'W')
        {   
            setPieceImage("src/chessgame/image/wk.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
        else //black pawn
        {
            setPieceImage("src/chessgame/image/bk.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
    }
    
}


