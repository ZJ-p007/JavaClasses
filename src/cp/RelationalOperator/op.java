package cp.RelationalOperator;

public class op {
    /**
     * 关系运算符
     * 定义:关系运算符是用来描述两个变量之间的关系的
     */
    public static void main(String[] args) {
        //定义三个变量
        int a = 10;
        int b= 20;
        int c = 10;

        //== :等于
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println("====================");

        //！=不等于
        System.out.println(a != b);
        System.out.println(a != c);
        System.out.println("=======================");

        //>大于
        System.out.println(a > b);
        System.out.println(a > c);
        System.out.println("======================");

        //<小于
        System.out.println(a < b);
        System.out.println(a < c);

    }

}
