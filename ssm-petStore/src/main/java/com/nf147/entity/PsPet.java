package com.nf147.entity;

public class PsPet {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_pet.p_id
     *
     * @mbg.generated
     */
    private Integer pId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_pet.c_id
     *
     * @mbg.generated
     */
    private Integer cId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_pet.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_pet.photoUrls
     *
     * @mbg.generated
     */
    private String photourls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_pet.t_id
     *
     * @mbg.generated
     */
    private Integer tId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_pet.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_pet.p_id
     *
     * @return the value of ps_pet.p_id
     *
     * @mbg.generated
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_pet.p_id
     *
     * @param pId the value for ps_pet.p_id
     *
     * @mbg.generated
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_pet.c_id
     *
     * @return the value of ps_pet.c_id
     *
     * @mbg.generated
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_pet.c_id
     *
     * @param cId the value for ps_pet.c_id
     *
     * @mbg.generated
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_pet.name
     *
     * @return the value of ps_pet.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_pet.name
     *
     * @param name the value for ps_pet.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_pet.photoUrls
     *
     * @return the value of ps_pet.photoUrls
     *
     * @mbg.generated
     */
    public String getPhotourls() {
        return photourls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_pet.photoUrls
     *
     * @param photourls the value for ps_pet.photoUrls
     *
     * @mbg.generated
     */
    public void setPhotourls(String photourls) {
        this.photourls = photourls == null ? null : photourls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_pet.t_id
     *
     * @return the value of ps_pet.t_id
     *
     * @mbg.generated
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_pet.t_id
     *
     * @param tId the value for ps_pet.t_id
     *
     * @mbg.generated
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_pet.status
     *
     * @return the value of ps_pet.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "PsPet{" +
                "pId=" + pId +
                ", cId=" + cId +
                ", name='" + name + '\'' +
                ", photourls='" + photourls + '\'' +
                ", tId=" + tId +
                ", status='" + status + '\'' +
                '}';
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_pet.status
     *
     * @param status the value for ps_pet.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}