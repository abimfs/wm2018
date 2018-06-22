import java.util.ArrayList; 
/**
 * Beschreiben Sie hier die Klasse WM2018.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class WM2018
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private ArrayList<Lander> landerTeilnehmer;

    /**
     * Konstruktor für Objekte der Klasse WM2018
     */
    public WM2018()
    {
        landerTeilnehmer= new ArrayList<Lander>();
    }

    public void landerhinfugen(Lander Lander)
    {
       landerTeilnehmer.add(Lander);
    }
}
