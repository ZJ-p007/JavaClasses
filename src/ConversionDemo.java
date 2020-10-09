public class ConversionDemo {
    public static void main(String[] args) {
        //定义两个int类型变量
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);
        System.out.println("----------------------------------------");

        //定义一个int类型数据和一个byte数据类型
        int aa = 10;
        byte bb = 20;
        System.out.println(aa + bb);
        int cc = aa + bb;
        System.out.println(cc);
        //byte cc = aa + bb;//为什么报错：byte和int计算，先将byte提升为int计算,结果·是int
        System.out.println("-----------------------------------------");

        //用byte类型的变量接收aa + bb,可以通过强制类型转换
        //目标类型 变量名 = （目标类型）要转换的值
        byte dd = (byte)(aa + bb);//强制转换
        System.out.println(dd);
        System.out.println("-------------------------");

        double d1 = 3.14;
        int a1 = (int)d1;//将double的结果值强制类型转换为整数F
        System.out.println(a1);
      //https://github.com/ZJ-p007/FirstJava.git
    }
}
