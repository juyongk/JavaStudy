package ex07string;

import java.util.Scanner;

public class E02StringMethod4 {

	public static void main(String[] args) {
		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
//		System.out.println("주민번호를 입력하세요.");
//		Scanner scanner = new Scanner(System.in);
//		String jumin = scanner.next();
//		char ch = jumin.charAt(7);
//		if(ch=='3') {
//			System.out.println("남자입니다.");
//		}
//		else if(ch=='4') {
//			System.out.println("여자입니다.");
//		}
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/
		
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/	
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		String filename = "my.file.images.jpg";
		int beginindex = filename.lastIndexOf(".")+1;
		System.out.println("파일의 확장자는:"+ filename.substring(beginindex));
	}
}
