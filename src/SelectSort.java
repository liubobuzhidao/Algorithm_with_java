/**
 * 选择排序
 * Created by liubo on 2016/5/28.
 */
public class SelectSort {
    // 测试使用类
    public static void main(String[] args) {
        Integer[] temp = new Integer[]{10,2,5,12,25,38,3,1};
//      selectSortDesc(temp);
        selectSortAsc(temp);
        for (int i = 0; i <temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    /**
     *  降序排序
     * @param integers
     */
    public static void selectSortDesc(Integer[] integers){
        // 外层循环
        for (int i = 0; i < integers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] < integers[j] && integers[minIndex] < integers[j]){
                    minIndex = j;
                }
            }

            //  交换位置
            if (minIndex != i){
                int temp = integers[i];
                integers[i] = integers[minIndex];
                integers[minIndex] = temp;
            }
        }
    }

    /**
     * 升序排列
     *
     * @param array
     */
    public static void selectSortAsc(Integer[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                //  找出最小的
                if (array[i] > array[j] && array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            //  交换位置
            if (minIndex != i){
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    }

}
