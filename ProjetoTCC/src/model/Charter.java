
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="charter")
public class Charter { 
	@Id
	//gera chaves(id)automaticas para etid
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="etid")
    private int etId;
	@Column(name="name")
	private String name;
	@Column(name="objective")
	private String objective;
	@Column(name="setup")
	private String setup;
	@Column(name="notes")
	private String notes;
	@Column(name="keyAreas")
	private String keyAreas;
	@Column(name="issuesToBeAware")
	private String issuesToBeAware;
	@Column(name="importantNotes")
	private String importantNotes;
	@Column(name="requirements")
	private String requirements;
	@Column(name="maxTime")
    private int maxTime;
	@Column(name="minTime")
	private int minTime;
    //private Date creationDate;

    public Charter(){
    	this.etId = 0;
    	this.name = "";
    	this.objective = "";
    	this.setup = "";
    	this.notes = "";
    	this.keyAreas = "";
    	this.issuesToBeAware = "";
    	this.importantNotes = "";
    	this.requirements = "";
        this.maxTime = 0;
        this.minTime = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEtId() {
        return etId;
    }

    public void setEtId(int etId) {
        this.etId = etId;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getKeyAreas() {
        return keyAreas;
    }

    public void setKeyAreas(String keyAreas) {
        this.keyAreas = keyAreas;
    }

    public String getIssuesToBeAware() {
        return issuesToBeAware;
    }

    public void setIssuesToBeAware(String issuesToBeAware) {
        this.issuesToBeAware = issuesToBeAware;
    }

    public String getImportantNotes() {
        return importantNotes;
    }

    public void setImportantNotes(String importantNotes) {
        this.importantNotes = importantNotes;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public void setMinTime(int minTime) {
        this.minTime = minTime;
    }
}
