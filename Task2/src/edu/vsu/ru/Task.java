package edu.vsu.ru;

public class Task {
    public static int localMax(SimpleLinkedList<Integer> list) throws SimpleLinkedList.SimpleLinkedListException {
        int maxL = 0;
        for (int i = 0; i<list.size()-2; i++){
            if (list.get(i)<list.get(i+1) && list.get(i+1)>list.get(i+2)){
                maxL+=1;
            }
        }
        return maxL;
    }
    public static int localMin(SimpleLinkedList<Integer> list) throws SimpleLinkedList.SimpleLinkedListException {
        int minL = 0;
        for (int i = 0; i<list.size()-2; i++){
            if (list.get(i)>list.get(i+1) && list.get(i+1)<list.get(i+2)){
                minL+=1;
            }
        }
        return minL;
    }
    public static SimpleLinkedList<Integer> toList(int [] arr){
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }

}
