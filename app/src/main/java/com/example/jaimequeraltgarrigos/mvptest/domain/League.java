
package com.example.jaimequeraltgarrigos.mvptest.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class League {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("additionalName")
    @Expose
    private Object additionalName;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("relatedToObjectCode")
    @Expose
    private String relatedToObjectCode;
    @SerializedName("relatedToObjectId")
    @Expose
    private String relatedToObjectId;
    @SerializedName("hasStandings")
    @Expose
    private Boolean hasStandings;
    @SerializedName("matches")
    @Expose
    private List<Match> matches = new ArrayList<Match>();

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The additionalName
     */
    public Object getAdditionalName() {
        return additionalName;
    }

    /**
     * 
     * @param additionalName
     *     The additionalName
     */
    public void setAdditionalName(Object additionalName) {
        this.additionalName = additionalName;
    }

    /**
     * 
     * @return
     *     The image
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The relatedToObjectCode
     */
    public String getRelatedToObjectCode() {
        return relatedToObjectCode;
    }

    /**
     * 
     * @param relatedToObjectCode
     *     The relatedToObjectCode
     */
    public void setRelatedToObjectCode(String relatedToObjectCode) {
        this.relatedToObjectCode = relatedToObjectCode;
    }

    /**
     * 
     * @return
     *     The relatedToObjectId
     */
    public String getRelatedToObjectId() {
        return relatedToObjectId;
    }

    /**
     * 
     * @param relatedToObjectId
     *     The relatedToObjectId
     */
    public void setRelatedToObjectId(String relatedToObjectId) {
        this.relatedToObjectId = relatedToObjectId;
    }

    /**
     * 
     * @return
     *     The hasStandings
     */
    public Boolean getHasStandings() {
        return hasStandings;
    }

    /**
     * 
     * @param hasStandings
     *     The hasStandings
     */
    public void setHasStandings(Boolean hasStandings) {
        this.hasStandings = hasStandings;
    }

    /**
     * 
     * @return
     *     The matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    /**
     * 
     * @param matches
     *     The matches
     */
    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

}
