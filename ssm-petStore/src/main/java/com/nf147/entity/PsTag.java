package com.nf147.entity;

public class PsTag {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_tag.t_id
     *
     * @mbg.generated
     */
    private Integer tId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_tag.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_tag.t_id
     *
     * @return the value of ps_tag.t_id
     *
     * @mbg.generated
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_tag.t_id
     *
     * @param tId the value for ps_tag.t_id
     *
     * @mbg.generated
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_tag.name
     *
     * @return the value of ps_tag.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_tag.name
     *
     * @param name the value for ps_tag.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}