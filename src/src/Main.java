import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static ArrayList<Vokabel> vokabeln = new ArrayList<>();
    public static ArrayList<Vokabel> richtigeVoks = new ArrayList<>();

    private static boolean shouldShuffle = false;

    private static void initVocs() {
        vokabeln.add(new Vokabel("la inmigración", "Immigration", "Einwanderung"));
        vokabeln.add(new Vokabel("la emigración","Emigration", "Auswanderung"));
        vokabeln.add(new Vokabel("la migración", "Migration", "Wanderung"));
        vokabeln.add(new Vokabel("el / la inmigrante", "Einwanderer"));
        vokabeln.add(new Vokabel("el / la enmigrante", "Auswanderer"));
        vokabeln.add(new Vokabel("inmigrar", "einwandern"));
        vokabeln.add(new Vokabel("emigrar", "auswandern"));
        vokabeln.add(new Vokabel("subsahariano", "südlich der Sahara"));
        vokabeln.add(new Vokabel("Marruecos", "Marokko"));
        vokabeln.add(new Vokabel("marroquí, pl. marroquíes", "Marokkaner", "marokkanisch"));
        vokabeln.add(new Vokabel("el país natal", "Geburtsland"));
        vokabeln.add(new Vokabel("el país de origen", "Herkunftsland"));
        vokabeln.add(new Vokabel("la frontera", "Grenze"));
        vokabeln.add(new Vokabel("la fronterizo", "Grenz-"));
        vokabeln.add(new Vokabel("el paraíso", "Paradies"));
        vokabeln.add(new Vokabel("cruzar", "überqueren"));
        vokabeln.add(new Vokabel("atravesar (e>ie)", "durchqueren"));
        vokabeln.add(new Vokabel("el Estrecho de Gibraltar", "Meerenge von Gibraltar"));
        vokabeln.add(new Vokabel("la distancia", "Distanz","Entfernung"));
        vokabeln.add(new Vokabel("saltar", "springen"));
        vokabeln.add(new Vokabel("el salto", "Sprung"));
        vokabeln.add(new Vokabel("saltar una valla", "einen Zaun überspringen"));
        vokabeln.add(new Vokabel("saltar una muro", "eine Mauer überspringen"));
        vokabeln.add(new Vokabel("la valla", "Zaun"));
        vokabeln.add(new Vokabel("la valla fronteriza", "Grenzzaun"));
        vokabeln.add(new Vokabel("la escalera", "Leiter"));
        vokabeln.add(new Vokabel("el espino artifical", "Stacheldraht"));
        vokabeln.add(new Vokabel("llegar a", "ankommen"));
        vokabeln.add(new Vokabel("la llegada", "Ankunft"));
        vokabeln.add(new Vokabel("el barco, el buque", "Schiff"));
        vokabeln.add(new Vokabel("la barca", "Boot"));
        vokabeln.add(new Vokabel("la patera", "kleines Boot", "flaches Boot"));
        vokabeln.add(new Vokabel("el polizón", "blinder Passagier"));
        vokabeln.add(new Vokabel("embarcar", "an Bord gehen"));
        vokabeln.add(new Vokabel("el puerto", "Hafen"));
        vokabeln.add(new Vokabel("la costa", "Küste"));
        vokabeln.add(new Vokabel("legal", "legal"));
        vokabeln.add(new Vokabel("ilegal", "illegal"));
        vokabeln.add(new Vokabel("esconderse", "sich verstecken"));
        vokabeln.add(new Vokabel("marearse", "übel werden", "seekrank werden"));
        vokabeln.add(new Vokabel("la nacionalidad", "Nationalität"));
        vokabeln.add(new Vokabel("el pasaporte", "Pass"));
        vokabeln.add(new Vokabel("los papeles", "Papiere"));
        vokabeln.add(new Vokabel("legalizar, regularizar", "legalisieren", "Aufenthaltserlaubnis"));
        vokabeln.add(new Vokabel("la legalización, la regularización", "Papiere erhalten", "Legalisierung"));
        vokabeln.add(new Vokabel("el visado", "Visum"));
        vokabeln.add(new Vokabel("el asilado", "Asylant"));
        vokabeln.add(new Vokabel("el asilo", "Asyl"));
        vokabeln.add(new Vokabel("detener (e>ie)", "festnehmen"));
        vokabeln.add(new Vokabel("las fuerzas de seguridad", "Sicherheitskräfte"));
        vokabeln.add(new Vokabel("vigilar", "bewachen"));
        vokabeln.add(new Vokabel("la vigilancia", "Bewachung"));
        vokabeln.add(new Vokabel("el objetivo", "Ziel"));
        vokabeln.add(new Vokabel("expulsar", "vertreiben", "ausweisen"));
        vokabeln.add(new Vokabel("la expulsión", "Vertreibung"));
        vokabeln.add(new Vokabel("mandar", "schicken"));
        vokabeln.add(new Vokabel("volver (o>ue)","zurückkehren"));
        vokabeln.add(new Vokabel("regresar", "zurückkehren"));
        vokabeln.add(new Vokabel("el regreso", "Rückkehr"));
        vokabeln.add(new Vokabel("despedirse (e>i)", "sich verabschieden"));
        vokabeln.add(new Vokabel("el hambre", "Hunger"));
        vokabeln.add(new Vokabel("la guerra", "Krieg"));
        vokabeln.add(new Vokabel("la guerra civil","Bürgerkrieg"));
        vokabeln.add(new Vokabel("perseguir (e>i)", "verfolgen"));
        vokabeln.add(new Vokabel("a persecución", "Verfolgung"));
        vokabeln.add(new Vokabel("huir (>yo huyo)", "flüchten"));
        vokabeln.add(new Vokabel("la huida", "Flucht"));
        vokabeln.add(new Vokabel("el fugitivo, el refugiado", "Flüchtling"));
        vokabeln.add(new Vokabel("el trabajo", "Arbeit"));
        vokabeln.add(new Vokabel("soñar con", "träumen von"));
        vokabeln.add(new Vokabel("el sueño", "Traum"));
        vokabeln.add(new Vokabel("la razón, pl. las razones", "Grund", "Begründung"));
        vokabeln.add(new Vokabel("el motivo", "Grund", "Motiv"));
        vokabeln.add(new Vokabel("la aventura mortal", "tödliches Abenteuer"));
        vokabeln.add(new Vokabel("el riesgo", "Risiko"));
        vokabeln.add(new Vokabel("arriesgado", "riskant"));
        vokabeln.add(new Vokabel("arriesgar", "riskieren"));
        vokabeln.add(new Vokabel("rescatar a alguien", "jemanden retten"));
        vokabeln.add(new Vokabel("la integración", "Integration"));
        vokabeln.add(new Vokabel("intergrarse", "sich integrieren"));
        vokabeln.add(new Vokabel("adaptarse", "sich anpassen"));
        vokabeln.add(new Vokabel("la adaptación", "Anpassung"));
        vokabeln.add(new Vokabel("la actitud respecto a...", "Haltung gegenüber..."));
        vokabeln.add(new Vokabel("aceptar", "akzeptieren"));
        vokabeln.add(new Vokabel("la aceptancia", "Akzeptanz"));
        vokabeln.add(new Vokabel("tolerar", "tolerieren"));
        vokabeln.add(new Vokabel("la tolerancia", "Toleranz"));
        vokabeln.add(new Vokabel("el respeto", "Respekt"));
        vokabeln.add(new Vokabel("respetar", "respektieren"));
        vokabeln.add(new Vokabel("el racismo", "Rassismus"));
        vokabeln.add(new Vokabel("racista", "rassistisch"));
        vokabeln.add(new Vokabel("paralizar", "lähmen"));
        vokabeln.add(new Vokabel("la desesperanza", "Verzweiflung"));
        vokabeln.add(new Vokabel("el camarero", "Kellner"));
        vokabeln.add(new Vokabel("los derechos humanos", "Menschenrechte"));
        vokabeln.add(new Vokabel("hundirse", "untergehen"));
    }

    public static void main(String[] args) {
        initVocs();

        System.out.println("Shuffle? [Y:N]");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equalsIgnoreCase("y"))
            shouldShuffle = true;

        if(shouldShuffle)
            Collections.shuffle(vokabeln);

        while(richtigeVoks.size() != vokabeln.size()) {
            for (Vokabel vokabel : vokabeln) {
                if(!richtigeVoks.contains(vokabel)) {
                    if(fragAb(vokabel)) {
                        richtigeVoks.add(vokabel);
                        System.out.println("Richtig!");
                    } else {
                        System.out.println("Falsch! Die Richtige Antwort ist:" + vokabel.getU());
                    }
                }
            }
        }
    }

    private static boolean fragAb(Vokabel voc) {
        System.out.println("Die Übersetzung für " + voc.getF() + ":");
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        if(line.equalsIgnoreCase(voc.getU()) || line.equalsIgnoreCase(voc.getA())) {
            return true;
        } else {
            return false;
        }
    }

}