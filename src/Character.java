public class Character {
    private String name, species, weaponTypes, weapon , desc;
    private Integer level, healthPoints, defensePoints, attackPoints;


    public Character(String name,
                     String species,
                     int level,
                     String weaponTypes,
                     String weapon,
                     int hp,
                     int def,
                     int atk){
        this.name = name;
        this.species = species;
        this.level= level;
        this.weaponTypes= weaponTypes;
        this.weapon= weapon;
        this.healthPoints= hp;
        this.defensePoints= def;
        this.attackPoints= atk;
    }

    public void printStat(){
        System.out.println("Name            : " + this.name);
        System.out.println("Species         : " + this.species);
        System.out.println("Level           : " + this.level);
        System.out.println(" ========== ");
        System.out.println("Heath Points    : " + this.healthPoints);
        System.out.println("Defense Points  : " + this.defensePoints);
        System.out.println("Attack Points   : " + this.attackPoints);


    }
    public String getName(){
        return this.name;
    }

    public String getSpecies() {
        return species;
    }

    public int getLevel(){
        return this.level;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getWeaponTypes(){
        return this.weaponTypes;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public int getDefensePoints(){
        return this.defensePoints;
    }

    public int getAttackPoints(){
        return this.attackPoints;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeaponTypes(String weaponTypes) {
        this.weaponTypes = weaponTypes;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setHealthPoints(Integer healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setDefensePoints(Integer defensePoints) {
        this.defensePoints = defensePoints;
    }

    public void setAttackPoints(Integer attackPoints) {
        this.attackPoints = attackPoints;
    }

    public String getDesc(){
        return this.desc;
    }

    public int rest(){
        return healthPoints += 10;
    }

    public void eat(){
        healthPoints += 5;
    }

    public void attack(){
        System.out.println("you attack him for : " + this.attackPoints+ " Points");
    }

    public void block(){
        System.out.println("you are blocking damage.");
    }
}
