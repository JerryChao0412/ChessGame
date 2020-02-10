package chessgame;

public class Bishop extends Piece
{
    
    public Bishop() 
    {
        super();
    }
    
     public Bishop(char clr, boolean mvbl)
    {
        this();
        if(clr == 'w' || clr == 'W')
        {   
            setPieceImage("src/chessgame/image/wb.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
        else //black pawn
        {
            setPieceImage("src/chessgame/image/bb.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
    }
    
}