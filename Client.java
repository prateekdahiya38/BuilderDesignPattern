package builderDesignPattern;

public class Client {
    public static void main(String[] args) {
         Student s = Student.builderCall()
                 .setName("Prateek")
                 .setAge(19) // if we set age less 18 then it throws an exception
                 .setEmail("prateekdahiya38@yahoo.com")
                 .setPsp(99.80)
                 .setYoe(1)
                 .build();
    }
}
