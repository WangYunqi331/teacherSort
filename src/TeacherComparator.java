import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher>,java.io.Serializable{
    public int compare(Teacher s1,Teacher s2){
        if(new Integer(s1.getName())>new Integer(s2.getName()))
            return 1;
        else if(new Integer(s1.getName())<new Integer(s2.getName()))
            return -1;
        else
            return 0;
    }


}
