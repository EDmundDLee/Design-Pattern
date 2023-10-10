package designpattern.iterator.codes;

/**
 * @author lijiaxu
 * @Description 实现获取迭代器的接口
 * @date 2023/10/10 15:05
 */
public class Classroom implements Container{

    public String[] names = {"Robert" , "John" ,"Julie" , "Lora"};


    @Override
    public Iterator getIterator() {
        return new ClassroomIterator();
    }


    private class ClassroomIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
