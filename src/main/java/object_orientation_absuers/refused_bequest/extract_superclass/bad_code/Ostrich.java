package object_orientation_absuers.refused_bequest.extract_superclass.bad_code;

public class Ostrich extends Bird {

    public void fly() throws Exception {
        throw new Exception("Ostrich, I'm a bird but I can't fly!");
    }


}
