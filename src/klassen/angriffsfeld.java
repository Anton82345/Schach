package src.klassen;
import java.awt.*;
import javax.swing.ImageIcon;

public class angriffsfeld implements universell
{
    public universell angreifer;
    public angriffsfeld(universell abstammung)
    {
        angreifer = abstammung;
    }



    public String giveID()
    {
        return "angriff";
    }

    public ImageIcon bild()
    {
        String pfad = "lib\\pic\\" + "nichts" + ".png";
        ImageIcon icon = new ImageIcon(pfad); // Pfade zum Bild ersetzen
        Image image = icon.getImage(); // Bild als Image-Objekt erhalten
        Image scaledImage = image.getScaledInstance(70, 70, Image.SCALE_SMOOTH); // Bild skalieren
        return new ImageIcon(scaledImage);
    }

    // Hier nur Platzhalter, damit Code funktioniert
    public Color giveColor()
    {
        return Color.PINK;
    }

    public boolean giveFirst()
    {
        return false;
    }

    public int[] ymoglichesFeld(int[] moglichkeiten, boolean first)
    {
        int[] platzhalter = new int[1]; 
        return platzhalter;
    }

    public int[] xmoglichesFeld(int[] moglichkeiten, boolean first)
    {
        int[] platzhalter = new int[1]; 
        return platzhalter;
    }

    public int[] giveAngriffX()
    {
        int[] platzhalter = new int[1]; 
        return platzhalter;
    }

    public int[] giveAngriffY()
    {
        int[] platzhalter = new int[1]; 
        return platzhalter;
    }
}

