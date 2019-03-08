package group3b;

public class Student {

    private String name;
    private String surname;
    private boolean currentStudent;

    private Student(){

    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public Boolean isCurrentStudent(){
        return currentStudent;
    }

    public Student(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
        this.currentStudent = builder.currentStudent;
    }

    public static class Builder{
        private String name;
        private String surname;
        private boolean currentStudent;

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder surname(String value){
            this.surname = value;
            return this;
        }

        public Builder currentStudent(boolean value){
            this.currentStudent = value;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}
