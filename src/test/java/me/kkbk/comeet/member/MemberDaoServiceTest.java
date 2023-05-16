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

        //when
        List<Member> members = service.findAll();
        System.out.println(members.get(1));

        //then
        Assertions.assertThat(members.size()).isEqualTo(3);
    }

}