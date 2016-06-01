/**
 * 堆排序
 * Created by liubo on 2016/5/28.
 *
 * Note:还不是太清楚流程，后续会把思路整理一下
 */
public class HeapSort {

    //  测试主方法
    public static void main(String[] args) {
        Integer[] temp = new Integer[]{10,2,5,12,25,38,3,1};
        heapSort(temp);
        for (int i = 0; i < temp.length - 1; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    private static void heapSort(Integer[] arr){
        //  数组的大小
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            buildHeap(arr,arrLength - 1 - i);
            //  交换元素
            int temp = arr[0];
            arr[0] = arr[arrLength - 1 - i];
            arr[arrLength - 1 - i] = temp;
        }
    }

    //  构建二叉树结构(栈结构)
    private static void buildHeap(Integer[] arr,int lastIndex){
        //  找其父节点
        for (int i = (lastIndex - 1) / 2; i >= 0; i--) {
            //  记录下父节点的位置
            int maxIndex = i;
            while (maxIndex * 2 + 1 <= lastIndex){
                int biggerIndex = maxIndex * 2 + 1;
                if (biggerIndex < lastIndex){
                    if (arr[biggerIndex] < arr[biggerIndex + 1]){
                        biggerIndex ++;
                    }
                }
                if (arr[maxIndex] < arr[biggerIndex]){
                    int temp = arr[maxIndex];
                    arr[maxIndex] = arr[biggerIndex];
                    arr[biggerIndex] = temp;
                    maxIndex = biggerIndex;
                }
                else
                    break;
            }

        }
    }

}
