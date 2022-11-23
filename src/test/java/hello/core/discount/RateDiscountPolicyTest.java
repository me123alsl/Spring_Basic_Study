package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("BASIC 할인 안함")
    void vip_o() {
//        given
        Member member1 = new Member(1L, "memberA", Grade.VIP);

//        when
        int discount = discountPolicy.discount(member1, 10000);

//        then
        assertThat(discount).isEqualTo(1000);

    }

    @Test
    @DisplayName("VIP 10% 할인")
    void vip_x() {
//        given
        Member member2 = new Member(2L, "memberB", Grade.BASIC);

//        when
        int discount = discountPolicy.discount(member2, 10000);

//        then
        assertThat(discount).isEqualTo(0);

    }
}