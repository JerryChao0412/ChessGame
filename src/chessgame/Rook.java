package chessgame;

public class Rook extends Piece 
{
    
    public Rook()
    {
        super();
    }
    
     public Rook(char clr, boolean mvbl)
    {
        this();
        if(clr == 'w' || clr == 'W')
        {   
            setPieceImage("src/chessgame/image/wr.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
        else //black pawn
        {
            setPieceImage("src/chessgame/image/br.png");
            setMovable(mvbl);
            setPieceColor(clr);
        }
    }
    
}

