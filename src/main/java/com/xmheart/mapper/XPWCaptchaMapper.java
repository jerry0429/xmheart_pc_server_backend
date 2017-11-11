package com.xmheart.mapper;

import com.xmheart.model.XPWCaptcha;
import com.xmheart.model.XPWCaptchaExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface XPWCaptchaMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    long countByExample(XPWCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    int deleteByExample(XPWCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    @Delete({ "delete from xpw_captcha", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    @Insert({ "insert into xpw_captcha (cookie, captcha, ", "expired)",
            "values (#{cookie,jdbcType=VARCHAR}, #{captcha,jdbcType=VARCHAR}, ", "#{expired,jdbcType=INTEGER})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(XPWCaptcha record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    int insertSelective(XPWCaptcha record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    List<XPWCaptcha> selectByExample(XPWCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    @Select({ "select", "id, cookie, captcha, expired", "from xpw_captcha", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.xmheart.mapper.XPWCaptchaMapper.BaseResultMap")
    XPWCaptcha selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") XPWCaptcha record, @Param("example") XPWCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    int updateByExample(@Param("record") XPWCaptcha record, @Param("example") XPWCaptchaExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    int updateByPrimaryKeySelective(XPWCaptcha record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table xpw_captcha
     * @mbg.generated  Fri Nov 10 23:30:11 CST 2017
     */
    @Update({ "update xpw_captcha", "set cookie = #{cookie,jdbcType=VARCHAR},",
            "captcha = #{captcha,jdbcType=VARCHAR},", "expired = #{expired,jdbcType=INTEGER}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(XPWCaptcha record);
}