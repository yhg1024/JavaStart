package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
         byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2137383647; // -2,147,483,648 ~ 2,147,483,647 (약 200억), 정수 기본 (4byte)
        long l = 9223372036854775807L; // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        float f = 10.0f;
        double d = 10.0; // float 보다 정밀도가 좋다. 실수 기본
    }
}
