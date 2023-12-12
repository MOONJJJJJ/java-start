package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f;
        double d = 10.0;

        //실무에선 사실상 int / long / double / String / boolean 만 씀
//        자바 언어의 관례 한번에 정리
//        클래스는 대문자로 시작, 나머지는 소문자로 시작
//        자바에서 클래스 이름의 첫 글자는 대문자로 시작한다. 그리고 나머지는 모두 첫 글자를 소문자로 시작한다. 여기
//        에 낙타 표기법을 적용하면 된다. 이렇게 하면 모든 자바 관례를 다 외울 수 있다!
//                예시: 클래스는 첫 글자 대문자, 나머지는 모두 첫 글자 소문자로 시작 + 낙타 표기법
//        클래스: Person , OrderDetail
//        변수를 포함한 나머지: firstName , userAccount
//        여기에 예외가 딱 2개 있다.
//        상수는 모두 대문자를 사용하고 언더바로 구분한다. (상수는 뒤에서 학습)
//        USER_LIMIT
//        패키지는 모두 소문자를 사용한다. (패키지는 뒤에서 학습)
//        org.spring.boot
    }
}
