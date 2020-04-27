/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4.Question2;


/**
 *
 * @author hp
 */
public class StudentAccount {

    private int id;
    private String name;
    private String SID;
    private double educationalGrade;

    public Student() {
    }

    public Student(int id, String name, String SID, double educationalGrade) {
        this.id = id;
        this.name = name;
        this.SID = SID;
        this.educationalGrade = educationalGrade;
    }

    public Student(String name, double educationalGrade) {
        this.name = name;
        this.educationalGrade = educationalGrade;
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

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public double geteducationalGrade() {
        return educationalGrade;
    }

    public void seteducationalGrade(double educationalGrade) {
        this.educationalGrade = educationalGrade;
    }

    @Override
    public String toString() {
        return system.out.println( id, name, SID, educationalGrade);
    }
}
