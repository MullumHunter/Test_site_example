package Test_site_example.PATTERNS.singleton;

public class Settings {
    private static Settings settings;
    private String stringForSave;
    private Settings() {}

    public static Settings getSettings() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }
    public void save(Program program){
        stringForSave = program.getString();
    }
    public String getSave(){
        return stringForSave;
    }
}
