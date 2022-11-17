import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static ArrayList<Vokabel> vokabeln = new ArrayList<>();
    public static ArrayList<Vokabel> richtigeVoks = new ArrayList<>();

    private static boolean shouldShuffle = false;
    private static boolean shouldTranslationToVocab = false;

    private static void initVocs() {
        vokabeln.add(new Vokabel("la oportunidad", "Möglichkeit"));
        vokabeln.add(new Vokabel("integrarse", "sich integrieren"));
        vokabeln.add(new Vokabel("el racismo", "Rassismus"));
        vokabeln.add(new Vokabel("racista", "rassistisch"));
        vokabeln.add(new Vokabel("el prejuicio", "Vorurteil"));
        vokabeln.add(new Vokabel("la discriminación", "Diskriminierung"));
        vokabeln.add(new Vokabel("tener origenes sudaméricanos", "Südamerikanischen Migrationshintergrund haben"));
        vokabeln.add(new Vokabel("las personas de otra etnia o religion", "Personen anderer Ethnien oder Religion"));
        vokabeln.add(new Vokabel("la cercanía cultural o lingúistica", "Die kulturellen oder sprachlichen Gemeinsamkeiten"));
        vokabeln.add(new Vokabel("atraer", "anziehen"));
        vokabeln.add(new Vokabel("el clima", "das Klima"));
        vokabeln.add(new Vokabel("el modo de vida", "Lebensweise"));
        vokabeln.add(new Vokabel("un tercio", "ein Drittel"));
        vokabeln.add(new Vokabel("La mitad", "die Hälfte"));
        vokabeln.add(new Vokabel("La mayoría", "die Mehrheit"));
        vokabeln.add(new Vokabel("la minoría", "die Minderheit"));
        vokabeln.add(new Vokabel("quitar el empleo", "die Arbeit wegnehmen"));
        vokabeln.add(new Vokabel("el estereotipo", "Stereotyp"));
        vokabeln.add(new Vokabel("bien/mal integrado", "gut/schlecht integriert"));
        vokabeln.add(new Vokabel("la dicersidad", "die Vielfalt"));
        vokabeln.add(new Vokabel("blanco", "weiß"));
        vokabeln.add(new Vokabel("católico", "katholisch"));
        vokabeln.add(new Vokabel("bajito", "klein"));
        vokabeln.add(new Vokabel("lo diferente", "das Andere"));
        vokabeln.add(new Vokabel("estar habituado a", "gewöhnt sein an"));
        vokabeln.add(new Vokabel("incorporarse al mundo laboral", "sich in die Arbeitswelt eingliedern"));
        vokabeln.add(new Vokabel("me cuesta + inf", "mir fällt es schwer + inf"));
        vokabeln.add(new Vokabel("sentirse distinta", "sich anders fühlen"));
        vokabeln.add(new Vokabel("sentirse aceptada", "sich angenommen fühlen"));
        vokabeln.add(new Vokabel("estudiar música y filosofía", "Musik und Philosophie studieren"));
        vokabeln.add(new Vokabel("me gustaría ser abogada", "Ich würde gerne Rechtsanwältin sein"));
        vokabeln.add(new Vokabel("quiero sentirme como una/uno más", "ich möchte mich wie einer mehr fühlen"));
        vokabeln.add(new Vokabel("Pero de dónde eres?", "Woher kommst du?"));
        vokabeln.add(new Vokabel("español con asterísco", "Spanier mit Sternchen"));
        vokabeln.add(new Vokabel("llevar un velo", "ein Kopftuch tragen"));
        vokabeln.add(new Vokabel("Me parece raro/divertido/increible/triste", "Ich finde es komisch/lustig/großartig/traurig"));
        vokabeln.add(new Vokabel("deportivo/a", "sportlich"));
        vokabeln.add(new Vokabel("criminal", "kriminell"));
        vokabeln.add(new Vokabel("ilegal", "illegal"));
        vokabeln.add(new Vokabel("no habla español", "spricht kein Spanisch"));
        vokabeln.add(new Vokabel("pobre", "arm"));
        vokabeln.add(new Vokabel("tiene acento", "hat einen Akzent"));
        vokabeln.add(new Vokabel("musulmán/a", "muslimisch"));
        vokabeln.add(new Vokabel("considerarse racista", "sich als Rassist wahrnehmen"));
        vokabeln.add(new Vokabel("ser víctima de discriminación", "Opfer von Diskimination sein"));
        vokabeln.add(new Vokabel("la encuesta", "Die Umfrage"));
        vokabeln.add(new Vokabel("tener orígenes latinoamericanos/africanos/chinos", "Lateinamerikanische/afrikanische/chinesische Wurzeln haben"));
        vokabeln.add(new Vokabel("la broma", "Witz"));
        vokabeln.add(new Vokabel("parece inofensivo", "es scheint harmlos"));
        vokabeln.add(new Vokabel("aumentar la criminalidad", "die Kriminalitätsrate heben"));
        vokabeln.add(new Vokabel("estar sobrecualificado/a", "überqualifiziert sein"));
        vokabeln.add(new Vokabel("tener bachillerato", "Abitur haben"));
        vokabeln.add(new Vokabel("el salario", "das Gehalt"));
        vokabeln.add(new Vokabel("estar en paro", "arbeitslos sein"));
        vokabeln.add(new Vokabel("los delitos cometidos", "die verübten Kriminaltaten"));
        vokabeln.add(new Vokabel("el agradecimiento", "Dankbarkeit"));
        vokabeln.add(new Vokabel("gracias", "Danke"));
        vokabeln.add(new Vokabel("sentirse a salvo", "sich gerettet fühlen"));
        vokabeln.add(new Vokabel("acoger", "aufnehmen"));
        vokabeln.add(new Vokabel("una cultura de acogida", "Willkommenskultur"));
        vokabeln.add(new Vokabel("estoy agradecida por", "dankbar sein für"));
        vokabeln.add(new Vokabel("comenzar una vida normal", "Ein normales Leben beginnen"));
        vokabeln.add(new Vokabel("hay injusticias", "Es gibt Unrecht"));
        vokabeln.add(new Vokabel("el esfuerzo", "Die Bemühung"));
        vokabeln.add(new Vokabel("alcanzar algo", "Etwas erreichen"));
        vokabeln.add(new Vokabel("recuperar mi vida", "Mein Leben zurückverlangen"));
        vokabeln.add(new Vokabel("sentirse español/a", "Sich als Spanier/in fühlen"));
        vokabeln.add(new Vokabel("Ser parte de...", "Teil sein von..."));
    }

    public static void main(String[] args) {
        initVocs();

        System.out.println("Shuffle? [Y:N]");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equalsIgnoreCase("y"))
            shouldShuffle = true;

        System.out.println("Foreign Language to native Language? [Y:N]");
        if(scanner.nextLine().equalsIgnoreCase("y"))
            shouldTranslationToVocab = true;

        if(shouldShuffle)
            Collections.shuffle(vokabeln);

        while(richtigeVoks.size() != vokabeln.size()) {
            for (Vokabel vokabel : vokabeln) {
                if(!richtigeVoks.contains(vokabel)) {
                    if(fragAb(vokabel, shouldTranslationToVocab)) {
                        richtigeVoks.add(vokabel);
                        System.out.println("Richtig!");
                    } else {
                        if(shouldTranslationToVocab) {
                            System.out.println("Falsch! Die richtige Antwort ist: " + vokabel.getF());
                        } else {
                            System.out.println("Falsch! Die Richtige Antwort ist:" + vokabel.getU());
                        }
                    }
                }
            }
        }
    }

    private static boolean fragAb(Vokabel voc, boolean swap) {
        if (swap) {
            System.out.println("Die Übersetzung für " + voc.getU() + ":");
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            if(line.equalsIgnoreCase(voc.getF())) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Die Übersetzung für " + voc.getF() + ":");
            Scanner input = new Scanner(System.in);
            String line = input.nextLine();
            if (line.equalsIgnoreCase(voc.getU()) || line.equalsIgnoreCase(voc.getA())) {
                return true;
            } else {
                return false;
            }
        }
    }
}