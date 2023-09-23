package com.together.buytogether.member.feature;

import com.together.buytogether.common.ApiTest;
import com.together.buytogether.common.Scenario;
import com.together.buytogether.member.domain.MemberRepository;
import com.together.buytogether.member.domain.SessionConst;
import com.together.buytogether.member.domain.SessionManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SignInMemberTest extends ApiTest {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private SessionManager sessionManager;


    @Test
    @DisplayName("로그인 성공")
    void signUpMember() {
        Scenario.registerMember().request().signInMember().request();
        assertThat(sessionManager.getAllSessions().get(0).getAttribute(SessionConst.LOGIN_MEMBER)).
                isEqualTo(1L);
    }

}
