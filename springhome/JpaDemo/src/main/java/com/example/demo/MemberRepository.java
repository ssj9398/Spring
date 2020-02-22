package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends CrudRepository<MemberVO, Long> {
	List<MemberVO> findByUsernameAndAgeLessThan(String username, int age);

	@Query("select t from Member t where username= :username and age < :age")
	List<MemberVO> findByUsernameAndAgeLessThanSQL(@Param("username") String username, @Param("age") int age);

	List<MemberVO> findByUsernameAndAgeLessThanOrderByAgeDesc(String username, int age);
}
