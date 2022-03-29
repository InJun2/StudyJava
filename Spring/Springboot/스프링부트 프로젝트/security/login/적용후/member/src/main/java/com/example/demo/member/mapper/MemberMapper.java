package com.example.demo.member.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.example.demo.member.vo.MemberVo;
import com.example.demo.security.user.CustomUserDetails;

@Mapper
public interface MemberMapper {
	@Update("update member_seq set member_no =(select member_no +1 from (select member_no from member_seq)tmp)")
	public int updateMemberSeq();
	
	@Insert("insert into member(user_no, user_id, user_pwd, user_authority) values ((select member_no from member_seq), #{userId}, #{userPwd}, 1)")
	public int join(MemberVo vo);

	@Select("select * from member where user_id=#{username}")
	public MemberVo selectId(String username);

}
