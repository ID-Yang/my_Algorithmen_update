import javax.swing.*;

import java.applet.*;
import java.awt.*;
import java.util.*;


public class Maze1 extends Applet{
private static final long serialVersionUID=1L;
private class Field extends Jpanel{
    private static final long serialVersionUID=1L;
    Point p;
    int x,y;

    public Field(int x, int y){
        this.x=x;
        this.y=y;
        p=getLocation();
}
public void paint (Graphics g){
GradientPaint wallPaint=new GradientPaint(10,50, Color.DARK_GRAY, getWidth(),0,Color.DARK_GRAY);
GradientPaint floorPaint=new GradientPaint(10,50,Color.WHITE,getWidth(),0,Color.WHITE);
GradientPaint pathPaint=new GradientPaint(15,0,Color.GREEN,getWidth(),0, Color.LIGHT_GRAY);
GradientPaint positionPaint=new GradientPaint(15,0,Color.RED,getWidth(),0, Color.LIGHT_GRAY);

super.Paint(g);
((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

}
}