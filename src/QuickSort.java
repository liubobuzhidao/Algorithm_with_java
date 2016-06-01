import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 *  快速排序
 *  思路：从待排序的数组中选出一个值作为分界值，（一般是数组的第一个值），所有比这个值小的元素放到数组的左边，比它大的放到右边。
 *      然后再左右两边依次递归调用。
 * Created by liubo on 2016/6/1.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] temp = new int[]{10,2,5,12,25,38,3,1};
        quickSort(temp,0,temp.length-1);
        for (int i = 0; i <temp.length; i++) {
            System.out.print(temp[i] + ",");
        }
    }

    public static void quickSort(int[] arr,int startIndex,int endIndex){
        if (startIndex < endIndex){

            //  左边的开始值
            int i = startIndex;
            //  右边的开始值
            int j = endIndex ;
            //  默认分界值
            int midData = arr[i];

            while(i < j){
                //  从右往左找 比分界值小的数
                while (i < j && arr[j] >= midData) j--;
                if (i < j){
                    arr[i ++ ] = arr[j];    //  相当于交换了arr[i]与arr[j]，然后i指针加1
                }

                while (i < j && arr[i] < midData) i++;
                if (i < j){
                    arr[j -- ] = arr[i];    //  相当于交换了arr[i]与arr[j]，然后j指针减1
                }
            }
            arr[i] = midData;
            quickSort(arr,startIndex,i-1);
            quickSort(arr,i + 1,endIndex);
        }
    }

}
