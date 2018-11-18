public class PezDispenser {
    // private String characterName = "Yoda";
    final private String characterName;

    // Constructor method - notice the method name is the same as the class name
    public PezDispenser(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

/*  -- ANOTHER CODING STYLE --
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
