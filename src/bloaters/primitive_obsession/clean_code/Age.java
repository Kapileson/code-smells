package bloaters.primitive_obsession.clean_code;

public class Age {

   private int age;

   public Age getAge() {
        return this;
    }

    public void setAge(int age)  {
        try{
            validAge(age);
            this.age = age;
        }catch(Exception e){
            e.printStackTrace();
        }
   }

    private void validAge(int age) throws Exception {
        if(age <= 18)
            throw new Exception("Not a valid age");
    }


}
