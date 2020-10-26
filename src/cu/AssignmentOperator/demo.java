package cu.AssignmentOperator;

public class demo {
    public static void main(String[] args) {
        /**
         * 赋值运算符：用于给变量赋值的运算符
         * ①：扩展赋值运算符的好处：省略了强制类型转换的操作
         *  int a = 10;
         *  a+=20;//相当于 a = a + 20
         */
        //基本的赋值运算符
        int a = 10; // 把10赋值给变量
        System.out.println("a: " + a);

        System.out.println("===========================");

        //扩展赋值运算符
        //+=的作用：把左右两边的数据相加，然后把结果给左边
        a += 20;
        System.out.println("a: " + a);
        System.out.println("===========================");

        //扩展赋值运算符的好处
        short s = 2;
//        s = s + 1;//s + 1 是int类型
      //①：强制类型转换
        /*s = (short)(a + 1);
        System.out.println("a: " + a);*/

        //②通过扩展赋值运算符实现
        s+=3;
        System.out.println("s: " + s);
    }
}
