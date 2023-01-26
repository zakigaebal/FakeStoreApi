package com.fakestoreapi;


import com.fakestoreapi.Entity.Member;
import com.fakestoreapi.Repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;
import java.util.stream.IntStream;
@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memoRepository;
    @Test
    public void testInsert(){
        // getClass() 메소드는 MemoRepository 인터페이스 타입의 실제 객체가 어떤것인지 확인한다
        System.out.println(memoRepository.getClass().getName());
    }
    // 추가
    @Test
    public void testInsertDummies(){
        Date now = new Date();
        // 100개의 새로운 Memo객체를 생성하고
        IntStream.rangeClosed(1,2).forEach(i -> {
            Member memo =  Member.builder()
                    .name("name..." + i)
                    .email("email"+i+"@test.com")
                    .nickname("nickname"+i)
                    .age(10)
                    .birthday(now)
                    .build();
            // 저장한다
            memoRepository.save(memo);
        });
    }
    //조회
    @Test
    public void testSelect(){
        Long ID = 2L;
        Optional<Member> result = memoRepository.findById(ID);
        System.out.println("================");
        if(result.isPresent()){
            System.out.println("돌고있음?");
            Member mem = result.get();
            System.out.println(mem);
        }
    }




}