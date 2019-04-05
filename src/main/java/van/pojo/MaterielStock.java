package van.pojo;

import java.util.Date;

public class MaterielStock {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_stock.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_stock.warehousing_id
     *
     * @mbg.generated
     */
    private Integer warehousingId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_stock.materiel_id
     *
     * @mbg.generated
     */
    private Integer materielId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_stock.number
     *
     * @mbg.generated
     */
    private Integer number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_stock.note_taker
     *
     * @mbg.generated
     */
    private String noteTaker;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column materiel_stock.record_time
     *
     * @mbg.generated
     */
    private Date recordTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_stock.id
     *
     * @return the value of materiel_stock.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_stock.id
     *
     * @param id the value for materiel_stock.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_stock.warehousing_id
     *
     * @return the value of materiel_stock.warehousing_id
     *
     * @mbg.generated
     */
    public Integer getWarehousingId() {
        return warehousingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_stock.warehousing_id
     *
     * @param warehousingId the value for materiel_stock.warehousing_id
     *
     * @mbg.generated
     */
    public void setWarehousingId(Integer warehousingId) {
        this.warehousingId = warehousingId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_stock.materiel_id
     *
     * @return the value of materiel_stock.materiel_id
     *
     * @mbg.generated
     */
    public Integer getMaterielId() {
        return materielId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_stock.materiel_id
     *
     * @param materielId the value for materiel_stock.materiel_id
     *
     * @mbg.generated
     */
    public void setMaterielId(Integer materielId) {
        this.materielId = materielId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_stock.number
     *
     * @return the value of materiel_stock.number
     *
     * @mbg.generated
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_stock.number
     *
     * @param number the value for materiel_stock.number
     *
     * @mbg.generated
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_stock.note_taker
     *
     * @return the value of materiel_stock.note_taker
     *
     * @mbg.generated
     */
    public String getNoteTaker() {
        return noteTaker;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_stock.note_taker
     *
     * @param noteTaker the value for materiel_stock.note_taker
     *
     * @mbg.generated
     */
    public void setNoteTaker(String noteTaker) {
        this.noteTaker = noteTaker == null ? null : noteTaker.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column materiel_stock.record_time
     *
     * @return the value of materiel_stock.record_time
     *
     * @mbg.generated
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column materiel_stock.record_time
     *
     * @param recordTime the value for materiel_stock.record_time
     *
     * @mbg.generated
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}