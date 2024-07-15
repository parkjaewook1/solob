package com.example.solob.mapper;

import com.example.solob.domain.Board;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {


    @Insert("""
                INSERT INTO board(title,content,writer)
                VALUES (#{title},#{content},#{writer})
            """)
    public int insert(Board board);
}
