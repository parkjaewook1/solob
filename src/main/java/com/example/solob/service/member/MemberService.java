package com.example.solob.service.member;

import com.example.solob.domain.member.Member;
import com.example.solob.mapper.member.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
@RequiredArgsConstructor
public class MemberService {

    final MemberMapper mapper;

    public void add(Member member) {
        mapper.insert(member);
    }
}
