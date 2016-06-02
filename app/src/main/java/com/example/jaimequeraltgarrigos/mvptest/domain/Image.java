
package com.example.jaimequeraltgarrigos.mvptest.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("objectCode")
    @Expose
    private String objectCode;
    @SerializedName("objectId")
    @Expose
    private String objectId;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * 
     * @return
     *     The objectCode
     */
    public String getObjectCode() {
        return objectCode;
    }

    /**
     * 
     * @param objectCode
     *     The objectCode
     */
    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    /**
     * 
     * @return
     *     The objectId
     */
    public String getObjectId() {
        return objectId;
    }

    /**
     * 
     * @param objectId
     *     The objectId
     */
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    /**
     * 
     * @return
     *     The title
     */
    public Object getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(Object title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
