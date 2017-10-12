import java.util.*;

public class SortUtils {
    public Map<Teacher,String> sort(Map a){
        TreeMap<Teacher,String> t=new TreeMap<>(new TeacherComparator());
        t.putAll(a);

        return t;
    }

    public static void main(String[] args){
        Teacher t1=new Teacher("38");
        Teacher t2=new Teacher("75");
        Teacher t3=new Teacher("24");
        Teacher t4=new Teacher("16");
        Teacher t5=new Teacher("47");
        Teacher t6=new Teacher("2");
        Teacher t7=new Teacher("7");
        Teacher t8=new Teacher("8");
        Teacher t9=new Teacher("9");
        Teacher t10=new Teacher("17");
        Teacher t11=new Teacher("3");
        Teacher t12=new Teacher("99");
        Teacher t13=new Teacher("48");
        Teacher t14=new Teacher("59");
        Teacher t15=new Teacher("49");
        Teacher t16=new Teacher("26");
        Teacher t17=new Teacher("32");
        Teacher t18=new Teacher("89");
        Teacher t19=new Teacher("62");
        Teacher t20=new Teacher("6");

        Map<Teacher,String> a=new HashMap<>();

        a.put(t1,"teacher");
        a.put(t2,"teacher");
        a.put(t3,"teacher");
        a.put(t4,"teacher");
        a.put(t5,"teacher");
        a.put(t6,"teacher");
        a.put(t7,"teacher");
        a.put(t8,"teacher");
        a.put(t9,"teacher");
        a.put(t10,"teacher");
        a.put(t11,"teacher");
        a.put(t12,"teacher");
        a.put(t13,"teacher");
        a.put(t14,"teacher");
        a.put(t15,"teacher");
        a.put(t16,"teacher");
        a.put(t17,"teacher");
        a.put(t18,"teacher");
        a.put(t19,"teacher");
        a.put(t20,"teacher");

        SortUtils s=new SortUtils();
        System.out.println(s.sort(a));
    }
}
