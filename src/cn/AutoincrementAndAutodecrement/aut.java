package cn.AutoincrementAndAutodecrement;

public class aut {
    public static void main(String[] args) {
        //定义一个int类型的变量
        int a = 5;

        //单独使用
       /* a++;

        //下述输出语句结果是:字符串"a‘和变量进行拼接
        System.out.println("a: " +  a);*/

       //参与运算
       /* //++在后
        int b = a++;
        System.out.println("a:" + a);
        System.out.println("b:" + b);*/

        //++在前
        int b = ++a;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}
