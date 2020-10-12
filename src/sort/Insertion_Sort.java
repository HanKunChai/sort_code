package sort;

public class Insertion_Sort {
    public Insertion_Sort(){}
    public int[] sort(int[] data){
        for(int i = 0;i<data.length;i++){
            for(int j =data.length-1;j>0;j--){
                if(data[j]<=data[j-1]){
                    int temp = data[j];
                    data[j]= data[j-1];
                    data[j-1] = temp;
                }
            }
        }



        return data;
    }
}
