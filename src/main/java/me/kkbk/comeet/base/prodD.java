package me.kkbk.comeet.base;

import me.kkbk.comeet.member.Member;
import me.kkbk.comeet.member.MemberDaoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Configuration
public class prodD {
    @Bean
    CommandLineRunner initData(
            MemberDaoService service
    ) {
        return new CommandLineRunner() {
            @Override
            @Transactional
            public void run(String... args) throws Exception {
                Member member1 = new Member(1L, "member1", LocalDateTime.now(), LocalDateTime.now());
                Member member2 = new Member(2L, "member2", LocalDateTime.now(), LocalDateTime.now());
                Member member3 = new Member(3L, "member2", LocalDateTime.now(), LocalDateTime.now());
                service.createUser(member1);
                service.createUser(member2);
                service.createUser(member3);
            }
        };
    }

}

