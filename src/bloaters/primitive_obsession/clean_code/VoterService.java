package bloaters.primitive_obsession.clean_code;

enum Constituency {
    INDI,BILGI,UDUPI,NANVI
}

public class VoterService {

    private String name;
    private Age age;
    private Constituency constituency;

    public VoterService(String name, Age age, Constituency constituency) {
        this.age = age.getAge();
        this.constituency = constituency;
    }

    public void casteVote(String symbol) {

        switch (symbol){
            case "Tree" -> {
                System.out.println("Voted for tree");
                break;
            }
            case "Flower" -> {
                System.out.println("Voted for Flower");
                break;
            }

        }

    }




}
