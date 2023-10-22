/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;
/**
 *
 * @author DELL
 */
public class MyButton extends JButton{
    public boolean isOver(){
        return over;
    }
    public void setOver(boolean over){
        this.over = over;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
        setBackground(color);
    }
    public Color getColorOver(){
        return colorOver;
    }
    public void setColorOver(Color colorOver){
        this.colorOver = colorOver;
    }
    public Color getColorClick(){
        return colorClick;
    }
    public MyButton(){
        setColor(Color.WHITE);
        colorOver = new Color(92,173,134);
        colorClick = new Color(92,173,134);
        borderColor = new Color(0,0,0);
        setContentAreaFilled(false);
        
    }
    
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius=0;
    
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //paint border
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        //border set 2 pix
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}
