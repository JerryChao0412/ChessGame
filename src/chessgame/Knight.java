package chessgame;

public class Knight extends Piece
{
    
    public Knight() 
    {
        super();
    }
    
     public Knight(char clr, boolean mvbl)
    {
        this();
        if(clr == 'w' || clr == 'W')
        {   
            setPieceImage("src/chessgame/image/wn.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
        else //black pawn
        {
            setPieceImage("src/chessgame/image/bn.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
    }
    
}


