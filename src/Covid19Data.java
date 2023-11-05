public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekraeftede;
    private int døde;
    private int intensivIndlagte;
    private int indlagte;

    public Covid19Data(String region, String aldersgruppe, int bekraeftede, int døde, int intensivIndlagte, int indlagte) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekraeftede = bekraeftede;
        this.døde = døde;
        this.intensivIndlagte = intensivIndlagte;
        this.indlagte = indlagte;
    }

    @Override
    public String toString() {
        return "Covid information for datoen 27-10-2022 { " +
                "region = " + region +
                ", aldersgruppen = " + aldersgruppe +
                ", bekraeftede = " + bekraeftede +
                ", døde = " + døde +
                ", intensiv = " + intensivIndlagte +
                ", indlagte = " + indlagte +
                " }";
    }
}

