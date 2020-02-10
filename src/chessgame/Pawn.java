package chessgame;

public class Pawn extends Piece
{
    
    public Pawn() 
    {
        super();
    }
    
    public Pawn(char clr, boolean mvbl)
    {
        this();
        if(clr == 'w' || clr == 'W')
        {   
            setPieceImage("src/chessgame/image/wp.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
        else //black pawn
        {
            setPieceImage("src/chessgame/image/bp.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
    }
    
}
