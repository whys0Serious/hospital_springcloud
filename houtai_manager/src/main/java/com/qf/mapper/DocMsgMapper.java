package com.qf.mapper;

import com.qf.domain.DocMsg;
import com.qf.domain.DocMsgExample;
import java.util.List;

import com.qf.domain.UserMsg;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DocMsgMapper {
    int countByExample(DocMsgExample example);
    @Select(value = ("select doc_name from doc_msg"))
    List<String> findnames();
    int deleteByExample(DocMsgExample example);

    int deleteByPrimaryKey(Long pkDocid);

    int insert(DocMsg record);

    int insertSelective(DocMsg record);

    List<DocMsg> selectByExample(DocMsgExample example);

    DocMsg selectByPrimaryKey(Long pkDocid);

    int updateByExampleSelective(@Param("record") DocMsg record, @Param("example") DocMsgExample example);

    int updateByExample(@Param("record") DocMsg record, @Param("example") DocMsgExample example);

    int updateByPrimaryKeySelective(DocMsg record);

    int updateByPrimaryKey(DocMsg record);

    List<UserMsg> yishengzhuce();

    int xiugaizige(@Param("id") Long id, @Param("integer") Byte integer);
    @Insert(value =" insert into login_msg (pk_uid, pk_docid, user_name, \n" +
            "      user_pass, user_mail, user_pic, \n" +
            "      user_gender, user_age, user_phone, \n" +
            "      is_activated, identity, gmt_create, \n" +
            "      gmt_modified)\n" +
            "    values (#{pkUid,jdbcType=BIGINT}, #{pkDocid,jdbcType=BIGINT}, #{userName,jdbcType=CHAR}, \n" +
            "      #{userPass,jdbcType=CHAR}, #{userMail,jdbcType=CHAR}, #{userPic,jdbcType=CHAR}, \n" +
            "      #{userGender,jdbcType=CHAR}, #{userAge,jdbcType=INTEGER}, #{userPhone,jdbcType=CHAR}, \n" +
            "      #{isActivated,jdbcType=TINYINT}, #{identity,jdbcType=CHAR}, #{gmtCreate,jdbcType=TIMESTAMP}, \n" +
            "      #{gmtModified,jdbcType=TIMESTAMP})")
    int tianjiaguanliyaun(UserMsg userMsg);
    @Select("select user_name from login_msg where identity='医生'")
    List<String> chaxunyisheng();
}