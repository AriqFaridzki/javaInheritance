public class NPCBuilder extends CharacterBuilder {
    protected String region = "-";
    protected String job = "-";

    public NPCBuilder withRegion(String region) {
        this.region = region;
        return this;
     }

    public NPCBuilder withJob(String job) {
        this.job = job;
        return this;
    }

    public NPC build(){
        return new NPC(name,
                species,
                level,
                weaponTypes,
                weapon,
                hp,
                def,
                atk,
                region,
                job);
    }
}
