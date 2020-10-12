package sort;

import java.util.ArrayList;
import java.util.Stack;

public class Merge_sort {
    public Merge_sort(){}
    private int[] merge(int[] left, int[] right){
        int[] result=new int[left.length+right.length];
        Stack<Integer> res =new Stack<>();
        ArrayList<Integer> l = new ArrayList<>(),r=new ArrayList<>();
        for(int value:left) l.add(value);
        for(int value:right) r.add(value);
        while (l.size()>0&&r.size()>0) {
            if (l.get(0)<=r.get(0)){
                res.push(l.get(0));
                l.remove(0);
            }
            else {
                res.push(r.get(0));
                r.remove(0);
            }
        }
        while (l.size()==1) {
            res.push(l.get(0));
            l.remove(0);
        }
        while (r.size()==1) {
            res.push(r.get(0));
            r.remove(0);
        }
        for(int i = result.length-1;i>=0;i--) {
            result[i] = res.pop();
            System.out.println(result[i]);
        }
        return result;
    }
    public int[] sort(int[] data){
        ArrayList<Integer> datA = new ArrayList<>();
        for (int value : data) datA.add(value);
        return final_sort(datA);
    }
    public int[] final_sort (ArrayList<Integer> data){
        int len = data.size();
        if(len<2){
            return data.stream().mapToInt(Integer::valueOf).toArray();
        }
        ArrayList<Integer> left,right;
        left = new ArrayList<>(data.subList(0, len / 2));
        right = new ArrayList<>(data.subList(len / 2, len - 1));
        return merge(final_sort(left),final_sort(right));

    }
}
