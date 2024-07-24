package com.example.solob.mapper.member;

import com.example.solob.domain.member.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {


    @Insert("""
            INSERT INTO member(email,password,nick_name)
            VALUES (#{email},#{password},#{nickName})
            """)
    public int insert(Member member);
}
