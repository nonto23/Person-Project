

public class MainProgram {

    public static void main(String[] args) {

          Person person = new Person(30 ,"Ryan","male"
                  ,new String[]{"being a hardarse", "agile", "ssd hard drives"});


        String greeting =person.Hello();
        System.out.println(greeting);
    }
}
