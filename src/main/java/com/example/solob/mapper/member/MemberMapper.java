package com.example.solob.mapper.member;

import com.example.solob.domain.member.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {


    @Insert("""
            INSERT INTO member(email,password,nick_name)
            VALUES (#{email},#{password},#{nickName})
            """)
    public int insert(Member member);

    @Select("""
            SELECT *
            FROM member
            WHERE email=#{email}
            """)
    Member selectByEmail(String email);

    @Select("""
            SELECT *
            FROM member
            WHERE nick_name=#{nickName}
            """)
    Member selectByNickName(String nickName);

    @Select("""
            SELECT id,email,nick_name,inserted
            FROM member
            ORDER BY id DESC
            """)
    List<Member> selectAll();

    @Select("""
            SELECT id,
                   email,
                   nick_name,
                   inserted,
                   password
            FROM member
            WHERE id = #{id}
            """)
    Member selectById(Integer id);

    @Delete("""
            DELETE FROM member
            WHERE id = #{id}
            """)
    int deleteById(Integer id);

    @Update("""
            UPDATE member
            SET password=#{password},
                nick_name=#{nickName}
            WHERE id=#{id}
            """)
    int update(Member member);
}
