package com.tx.springboot.entity;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class PatientInformation implements Serializable {

    /**
     * id	bigint(20)
     * patient_info_hash	varchar(32)
     * hospital_id	bigint(20)
     * patient_no	varchar(30)
     * sex	char(5)
     * birthday_date	date
     * create_date	datetime
     * modify_date	datetime
     * create_user_id	bigint(20)
     * modify_user_id	bigint(20)
     */
    private Integer id;
    private String patient_info_hash;
    private Integer hospital_id;
    private String patient_no;
    private String sex;
    private Date birthday_date;
    private Timestamp create_date;
    private Timestamp modify_date;

    private Integer create_user_id;
    private Integer modify_user_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatient_info_hash() {
        return patient_info_hash;
    }

    public void setPatient_info_hash(String patient_info_hash) {
        this.patient_info_hash = patient_info_hash;
    }

    public Integer getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(Integer hospital_id) {
        this.hospital_id = hospital_id;
    }

    public String getPatient_no() {
        return patient_no;
    }

    public void setPatient_no(String patient_no) {
        this.patient_no = patient_no;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday_date() {
        return birthday_date;
    }

    public void setBirthday_date(Date birthday_date) {
        this.birthday_date = birthday_date;
    }

    public Timestamp getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }

    public Timestamp getModify_date() {
        return modify_date;
    }

    public void setModify_date(Timestamp modify_date) {
        this.modify_date = modify_date;
    }

    public Integer getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(Integer create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Integer getModify_user_id() {
        return modify_user_id;
    }

    public void setModify_user_id(Integer modify_user_id) {
        this.modify_user_id = modify_user_id;
    }

    @Override
    public String toString() {
        return "PatientInformation{" +
                "id=" + id +
                ", patient_info_hash='" + patient_info_hash + '\'' +
                ", hospital_id=" + hospital_id +
                ", patient_no='" + patient_no + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday_date=" + birthday_date +
                ", create_date=" + create_date +
                ", modify_date=" + modify_date +
                ", create_user_id=" + create_user_id +
                ", modify_user_id=" + modify_user_id +
                '}';
    }



}
