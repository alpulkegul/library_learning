package Arrays;

public class TekrarEdenSayilar {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return  false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 8, 6, 4, 7, 5, 4, 9, 6, 6, 8, 1, 5, 2, 3, 4, 8};
        int [] duplicateArr = new int[arr.length];
        int startIndex = 0;

        for(int indexArr = 0; indexArr < arr.length; indexArr++){
            for(int indexDublicate = 0; indexDublicate < arr.length; indexDublicate++){
                if((indexArr != indexDublicate)&&(arr[indexArr]==arr[indexDublicate]) && (arr[indexArr] % 2 == 0)){
                    if(!isFind(duplicateArr,arr[indexArr])){
                        duplicateArr[startIndex++] = arr[indexArr];
                    }
                    break;
                }
            }
        }

        for (int value : duplicateArr){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}
