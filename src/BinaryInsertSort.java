/**
 *  折半插入法
 * Created by liubo on 2016/6/6.
 */
public class BinaryInsertSort {


    public static void main(String[] args) {
        int[] temp = new int[]{10,2,5,12,25,38,3,1};
        binaryInsertSort(temp);
        for (int i = 0; i <temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    public static void binaryInsertSort(int[] data){
        for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            int low = 0;
            int hight = i - 1;
            while (low <= hight){
                int mind = (low + hight) / 2;
                if (temp > data[mind]){
                    low  =  mind + 1;
                }else{
                    hight = mind - 1;
                }
            }

            for(int j = i;j > low;j -- ){
                data[j] = data[j - 1];
            }
            data[low] = temp;
        }
    }

}
