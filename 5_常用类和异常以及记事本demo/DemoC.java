package pro190908;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 时间日期相关
public class DemoC {
    public static void a() {
        // 获取到系统当前的时间
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();// 获取到当前与1970年1月1日0:0:0的毫秒差
        System.out.println(time);
        int year = date.getYear()+1900;// 计算机元年是1900年
        int month = date.getMonth()+1;// 月份是从0开始计算的，0到11
        int day = date.getDate();// 注意：getDate()方法是获取天数
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();
        // 星期是从0开始计算的，0是星期天，1到6是星期一到星期六
        int week = date.getDay();// 注意：getDay()方法是获取星期数
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(week);
    }

    public static void b() {
        Date date = new Date();
        // 对时间进行格式化
        /*
        这一行代码确立了转换的格式，其中 yyyy 是完整的公元年，MM 是月份，dd 是日期，HH:mm:ss 是时、分、秒
        注意:有的格式大写，有的格式小写，例如 MM 是月份，mm 是分；HH 是 24 小时制，而 hh 是 12 小时制
        出处：菜鸟教程
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String formatDate = sdf.format(date);
        System.out.println(formatDate);
    }

    public static void c() {
        // 产生一个时间日历类对象
        Calendar calendar = Calendar.getInstance();// 此类不可以new，因为是一个抽象方法
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;// 这里的月份也是从0开始计算的，0到11
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
    }

    public static void main(String[] args) {
        //a();
        //b();
        //c();
    }
}
