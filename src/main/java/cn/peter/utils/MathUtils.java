package cn.peter.utils;

/**
 * @author Peter Yu 2018/9/7 16:36
 */
public class MathUtils {

    private MathUtils() {
    }

    public static class SubMath{

        public static int add(int a, int b){
            if (a < 0 || b < 0){
                return 0;
            }
            return a + b;
        }

        public static int minus(int a, int b){
            return a - b;
        }

    }
}
