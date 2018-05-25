import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Tettse
 *
 * @author Lu
 * @date 2018-05-18 14:03
 */
public class Tettse {
    public static void universalMethod(Object obj, Method method) {
        try {
            method.invoke(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void method1(int i) {
        System.out.println(i);
    }

    public static void main(String[] args) {
//        universalMethod(this, method1);
        //        long t = System.currentTimeMillis();
        //        int nano1 = 999998;
        //        int nano2 = 999997;
        //
        //        Timestamp t1 = new Timestamp(t);
        //        Timestamp t2 = new Timestamp(t);
        //
        //        System.out.println(t1);
        //        System.out.println(t2);
        //        t1.setNanos(t1.getNanos() + nano1);
        //        t2.setNanos(t2.getNanos() + nano2);
        //        System.out.println(t1);
        //        System.out.println(t2);
        //
        //        Date d1 = new Date(t + 1);
        //        Date d2 = new Date(t);
        //        System.out.println(d1);
        //        System.out.println(d2);
        //        Calendar calendar = Calendar.getInstance();
        //        System.out.println(d1.equals(d2));
        //
        //        System.out.println(t1.compareTo(t2));

    }
}
