package student;

public class Student {
    private int id;
    private String name;
    private String grade;
    private int age;
    private float avgMarks;
    private float fee;
    private String email;
    private String phoneNumber;

    public Student(int id) {
        this.id = id;
    }

    public Student (int id, String name, int age){
        this(id);
        this.name = name;
        this.age = age;
    }

    public Student(int id, String name, String grade, int age, float avgMarks, float fee, String email, String phoneNumber) {
        this(id, name, age);

        this.grade = grade;

        this.avgMarks = avgMarks;
        this.fee = fee;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getGrade() {

        return grade;
    }

    public void setGrade(String grade) {

        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public float getAvgMarks() {

        return avgMarks;
    }

    public void setAvgMarks(
            float avgMarks) {
        this.avgMarks = avgMarks;
    }

    public float getFee() {

        return fee;
    }

    public void setFee(float fee) {

        this.fee = fee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void study(String subject){

    }

    public void payFee(float amount){

    }

    public void doHomework(String subject){

    }

    public void doTest(String subject){

    }
}
