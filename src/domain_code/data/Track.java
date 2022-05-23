package domain_code.data;

public enum Track {

    BAHRAIN ("Bahrain"),
    IMOLA ("Imola"),
    PORTUGAL ("Portugal"),
    SPAIN ("Spain"),
    MONACO ("Monaco"),
    AZERBAIJAN ("Azerbaijan"),
    FRANCE ("France"),
    AUSTRIA ("Austria"),
    GREAT_BRITAIN ("Great Britain"),
    HUNGARY ("Hungary"),
    BELGIUM ("Belgium"),
    NETHERLANDS ("Netherlands"),
    ITALY ("Italy"),
    RUSSIA ("Russia"),
    JAPAN ("Japan"),
    USA ("USA"),
    MEXICO ("Mexico"),
    BRAZIL ("Brazil"),
    AUSTRALIA ("Australia"),
    SAUDIARABIA ("Saudiarabia"),
    ABU_DHABI ("Abu Dhabi"),
    CANADA ("Canada"),
    CHINA ("China"),
    SINGAPORE ("Singapore");

    private String name;

    Track(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
