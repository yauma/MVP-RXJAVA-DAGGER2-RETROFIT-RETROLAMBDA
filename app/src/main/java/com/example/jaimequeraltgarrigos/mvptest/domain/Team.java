
package com.example.jaimequeraltgarrigos.mvptest.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Team {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("redCardsTotal")
    @Expose
    private Integer redCardsTotal;
    @SerializedName("results")
    @Expose
    private Results results;
    @SerializedName("outcome")
    @Expose
    private Object outcome;
    @SerializedName("logoUrl")
    @Expose
    private String logoUrl;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 
     * @param number
     *     The number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

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
     *     The shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 
     * @param shortName
     *     The shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * 
     * @return
     *     The redCardsTotal
     */
    public Integer getRedCardsTotal() {
        return redCardsTotal;
    }

    /**
     * 
     * @param redCardsTotal
     *     The redCardsTotal
     */
    public void setRedCardsTotal(Integer redCardsTotal) {
        this.redCardsTotal = redCardsTotal;
    }

    /**
     * 
     * @return
     *     The results
     */
    public Results getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    public void setResults(Results results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The outcome
     */
    public Object getOutcome() {
        return outcome;
    }

    /**
     * 
     * @param outcome
     *     The outcome
     */
    public void setOutcome(Object outcome) {
        this.outcome = outcome;
    }

    /**
     * 
     * @return
     *     The logoUrl
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * 
     * @param logoUrl
     *     The logoUrl
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

}
