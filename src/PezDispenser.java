public class PezDispenser {
    // final means you can't change the state once it's been initialised
    public static final int MAX_PEZ = 12;
    private int pezCount;

    // private String characterName = "Yoda";
    final private String characterName;

    // Constructor method - notice the method name is the same as the class name
    public PezDispenser(String characterName) {
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill() {
        pezCount = MAX_PEZ;
    }

    public boolean isEmpty() {
        return pezCount == 0;
    }

    public String getCharacterName() {
        return characterName;
    }

/*
    -- ANOTHER CODING STYLE --
    private String mCharacterName;

    // Constructor method - notice the method name is the same as name class name
    public PezDispenser(String characterName) {
        mCharacterName = characterName;
    }

    public String getCharacterName() {
        return mCharacterName;
    }
*/
}
