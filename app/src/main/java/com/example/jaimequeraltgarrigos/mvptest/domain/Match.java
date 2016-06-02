
package com.example.jaimequeraltgarrigos.mvptest.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Match {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("startDate")
    @Expose
    private Integer startDate;
    @SerializedName("countryId")
    @Expose
    private Integer countryId;
    @SerializedName("countryName")
    @Expose
    private String countryName;
    @SerializedName("tournamentId")
    @Expose
    private Integer tournamentId;
    @SerializedName("tournamentName")
    @Expose
    private String tournamentName;
    @SerializedName("tournamentShortName")
    @Expose
    private String tournamentShortName;
    @SerializedName("sportId")
    @Expose
    private Integer sportId;
    @SerializedName("statusId")
    @Expose
    private Integer statusId;
    @SerializedName("statusCode")
    @Expose
    private String statusCode;
    @SerializedName("statusDesc")
    @Expose
    private String statusDesc;
    @SerializedName("statusShortDesc")
    @Expose
    private String statusShortDesc;
    @SerializedName("elapsed")
    @Expose
    private Integer elapsed;
    @SerializedName("elapsedText")
    @Expose
    private Object elapsedText;
    @SerializedName("isTicking")
    @Expose
    private Boolean isTicking;
    @SerializedName("ballPossession")
    @Expose
    private Integer ballPossession;
    @SerializedName("outcome")
    @Expose
    private Object outcome;
    @SerializedName("predictionOpened")
    @Expose
    private Boolean predictionOpened;
    @SerializedName("teams")
    @Expose
    private List<Team> teams = new ArrayList<Team>();

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
     *     The startDate
     */
    public Integer getStartDate() {
        return startDate;
    }

    /**
     * 
     * @param startDate
     *     The startDate
     */
    public void setStartDate(Integer startDate) {
        this.startDate = startDate;
    }

    /**
     * 
     * @return
     *     The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 
     * @param countryId
     *     The countryId
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The countryName
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The tournamentId
     */
    public Integer getTournamentId() {
        return tournamentId;
    }

    /**
     * 
     * @param tournamentId
     *     The tournamentId
     */
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    /**
     * 
     * @return
     *     The tournamentName
     */
    public String getTournamentName() {
        return tournamentName;
    }

    /**
     * 
     * @param tournamentName
     *     The tournamentName
     */
    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    /**
     * 
     * @return
     *     The tournamentShortName
     */
    public String getTournamentShortName() {
        return tournamentShortName;
    }

    /**
     * 
     * @param tournamentShortName
     *     The tournamentShortName
     */
    public void setTournamentShortName(String tournamentShortName) {
        this.tournamentShortName = tournamentShortName;
    }

    /**
     * 
     * @return
     *     The sportId
     */
    public Integer getSportId() {
        return sportId;
    }

    /**
     * 
     * @param sportId
     *     The sportId
     */
    public void setSportId(Integer sportId) {
        this.sportId = sportId;
    }

    /**
     * 
     * @return
     *     The statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    /**
     * 
     * @param statusId
     *     The statusId
     */
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    /**
     * 
     * @return
     *     The statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * 
     * @param statusCode
     *     The statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * 
     * @return
     *     The statusDesc
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    /**
     * 
     * @param statusDesc
     *     The statusDesc
     */
    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    /**
     * 
     * @return
     *     The statusShortDesc
     */
    public String getStatusShortDesc() {
        return statusShortDesc;
    }

    /**
     * 
     * @param statusShortDesc
     *     The statusShortDesc
     */
    public void setStatusShortDesc(String statusShortDesc) {
        this.statusShortDesc = statusShortDesc;
    }

    /**
     * 
     * @return
     *     The elapsed
     */
    public Integer getElapsed() {
        return elapsed;
    }

    /**
     * 
     * @param elapsed
     *     The elapsed
     */
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    /**
     * 
     * @return
     *     The elapsedText
     */
    public Object getElapsedText() {
        return elapsedText;
    }

    /**
     * 
     * @param elapsedText
     *     The elapsedText
     */
    public void setElapsedText(Object elapsedText) {
        this.elapsedText = elapsedText;
    }

    /**
     * 
     * @return
     *     The isTicking
     */
    public Boolean getIsTicking() {
        return isTicking;
    }

    /**
     * 
     * @param isTicking
     *     The isTicking
     */
    public void setIsTicking(Boolean isTicking) {
        this.isTicking = isTicking;
    }

    /**
     * 
     * @return
     *     The ballPossession
     */
    public Integer getBallPossession() {
        return ballPossession;
    }

    /**
     * 
     * @param ballPossession
     *     The ballPossession
     */
    public void setBallPossession(Integer ballPossession) {
        this.ballPossession = ballPossession;
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
     *     The predictionOpened
     */
    public Boolean getPredictionOpened() {
        return predictionOpened;
    }

    /**
     * 
     * @param predictionOpened
     *     The predictionOpened
     */
    public void setPredictionOpened(Boolean predictionOpened) {
        this.predictionOpened = predictionOpened;
    }

    /**
     * 
     * @return
     *     The teams
     */
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * 
     * @param teams
     *     The teams
     */
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
