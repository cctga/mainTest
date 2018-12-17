package sort;

import java.util.Comparator;
import java.util.Objects;

public class SortObj implements Comparator<SortObj> {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(SortObj o1, SortObj o2) {
        String name1=o1.getName();
        String name2=o2.getName();
        if(o1.equals(o2)){
            return 0;
        }
        return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortObj sortObj = (SortObj) o;
        return age == sortObj.age &&
                Objects.equals(name, sortObj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
