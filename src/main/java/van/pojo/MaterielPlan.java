package van.pojo;

import java.util.Date;

public class MaterielPlan {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.construction_id
     *
     * @mbg.generated
     */
    private Integer constructionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.materiel_id
     *
     * @mbg.generated
     */
    private Integer materielId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.planned_time
     *
     * @mbg.generated
     */
    private Date plannedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.planned_num
     *
     * @mbg.generated
     */
    private Integer plannedNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.charge_user_id
     *
     * @mbg.generated
     */
    private Integer chargeUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.note_taker
     *
     * @mbg.generated
     */
    private String noteTaker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_plan.record_time
     *
     * @mbg.generated
     */
    private Date recordTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.id
     *
     * @return the value of materiel_plan.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.id
     *
     * @param id the value for materiel_plan.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.construction_id
     *
     * @return the value of materiel_plan.construction_id
     *
     * @mbg.generated
     */
    public Integer getConstructionId() {
        return constructionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.construction_id
     *
     * @param constructionId the value for materiel_plan.construction_id
     *
     * @mbg.generated
     */
    public void setConstructionId(Integer constructionId) {
        this.constructionId = constructionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.materiel_id
     *
     * @return the value of materiel_plan.materiel_id
     *
     * @mbg.generated
     */
    public Integer getMaterielId() {
        return materielId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.materiel_id
     *
     * @param materielId the value for materiel_plan.materiel_id
     *
     * @mbg.generated
     */
    public void setMaterielId(Integer materielId) {
        this.materielId = materielId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.planned_time
     *
     * @return the value of materiel_plan.planned_time
     *
     * @mbg.generated
     */
    public Date getPlannedTime() {
        return plannedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.planned_time
     *
     * @param plannedTime the value for materiel_plan.planned_time
     *
     * @mbg.generated
     */
    public void setPlannedTime(Date plannedTime) {
        this.plannedTime = plannedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.planned_num
     *
     * @return the value of materiel_plan.planned_num
     *
     * @mbg.generated
     */
    public Integer getPlannedNum() {
        return plannedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.planned_num
     *
     * @param plannedNum the value for materiel_plan.planned_num
     *
     * @mbg.generated
     */
    public void setPlannedNum(Integer plannedNum) {
        this.plannedNum = plannedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.charge_user_id
     *
     * @return the value of materiel_plan.charge_user_id
     *
     * @mbg.generated
     */
    public Integer getChargeUserId() {
        return chargeUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.charge_user_id
     *
     * @param chargeUserId the value for materiel_plan.charge_user_id
     *
     * @mbg.generated
     */
    public void setChargeUserId(Integer chargeUserId) {
        this.chargeUserId = chargeUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.note_taker
     *
     * @return the value of materiel_plan.note_taker
     *
     * @mbg.generated
     */
    public String getNoteTaker() {
        return noteTaker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.note_taker
     *
     * @param noteTaker the value for materiel_plan.note_taker
     *
     * @mbg.generated
     */
    public void setNoteTaker(String noteTaker) {
        this.noteTaker = noteTaker == null ? null : noteTaker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_plan.record_time
     *
     * @return the value of materiel_plan.record_time
     *
     * @mbg.generated
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_plan.record_time
     *
     * @param recordTime the value for materiel_plan.record_time
     *
     * @mbg.generated
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}