/**
 * 冒泡算法
 * Created by WifiPix-liubo on 2016/5/31.
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] temp = new Integer[]{10,2,5,12,25,38,3,1};
        bubbleSort(temp);
        for (int i = 0; i < temp.length - 1; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    public static void bubbleSort(Integer[] datas){
        int size = datas.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 -i; j++) {
                if (datas[j] < datas[j+1]){
                    //交换
                    int temp = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = temp;
                }
            }
        }
    }
}
