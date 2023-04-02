public class BossBuilder extends CharacterBuilder {
    protected String bossType;
    protected String difficulty;
    protected int rarity;

    public BossBuilder withBossType(String bossType) {
        this.bossType = bossType;
        return this;
    }

    public BossBuilder withDifficulty(String difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    public BossBuilder withRarity(int rarity) {
        this.rarity = rarity;
        return this;
    }

    public Boss build(){
        return new Boss(name,
                species,
                level,
                weaponTypes,
                weapon,
                hp,
                def,
                atk,
                bossType,
                difficulty,
                rarity);
    }
}
