package sort;

public class buble_sort {
    public buble_sort() {

    }
    public int[] sort(int[] data){
        for (int i = 0;i<data.length-1;i++){
            for (int j = 0;j<data.length-1-i;j++){
                if(data[j]>data[j+1]) {
                    int buffer = data[j+1];
                    data[j+1] = data[j];
                    data[j] = buffer;
                }
            }
        }
        return data;
    }
//    public void swap(int a, int b){
//        int buffer=a;
//        a=b;
//        b=buffer;
//    }
}
