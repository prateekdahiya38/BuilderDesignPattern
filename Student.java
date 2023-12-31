package builderDesignPattern;

import builderDesignPattern.exceptions.ageValidation;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String email;
    private int yoe;


    public Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.email  = builder.email;
        this.yoe = builder.yoe;
    }

    public static Builder builderCall(){
        Builder b = new Builder();
        return b;
    }




    static class Builder{
        private String name;
        private int age;
        private double psp;
        private String email;
        private int yoe;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public void validate(){
            if (age <= 17) {
                throw new ageValidation("this is not a valid age");
            }
        }

        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;
        }
    }
}
