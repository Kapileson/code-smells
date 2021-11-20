package object_orientation_absuers.refused_bequest.delegate.clean_code;

import object_orientation_absuers.refused_bequest.delegate.bad_code.Sanitation;

public class Child{

    Sanitation sanitation;

    Child(){
        sanitation = new Sanitation();
    }

    public void eating(){
        washHands();
        System.out.println("child eating...");
    }

    private void washHands(){
        sanitation.washHands();
    }
}
