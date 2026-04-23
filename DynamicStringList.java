
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
    for (int i = 0; i < myArr.length; i++) {
        }
        return myArr[index];
    }
    
}