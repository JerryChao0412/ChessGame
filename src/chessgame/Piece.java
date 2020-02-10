package chessgame;
import javax.swing.*;

public class Piece extends JLabel
{  
    private boolean movable; //is piece movable by mouse
    private char color; // piece color w or b
    private int x; //x coordinate of 2D array
    private int y; //y coord of 2D array
    
    public Piece() 
    {
        movable = false;
        color = 'n';
        x = -1;
        y = -1;
    }
    
    public Piece(String image_file)
    {
        super(new ImageIcon(image_file));
        setName(image_file);
        movable = false;
        resetXY();
    }
    
    public Piece(String image_file, boolean m)
    {
        super(new ImageIcon(image_file));
        setName(image_file);
        movable = m;
        resetXY();
    }
    
    public Piece(String image_file, boolean m, char c)
    {
        this(image_file,m);
        color = c;
        movable = m;
        resetXY();
    }
    
    public void resetXY()
    {
        x = -1;
        y = -1;
    }
    
    public void setPieceImage(String image_file)
    {
        setIcon(new ImageIcon(image_file));
        setName(image_file);
    }
    
    public void setMovable(boolean m)
    {
        movable = m;
    }
    
    public void setPieceColor(char c)
    {
        color = c;
    }
    
    public boolean getIfMovable()
    {
        return movable;
    }
    
    public char getPieceColor()
    {
        return color;
    }
    
    public int getXlocation()
    {
        return x;
    }
    
    public int getYlocation()
    {
        return y;
    }
    
    public void locatePieceXY()
    {
        String temp = getParent().getName(); // this will return somting like 01 so location is [0,1]
        x = new Integer(temp.charAt(0));
        y = new Integer(temp.charAt(1));
    }
}


