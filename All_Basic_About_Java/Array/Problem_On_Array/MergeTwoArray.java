public class MergeTwoArray{
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] merge = new int[arr1.length + arr2.length];

        int i = 0; int j = 0;  int k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merge[k++] = arr1[i++];
            }else{
                merge[k++] = arr2[j++];
            }
        }

        while(i < arr1.length){
            merge[k++] = arr1[i++];
        }

        while(j < arr2.length){
            merge[k++] = arr2[j++];
        }

        for(int m = 0; m < merge.length; m++){
            System.out.print(merge[m] + " ");
        }
    } 
}