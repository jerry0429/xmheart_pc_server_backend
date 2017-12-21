package com.xmheart.mapper;

import com.xmheart.model.XPWRole;
import com.xmheart.model.XPWRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWRoleMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    long countByExample(XPWRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    int deleteByExample(XPWRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    @Delete({ "delete from xpw_role", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    @Insert({ "insert into xpw_role (name, priv_ids)",
            "values (#{name,jdbcType=VARCHAR}, #{privIds,jdbcType=VARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(XPWRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    int insertSelective(XPWRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    List<XPWRole> selectByExample(XPWRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    @Select({ "select", "id, name, priv_ids", "from xpw_role", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.xmheart.mapper.XPWRoleMapper.BaseResultMap")
    XPWRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    int updateByExampleSelective(@Param("record") XPWRole record, @Param("example") XPWRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    int updateByExample(@Param("record") XPWRole record, @Param("example") XPWRoleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    int updateByPrimaryKeySelective(XPWRole record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_role
     * @mbg.generated  Thu Dec 21 15:09:25 CST 2017
     */
    @Update({ "update xpw_role", "set name = #{name,jdbcType=VARCHAR},", "priv_ids = #{privIds,jdbcType=VARCHAR}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(XPWRole record);
}