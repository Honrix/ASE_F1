package objects.drivers;

public enum Driver {

    HAMILTON ("Lewis Hamilton", Team.MERCEDES),
    BOTTAS ("Valtteri Bottas", Team.MERCEDES),
    VERSTAPPEN ("Max Verstappen", Team.RED_BULL),
    ALBON ("Alex Albon", Team.RED_BULL),
    VETTEL ("Sebastian Vettel", Team.FERRARI),
    LECLERC ("Charles Leclerc", Team.FERRARI),
    NORRIS ("Lando Norris", Team.MCLAREN),
    SAINZ ("Carlos Sainz", Team.MCLAREN),
    RICCIARDO ("Daniel Ricciardo", Team.RENAULT),
    OCON ("Esteban Ocon", Team.RENAULT),
    GASLY ("Pierre Gasly", Team.ALPHATAURI),
    KVYAT ("Daniil Kvyat", Team.ALPHATAURI),
    PEREZ ("Sergio Perez", Team.RACING_POINT),
    STROLL ("Lance Stroll", Team.RACING_POINT),
    RAIKKONEN ("Kimi Raikkonen", Team.ALFA_ROMEO),
    GIOVINAZZI ("Antonio Giovinazzi", Team.ALFA_ROMEO),
    GROSJEAN ("Romain Grosjean", Team.HAAS),
    MAGNUSSEN ("Kevin Magnussen", Team.HAAS),
    RUSSELL ("George Russell", Team.WILLIAMS),
    LATIFI ("Nicholas Latifi", Team.WILLIAMS);

    private String name;
    private Nation nation;
    private Team team;

    Driver(String name, Nation nation, Team team) {
        this.name = name;
        this.nation = nation;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public Nation getNation() {
        return nation;
    }

    public Team getTeam() {
        return team;
    }

}
