package sort;

public class Select_sort {
    public Select_sort(){}
    public int[] sort(int[] data) {
        for(int i = 0;i<data.length-1;i++){
            int min_index=i,min_value;
            for (int j = i+1;j<data.length;j++){
                if(data[j]<data[min_index]) min_index=j;
            }
            int temp = data[i];
            data[i] = data[min_index];
            data[min_index] = temp;
        }


        return data;
    }
}
