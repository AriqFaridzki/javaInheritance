public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        CharacterBuilder Entesla = new HeroBuilder()
                .withName("Entesla")
                .withSpecies("Human")
                .withLevel(20)
                .withWeaponTypes("Sword")
                .withWeapon("Slivering Star")
                .withHp(100)
                .withDef(50)
                .withAtk(11);

        Hero EnteslaHero = ((HeroBuilder) Entesla)
                .withHERO_STAR_RATING(5)
                .withTitles("Exception")
                .withRegion("Felantrony")
                .withGender("male")
                .build();

        EnteslaHero.printStat();
        EnteslaHero.attack();
        EnteslaHero.mainSkill();
        EnteslaHero.secondarySkill();
        EnteslaHero.thirdSkill();

        System.out.println(" ");
        System.out.println("=========");
        System.out.println(" ");

        CharacterBuilder angela = new NPCBuilder()
                .withName("Angela Kokoromi")
                .withSpecies("Human")
                .withHp(100)
                .withDef(20)
                .withAtk(5);


        NPC angelaNPC = ((NPCBuilder) angela)
                .withRegion("Kakuestei Country")
                .withJob("Admin Front Office")
                .build();
        angelaNPC.printStat();
        angelaNPC.talk();

        System.out.println(" ");
        System.out.println("=========");
        System.out.println(" ");

        CharacterBuilder hobGoblin = new BossBuilder()
                .withName("HobGoblin")
                .withSpecies("Goblin")
                .withLevel(30)
                .withWeaponTypes("Machette")
                .withWeapon("Backlight Bite's")
                .withHp(500)
                .withDef(100)
                .withAtk(50);

        Boss hobGoblinBoss = ((BossBuilder) hobGoblin)
                .withBossType("Mini Boss")
                .withDifficulty("Hard")
                .withRarity(5)
                .build();

        hobGoblinBoss.printStat();
        hobGoblinBoss.mainSkill();
    }
}