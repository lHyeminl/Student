/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package studentlist;

/**
 *
 * @author hyemi
 */
public class PartTimeStudent extends Student {

    private int numCourses;
    
    public PartTimeStudent(String studentId,String studentName,int numCourse){
    super(studentId,studentName);
    this.numCourses=numCourse;

}
    
     public int getNumCourses() {
     return numCourses;
}

     
     public void setNumCourse(int numCourses) {
     this.numCourses=numCourses;
             }    
}
