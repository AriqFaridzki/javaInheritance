public class NPC extends Character{

    protected String  region, job;
    public NPC(String name,
               String species,
               int level,
               String weaponTypes,
               String weapon,
               int hp,
               int def,
               int atk,

               String region,
               String job)

    {
        super(name, species, level, weaponTypes,weapon, hp, def, atk);
        this.region = region;
        this.job = job;
    }

    public void talk(){
        System.out.println("Hello how can i help you ?");
    }

    @Override
    public void printStat() {
        super.printStat();
        System.out.println("==========");
        System.out.println("Region          : " + this.region);
        System.out.println("Job             : " + this.job);
    }
}
