package com.nf147.entity;

public class PsApiresponse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_apiresponse.code
     *
     * @mbg.generated
     */
    private Integer code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_apiresponse.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_apiresponse.message
     *
     * @mbg.generated
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_apiresponse.code
     *
     * @return the value of ps_apiresponse.code
     *
     * @mbg.generated
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_apiresponse.code
     *
     * @param code the value for ps_apiresponse.code
     *
     * @mbg.generated
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_apiresponse.type
     *
     * @return the value of ps_apiresponse.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_apiresponse.type
     *
     * @param type the value for ps_apiresponse.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_apiresponse.message
     *
     * @return the value of ps_apiresponse.message
     *
     * @mbg.generated
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_apiresponse.message
     *
     * @param message the value for ps_apiresponse.message
     *
     * @mbg.generated
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}