public class Boss extends Character{

    protected String bossType;
    protected String difficulty;
    protected int rarity;

    public Boss(String name,
                String species,
                int level,
                String weaponTypes,
                String weapon,
                int hp,
                int def,
                int atk,
                String boss_type,
                String difficulty,
                int rarity
    ) {
        super(name, species, level, weaponTypes, weapon, hp, def, atk);

        bossType = boss_type;
        this.difficulty = difficulty;
        this.rarity = rarity;
    }

    @Override
    public void printStat() {
        super.printStat();
        System.out.println("===========");
        System.out.println("Boss Type       : " + this.bossType);
        System.out.println("Difficulty      : " + this.difficulty);
        System.out.println("Rarity          : " + this.rarity);
    }

    public void mainSkill(){
        System.out.println("The Boss Used Main Skill !");
    }
}
