import java.util.ArrayList;


public class Person {

    private int age;
    private String name;
    private String gender;
    String[] interest ;
    public Person(int age ,String name,String gender,String[] interest)
    {
        this.name =name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }


    public String Hello()
    {
        String message ="hello, my name is "+name+" and i am "+age+" years old"+
                       ".My interests are "+interest[0]+", "+interest[1]+" and "+interest[2];

        return message;
    }
}
