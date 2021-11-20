package bloaters.primitive_obsession.bad_code;

public class VoterService {

    private String name;
    private int age;
    private String constitution;


    public VoterService(String name, int age, String constitution) {
        this.name = name;
        this.age = age;
        this.constitution = constitution;
    }

    public void casteVote(String symbol) {
        /*
            isEligible();
            isValidConstitution();
        */
         switch (symbol){
             case "Tree": {
                System.out.println("Voted for tree");
                break;
            }
             case "Flower": {
                System.out.println("Voted for Flower");
                break;
            }

        }

    }




}
