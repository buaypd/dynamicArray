
public class DynamicStringList implements StringList {

    public int index;
    public String[] myArr;
    public String[] myNewArr;
    public String value;



    public DynamicStringList(int index, String[] myArr, String[] myNewArr, String value){
        this.index = index;
        this.myArr = myArr;
        this.myNewArr = myNewArr;
        this.value = value;
    }

    public String get(int index){
        return myArr[index];
    }
    
    public void set(int index, String value){
        for (int i = 0; i < myArr.length; i++) {
            if(i == index){
                myArr[i] = value;
            }
        }
    }
    
}