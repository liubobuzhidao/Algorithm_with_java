/**
 *
 *  直接插入法
 *
 * Created by liubo on 2016/6/5.
 */
public class InsertSort {

    public static void main(String[] args) {

        int[] temp = new int[]{10,2,5,12,25,38,3,1};
        insertSort(temp);
        for (int i = 0; i <temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }


    public static void insertSort(int[] data){

        for (int i = 1; i < data.length; i++) {
            if(data[i] < data[i-1]){
                int temp = data[i];
                int j = i - 1;

                for (; j >= 0 && data[j] > temp ; j --) {
                    data[j + 1] = data[j];
                }
                data[j + 1] = temp;

            }
        }
    }
}
