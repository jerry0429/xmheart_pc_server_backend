package com.xmheart.mapper;

import com.xmheart.model.XPWPriv;
import com.xmheart.model.XPWPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWPrivMapper {

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    long countByExample(XPWPrivExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    int deleteByExample(XPWPrivExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    @Delete({ "delete from xpw_priv", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    @Insert({ "insert into xpw_priv (table_name, column_id, ", "name, is_enabled)",
            "values (#{tableName,jdbcType=VARCHAR}, #{columnId,jdbcType=BIGINT}, ",
            "#{name,jdbcType=VARCHAR}, #{isEnabled,jdbcType=BIT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(XPWPriv record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    int insertSelective(XPWPriv record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    List<XPWPriv> selectByExample(XPWPrivExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    @Select({ "select", "id, table_name, column_id, name, is_enabled", "from xpw_priv",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.xmheart.mapper.XPWPrivMapper.BaseResultMap")
    XPWPriv selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") XPWPriv record, @Param("example") XPWPrivExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    int updateByExample(@Param("record") XPWPriv record, @Param("example") XPWPrivExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    int updateByPrimaryKeySelective(XPWPriv record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_priv
     * @mbg.generated  Thu Feb 08 16:42:49 CST 2018
     */
    @Update({ "update xpw_priv", "set table_name = #{tableName,jdbcType=VARCHAR},",
            "column_id = #{columnId,jdbcType=BIGINT},", "name = #{name,jdbcType=VARCHAR},",
            "is_enabled = #{isEnabled,jdbcType=BIT}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(XPWPriv record);

    @Select("select a.*, b.column_name as column_name  from xpw_priv a, xpw_column b where a.column_id = b.id and a.is_enabled = 1")
	@ResultMap("ColumnNameBaseResultMap")
	List<XPWPriv> selectWithColumnNameByExample();
    
}