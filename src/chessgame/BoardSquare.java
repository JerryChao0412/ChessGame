package chessgame;

import java.awt.*;
import javax.swing.*;

public class BoardSquare extends JPanel
{
    public BoardSquare() 
    {
        super();
    }
    
    public BoardSquare(String name)
    {
        this();
        setName(name);
    }
    
    public void setSquareName(String name)
    {
        setName(name);
    }
    
     public void addPiece(Piece p)
    {
        add(p);
        paintAll(getGraphics());
    }
    
    public void removePiece()
    {
        if(getComponentCount() > 0)
        {
            remove(0);
            paintAll(getGraphics());
        }
    }
    
    public void setSquareColor(Color c)
    {
        setBackground(c);
        paintAll(getGraphics());
    }
    
    public boolean isEmpty()
    {
        if(getComponentCount() == 0)
            return true;
        else
            return false;
    }
    
    public int getNumOfComponents()
    {
        return getComponentCount();
    }
    
    public Piece getPieceOnSquare()
    {
        if(getComponentCount() > 0)
            return (Piece)getComponent(0);
        else 
            return null;
    }
}
