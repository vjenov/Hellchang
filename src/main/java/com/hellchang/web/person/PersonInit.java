package com.hellchang.web.person;


import com.hellchang.web.proxy.Proxy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class PersonInit extends Proxy implements ApplicationRunner  {
	@SuppressWarnings("unused")
	private PersonRepository personRepository;
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	public PersonInit(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
	}
	/*
	 * @Override public void run(ApplicationArguments args) throws Exception { long
	 * count = personRepository.count(); if (count == 0) { Person person = null;
	 * String[][] mtx = { {"hong", "1", "홍길동", "1980-01-01", "true", "4", "2", "70",
	 * "legend"}, {"kim", "1", "김유신", "1980-05-05", "true", "4", "2", "90",
	 * "legend"}, {"park", "1", "박지성", "1981-06-05", "true", "2", "1", "80",
	 * "retired"}, {"harden", "1", "제임스하든", "1988-08-14", "true", "2", "1", "90",
	 * "player"}, {"jordan", "1", "마이클조던", "1963-02-17", "true", "3", "1", "100",
	 * "legend"}, {"johnson", "1", "매직존슨", "1977-03-13", "true", "3", "2", "95",
	 * "coach"}, {"james", "1", "르브론제임스", "1986-04-21", "true", "2", "2", "85",
	 * "player"}, {"doncic", "1", "루카돈치치", "1999-12-25", "true", "1", "1", "90",
	 * "player"}, {"bird", "1", "래리버드", "1975-09-29", "true", "3", "1", "85",
	 * "coach"}, {"oneal", "1", "샤킬오닐", "1982-04-06", "true", "3", "2", "90",
	 * "legend"}, {"leonard", "1", "카와이레너드", "1990-07-06", "true", "1", "2", "90",
	 * "player"}, {"durant", "1", "케빈듀란트", "1988-03-15", "true", "1", "1", "95",
	 * "player"}, {"walker", "1", "카일워커", "1988-06-15", "true", "1", "2", "80",
	 * "player"}, {"curry", "1", "스테판커리", "1990-05-24", "true", "2", "1", "80",
	 * "player"}, {"thomson", "1", "클레이탐슨", "1991-11-09", "true", "2", "1", "80",
	 * "player"}, {"davis", "1", "앤써니데이비스", "1991-12-01", "true", "2", "2", "85",
	 * "player"}, {"olajuwon", "1", "하킴올라주원", "1973-11-17", "true", "4", "1", "95",
	 * "coach"}, {"chamberlain", "1", "윌트체임벌린", "1965-02-27", "true", "4", "1",
	 * "95", "legend"}, {"george", "1", "폴조지", "1990-08-18", "true", "2", "2", "90",
	 * "player"}, {"westbrook", "1", "러셀웨스트브룩", "1990-06-01", "true", "2", "2",
	 * "75", "player"}, {"irving", "1", "카이리어빙", "1991-10-26", "true", "1", "2",
	 * "85", "player"}, {"dunkan", "1", "팀던컨", "1976-04-25", "true", "3", "2", "90",
	 * "retired"}, {"nowitzki", "1", "더크 노비츠키", "1978-06-19", "true", "3", "2",
	 * "90", "retired"}, {"porzingis", "1", "크리스탑스 포르징기스", "1995-08-02", "true",
	 * "1", "1", "80", "player"}, {"antetokounmpo", "1", "야니스 아테토쿤보", "1994-12-06",
	 * "true", "1", "2", "90", "player"}, {"embiid", "1", "조엘 엠비드", "1994-03-16",
	 * "true", "1", "2", "80", "player"}, {"simmons", "1", "벤 시몬스", "1996-07-20",
	 * "true", "1", "2", "70", "player"}, {"ball", "1", "론조볼", "1998-06-14", "true",
	 * "1", "1", "70", "player"}, {"kuzma", "1", "카일쿠즈마", "1998-04-19", "true", "1",
	 * "1", "73", "player"}, {"bryant", "1", "코비 브라이언트", "1978-08-23", "true", "3",
	 * "1", "90", "legend"}, {"pippen", "1", "스카티 피펜", "1965-06-26", "true", "3",
	 * "1", "90", "retired"}, {"you", "1", "유관순", "1985-09-09", "false", "4",
	 * "1","90", "legend"}}; for (String[] arr : mtx) { person = new Person();
	 * person.setUserid(arr[0]); person.setPasswd(arr[1]); person.setName(arr[2]);
	 * person.setBirthday(df.parse(arr[3]));
	 * person.setMale(Boolean.parseBoolean(arr[4])); person.setHak(integer(arr[5]));
	 * person.setBan(integer(arr[6])); person.setScore(integer(arr[7]));
	 * person.setRole(arr[8]); personRepository.save(person); } }
	 * 
	 * }
	 */

}