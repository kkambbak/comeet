package me.kkbk.comeet.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootTest
class MemberDaoServiceTest {

    @Autowired
    private MemberDaoService service;

    @Test
    @DisplayName("전체유저조회")
    public void t1() throws Exception{
        //given
        Member member1 = new Member(1L,"member1",LocalDateTime.now(), LocalDateTime.now());
        Member member2 = new Member(2L,"member2",LocalDateTime.now(), LocalDateTime.now());
        Member member3 = new Member("member3");
        service.createUser(member1);
        service.createUser(member2);
        service.createUser(member3);

        //when
        List<Member> members = service.findAll();

        //then
        Assertions.assertThat(members.size()).isEqualTo(3);
    }

}