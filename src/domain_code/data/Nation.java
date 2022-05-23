package domain_code.data;

public enum Nation {

    AUS ("Australia"),
    CAN ("Canada"),
    ESP ("Spain"),
    FIN ("Finland"),
    FRA ("France"),
    GBR ("Great Britain"),
    GER ("Germany"),
    ITA ("Italy"),
    JPN ("Japan"),
    MEX ("Mexico"),
    MON ("Monaco"),
    NED ("Netherlands"),
    RUS ("Russia");

    private String nationName;

    Nation (String nationName){
        this.nationName = nationName;
    }


}
