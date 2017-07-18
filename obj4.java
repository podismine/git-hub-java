import javax.xml.crypto.Data;

/**
 * Created by Administrator on 2017/7/18.
 */
public class obj4 {
    public static void main(String[] args) {
        class DataOnly{
            int i;
            double d;
            boolean b;
            void display(){
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }

        }
        DataOnly data=new DataOnly();
        data.i=47;
        data.d=1.1;
        data.b=false;
        data.display();
    }
}
