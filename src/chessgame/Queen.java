package chessgame;

public class Queen extends Piece 
{
    
    /** Creates a new instance of Queen */
    public Queen() 
    {
        super();
    }
    
     public Queen(char clr, boolean mvbl)
    {
        this();
        if(clr == 'w' || clr == 'W')
        {   
            setPieceImage("src/chessgame/image/wq.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
        else //black pawn
        {
            setPieceImage("src/chessgame/image/bq.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
    }
    
}
