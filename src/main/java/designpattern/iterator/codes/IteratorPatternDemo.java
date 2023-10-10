package designpattern.iterator.codes;

/**
 * @author lijiaxu
 * @Description
 * @date 2023/10/10 15:08
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        for (Iterator iterator =classroom.getIterator();iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.printf("name :%s\n",name);
        }
    }
}
