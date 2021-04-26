public class OfferedCourse extends Course {
    // TODO: Declare private fields - instructorName, term, classTime
    private String instructorName;
    private String term;
    private String classTime;
 
    // TODO: Define mutator methods -
    //      setInstructorName(), setTerm(), setClassTime()
    public void setInstructorName(String userInstructorName) {
        instructorName = userInstructorName;
    }
    public void setTerm(String userTerm) {
        term = userTerm;
    }
    public void setClassTime(String userClassTime) {
        classTime = userClassTime;
    }

    // TODO: Define accessor methods -
    //      getInstructorName(), getTerm(), getClassTime()

    public String getInstructorName() {
        return instructorName;
    }
    public String getTerm() {
        return term;
    }
    public String getClassTime() {
        return classTime;
    }

    //@Override
    //public void printInfo() {
    //    super.printInfo();
    //    System.out.println("   Instructor Name: " + instructorName);
    //    System.out.println("   Term: " + term);
    //    System.out.println("   Class Time: " + classTime);
    //}
}