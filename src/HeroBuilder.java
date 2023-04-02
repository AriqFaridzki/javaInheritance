
import java.time.LocalDate;
public class HeroBuilder extends CharacterBuilder{

    LocalDate defaultBirthday = LocalDate.now();
    protected String birthday = defaultBirthday.toString();
    protected String region = "-";
    protected String gender = "Rather Disclosed";
    protected String titles = "-";
    protected String weapon = "-";

    protected int HERO_STAR_RATING = 0;


    public HeroBuilder withBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public HeroBuilder withRegion(String region) {
        this.region = region;
        return this;
    }

    public HeroBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public HeroBuilder withTitles(String titles) {
        this.titles = titles;
        return this;
    }

    public HeroBuilder withWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public HeroBuilder withHERO_STAR_RATING(int HERO_STAR_RATING) {
        this.HERO_STAR_RATING = HERO_STAR_RATING;
        return this;
    }

    public Hero build(){
        return new Hero(name,
                species,
                level,
                weaponTypes,
                weapon,
                hp,
                def,
                atk,
                HERO_STAR_RATING,
                titles,
                region,
                birthday,
                gender
        );
    }
}
