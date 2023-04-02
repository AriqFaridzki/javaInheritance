import java.time.LocalDate;

public class Hero extends Character{

    LocalDate defaultBirthday = LocalDate.now();
    protected String birthday = defaultBirthday.toString();
    protected String region = "-";
    protected String gender = "Rather Disclosed";
    protected String titles = "-";
    protected int HERO_STAR_RATING = 0;

    public Hero(String name,
                String species,
                int level,
                String weaponTypes,
                String weapon,
                int hp,
                int def,
                int atk,
                int HERO_STAR_RATING,
                String titles,
                String region,
                String birthday,
                String gender
                ) {
        super(name, species, level, weaponTypes, weapon, hp, def, atk);
        this.HERO_STAR_RATING = HERO_STAR_RATING;
        this.titles = titles;
        this.region = region;
        this.birthday = birthday;
        this.gender = gender;
    }

    @Override
    public void printStat(){
        super.printStat();
        System.out.println("Weapon Types    : " + this.getWeaponTypes());
        System.out.println("Weapon          : " + this.getWeapon());

        System.out.println("============");

        System.out.println("Titles      : " + this.titles);
        System.out.println("Region      : " + this.region);
        System.out.println("Birthday    : " + this.birthday);
        System.out.println("Gender      : " + this.gender);

        System.out.println("============");
        System.out.println("Hero Star Rating : " + this.HERO_STAR_RATING);
    }

    public void mainSkill(){
        System.out.println("Used Main Skill");
    }

    public void secondarySkill(){
        System.out.println("Used secondary Skill");
    }

    public void thirdSkill(){
        System.out.println("Used third Skill");
    }

}
