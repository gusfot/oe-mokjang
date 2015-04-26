package kr.ch.oe.dao;

import java.util.List;
import kr.ch.oe.model.ReportItems;
import kr.ch.oe.model.ReportItemsExample;
import org.apache.ibatis.annotations.Param;

public interface ReportItemsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_items
     *
     * @mbggenerated Sun Mar 22 14:28:40 KST 2015
     */
    int countByExample(ReportItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_items
     *
     * @mbggenerated Sun Mar 22 14:28:40 KST 2015
     */
    int deleteByExample(ReportItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_items
     *
     * @mbggenerated Sun Mar 22 14:28:40 KST 2015
     */
    int insert(ReportItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_items
     *
     * @mbggenerated Sun Mar 22 14:28:40 KST 2015
     */
    int insertSelective(ReportItems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_items
     *
     * @mbggenerated Sun Mar 22 14:28:40 KST 2015
     */
    List<ReportItems> selectByExample(ReportItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_items
     *
     * @mbggenerated Sun Mar 22 14:28:40 KST 2015
     */
    int updateByExampleSelective(@Param("record") ReportItems record, @Param("example") ReportItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_items
     *
     * @mbggenerated Sun Mar 22 14:28:40 KST 2015
     */
    int updateByExample(@Param("record") ReportItems record, @Param("example") ReportItemsExample example);
}