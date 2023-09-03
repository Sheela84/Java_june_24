package August19;

public class DriveClass {
    int age ;
    String name;
    public void ageCalculator(int age) throws UnderAgeException{



            if(age<18)
        {
            throw new UnderAgeException(" you are under age");
        }
            else {
                System.out.println(" you are eligible for voting");
            }



    }


    }

