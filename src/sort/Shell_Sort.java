package sort;

public class Shell_Sort {
    public Shell_Sort(){}
    public int[] sort(int[] data){
        int len = data.length;
        for(int gap = (len/2);gap>0;gap=(gap/2)){
            for(int i = gap;i<len;i++){
                int j = i;
                int current=data[i];
                while(j-gap>=0&&current<data[j-gap]){
                    data[j]= data[j-gap];
                    j=j-gap;
                }
                data[j]= current;
            }
        }
        return data;
    }
}
