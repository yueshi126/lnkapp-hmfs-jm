package org.fbi.hmfsjm.repository.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.fbi.hmfsjm.repository.model.HmfsJmAct;
import org.fbi.hmfsjm.repository.model.HmfsJmActExample;

public interface HmfsJmActMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int countByExample(HmfsJmActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int deleteByExample(HmfsJmActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int deleteByPrimaryKey(String pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int insert(HmfsJmAct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int insertSelective(HmfsJmAct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    List<HmfsJmAct> selectByExample(HmfsJmActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    HmfsJmAct selectByPrimaryKey(String pkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int updateByExampleSelective(@Param("record") HmfsJmAct record, @Param("example") HmfsJmActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int updateByExample(@Param("record") HmfsJmAct record, @Param("example") HmfsJmActExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int updateByPrimaryKeySelective(HmfsJmAct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FIS.HMFS_JM_ACT
     *
     * @mbggenerated Wed Oct 15 10:29:43 CST 2014
     */
    int updateByPrimaryKey(HmfsJmAct record);
}