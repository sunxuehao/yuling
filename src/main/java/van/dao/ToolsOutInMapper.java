package van.dao;

import java.util.List;
import van.pojo.ToolsOutIn;

public interface ToolsOutInMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tools_out_in
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tools_out_in
     *
     * @mbg.generated
     */
    int insert(ToolsOutIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tools_out_in
     *
     * @mbg.generated
     */
    ToolsOutIn selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tools_out_in
     *
     * @mbg.generated
     */
    List<ToolsOutIn> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tools_out_in
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ToolsOutIn record);
}