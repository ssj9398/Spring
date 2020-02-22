package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	@Autowired
	MemberRepository memberRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		memberRepository.save(new MemberVO("a", 10));
		memberRepository.save(new MemberVO("b", 15));
		memberRepository.save(new MemberVO("c", 10));
		memberRepository.save(new MemberVO("a", 5));
		Iterable<MemberVO> list1 = memberRepository.findAll();
		System.out.println("findAll() Method.");
		for (MemberVO m : list1) {
			System.out.println(m.toString());
		}
		
		System.out.println("findByUserNameAndAgeLessThan() Method.");
		List<MemberVO> list2 = memberRepository.findByUsernameAndAgeLessThan("a", 10);
		for (MemberVO m : list2) {
			System.out.println(m.toString());
		}
		System.out.println("findByUserNameAndAgeLessThanSQL() Method.");
		List<MemberVO> list3 = memberRepository.findByUsernameAndAgeLessThanSQL("a", 10);
		for (MemberVO m : list3) {
			System.out.println(m.toString());
		}
		System.out.println("findByUserNameAndAgeLessThanSQL() Method.");
		List<MemberVO> list4 = memberRepository.findByUsernameAndAgeLessThanOrderByAgeDesc("a", 15);
		for (MemberVO m : list4) {
			System.out.println(m.toString());
		}
		//memberRepository.deleteAll();
	}

}
