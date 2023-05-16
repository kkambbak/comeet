package me.kkbk.comeet.member;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberDaoService {

    private MemberRepository repository;

    public MemberDaoService(MemberRepository repository) {
        this.repository = repository;
    }

    public List<Member> findAll() {
        return repository.findAll();
    }

    @Transactional
    public Member createUser(Member member){
        return repository.save(member);
    }


}
