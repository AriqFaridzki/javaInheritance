public class CharacterBuilder {
    protected String name = "Unnamed";
    protected String species = "-";
    protected int level = 1;
    protected String weaponTypes = "-";
    protected int hp = 100;
    protected int def = 50;
    protected int atk = 20;
    protected String weapon = " - ";

    public CharacterBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CharacterBuilder withSpecies(String species) {
        this.species = species;
        return this;
    }

    public CharacterBuilder withLevel(int level) {
        this.level = level;
        return this;
    }

    public CharacterBuilder withHp(int hp) {
        this.hp = hp;
        return this;
    }

    public CharacterBuilder withDef(int def) {
        this.def = def;
        return this;
    }

    public CharacterBuilder withAtk(int atk) {
        this.atk = atk;
        return this;
    }
    public CharacterBuilder withWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public CharacterBuilder withWeaponTypes(String weaponTypes) {
        this.weaponTypes = weaponTypes;
        return this;
    }


}
