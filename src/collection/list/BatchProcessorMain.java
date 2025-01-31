package collection.list;

import collection.link.MyLinkedListV3;

public class BatchProcessorMain {

    public static void main(String[] args) {
//        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(1_000_000);

    }
}
