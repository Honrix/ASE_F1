package objects.exceptions;

public class WrongDriverInformationExpetion extends Exception {

    private String input = "";

    public WrongDriverInformationExpetion(){
        super("Error by creating the stats of a certain Driver");
    }

    public WrongDriverInformationExpetion(String input){
        super(input);
        this.input = input;
    }

    public String toString(){
        return input;
    }


}
