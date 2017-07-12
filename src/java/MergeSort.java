package java;

/**
 *  归并排序
 * Created by liubo on 2016/6/6.
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] temp = new int[]{10,2,5,12,25,38,3,1};
        mergeSort(temp,0,temp.length-1);
        for (int i = 0; i <temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    public static void mergeSort(int[] data,int leftIndex,int rightIndex){
        if (leftIndex < rightIndex){
            //  找出中间索引
            int center = (leftIndex + rightIndex) / 2;

            //   把左边到中间的元素集合继续分摊、
            mergeSort(data,leftIndex,center);

            //  把右边到中间的元素集合继续分摊
            mergeSort(data,center + 1,rightIndex);

            //  归并
            merge(data,leftIndex,center,rightIndex);
        }
    }

    /**
     *  归并
     * @param data
     * @param leftIndex
     * @param center
     * @param rightIndex
     */
    private static void merge(int[] data, int leftIndex, int center, int rightIndex) {
        int[] temp = new int[data.length];

        int mind = center + 1;

        //  临时数据从第一队的索引开始
        int third = leftIndex;

        //  仅仅记录开始索引的位置
        int tmp = leftIndex;
        while (leftIndex <= center && mind <= rightIndex ){
            if (data[leftIndex] <= data[mind]){
                temp[third++] = data[leftIndex ++];
            }else {
                temp[third ++] = data[mind ++];
            }
        }

        //  如果第二队数组还没有走完，继续走完，将第二队右边的元素都放到临时数组后面
        while (mind <= rightIndex){
            temp[third ++] = data[mind ++];
        }

        //  如果第一队数组还没有走完，继续走完，将第一队右边的元素都放到临时数组后面
        while (leftIndex <= center){
            temp[third ++] = data[leftIndex ++];
        }

        //  将临时数组中的所有元素（排序好的）,原样覆盖到原先的数组
        while (tmp <= rightIndex){
            data[tmp] = temp[tmp ++];
        }

    }
}
