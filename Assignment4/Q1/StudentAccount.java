/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter4.Question1;


/**
 *
 * @author hp
 */
public class StudentAccount {

    private int id;
    private String name;
    private String SIE; // التخصص
    private double educationalGrade;

    public StudentAccount () {
    }

    public StudentAccount (int id, String name, String SIE, double educationalGrade) {
        this.id = id;
        this.name = name;
        this.SIE = SIE;
        this.educationalGrade = educationalGrade;
    }

    public StudentAccount (String name, double educationalGrade) {
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

    public String getSIE() {
        return SIE;
    }

    public void setSIE(String SIE) {
        this.SIE = SIE;
    }

    public double geteducationalGrade() {
        return educationalGrade;
    }

    public void seteducationalGrade(double educationalGrade) {
        this.educationalGrade = educationalGrade;
    }

    @Override
    public String toString() {
        system.out.printlm( id, name, SIE, educationalGrade);
    }
}
