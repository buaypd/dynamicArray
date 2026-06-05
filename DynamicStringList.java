
public class DynamicStringList implements StringList {

    public int index;
    public String[] myArr;
    public String[] myNewArr;
    public String value;
    public int size;



    public DynamicStringList(int index, String[] myArr, String[] myNewArr, String value){
        this.index = index;
        this.myArr = myArr;
        this.myNewArr = myNewArr;
        this.value = value;
    }
    @Override
    public String get(int index){
        return myArr[index];
    }
    
    @Override
    public void set(int index, String value) throws IndexOutOfBoundsException{
        for (int i = 0; i < myArr.length; i++) {
            if (i > myArr.length || i < 0){
                throw new IndexOutOfBoundsException("Index is less then 0 or Greater then the length of the array");
            }
            if(i == index){
                myArr[i] = value;
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

      @Override
    public void add(String value) {
        // Resize if array is full
        if (size == myArr.length) {
            String[] newArr = new String[myArr.length * 2];
        }
        for (int i = 0; i < size; i++) {
            newArr[i] = myArr[i];
        }
        
        myArr = newArr;
        // add value to the end;
        myArr[size] = value;
        size++;
    }
    @Override
    public int capacity() {
        return myArr.length;
    }
}