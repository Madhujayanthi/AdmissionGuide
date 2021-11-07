package com.example.admissionguide;

public class UserHelperClass {
    String fullname,email,phoneno,q1spin,q2spin,q3,q4,aSpinner;

    public UserHelperClass() {
    }

    public UserHelperClass(String fullname, String email, String phoneno, String q1spin, String q2spin, String q3, String q4, String aSpinner) {
        this.fullname = fullname;
        this.email = email;
        this.phoneno = phoneno;
        this.q1spin = q1spin;
        this.q2spin= q2spin;
        this.q3 = q3;
        this.q4 = q4;
        this.aSpinner = aSpinner;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getQ1() {
        return q1spin;
    }

    public void setQ1(String q1) {
        this.q1spin = q1spin;
    }

    public String getQ2() {
        return q2spin;
    }

    public void setQ2(String q2) {
        this.q2spin = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getaSpinner() {
        return aSpinner;
    }

    public void setaSpinner(String aSpinner) {
        this.aSpinner = aSpinner;
    }
}
