class Course{
    String courseName;
    int duration;
    double fee;
    static String instituteName ="gurukul";

Course(String c , int d , double f){
    this.courseName =c;
    this.duration = d;
    this.fee=f;
}
public static void updateinstitutename(String newName){
    instituteName = newName;

}

public void displayCourseDetails(){
        System.out.println("institute name : "+instituteName+  " \ncourse name : "+courseName+ "\n for "+duration+ "years\n fees : "+ fee);
}
public static void main(String[]args){
    Course c1= new Course("nwwjx",2,10099);
    Course c2 = new Course("b.tech", 4, 2400000 );
    Course c3 = new Course("bsc", 3,200000);
    c1.displayCourseDetails();
    c2.displayCourseDetails();
    c3.displayCourseDetails();
    updateinstitutename("GLA");
    c1.displayCourseDetails();
    c2.displayCourseDetails();
    c3.displayCourseDetails();

}
}