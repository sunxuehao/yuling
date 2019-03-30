package van.dao;

import java.util.List;
import van.pojo.Authority;

public interface AuthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated
     */
    int insert(Authority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated
     */
    Authority selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated
     */
    List<Authority> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authority
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Authority record);
}