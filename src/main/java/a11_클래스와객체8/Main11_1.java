package a11_클래스와객체8;

// 문제 : 아래가 실행되도록 해주세요.

public class Main11_1 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        a사람.나이 = 20;
        a사람.a왼팔 = new 팔();
    }

    static class 사람 {
        // 클래스안에 변수를 정의 할 수 있다.
        int 나이;
        팔 a왼팔;
    }

    static class 팔 {

    }
}