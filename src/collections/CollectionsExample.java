package collections;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsExample {

    public static void main(String[] args) {

        int[] arr = {4,6,1,7,9,4,3};

        Arrays.sort(arr);

        //convert an array to list;

        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());





        System.out.println(list);

        // Lists
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> stackList = new Stack<>();

        arrayList.add(1);
        arrayList.remove(0);
        arrayList.add(3);
        arrayList.contains(1);
        arrayList.set(0,2);
        arrayList.sort(Integer::compareTo);

        //Maps
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        hashMap.putIfAbsent(2,3);
        hashMap.getOrDefault(2,-1);
        hashMap.containsKey(2);
        hashMap.containsValue(3);
        for (Map.Entry<Integer, Integer> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

        //Stacks
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.peek();
        while (stack.isEmpty()) {
            System.out.println(stack.pop());
        }


        //Queue
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.peekFirst();
        deque.pollLast();
        System.out.println("deque"+deque);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.peek();
        priorityQueue.poll();
        priorityQueue.isEmpty();


        for(Integer d: priorityQueue) {
            System.out.println(d);
        }

        deque.addFirst(2);
        deque.addLast(2);
        deque.removeFirst();
        deque.pollFirst();
//        deque.removeLast();

        ArrayDeque<Data> dataArrayDeque = new ArrayDeque<>();
        dataArrayDeque.addLast(new Data(2));
        dataArrayDeque.addLast(new Data(3));
        dataArrayDeque.addFirst(new Data(5));
        dataArrayDeque.addFirst(new Data(6));
        System.out.println("dataArrayDeque: "+dataArrayDeque);

        //Set
        Set<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        hashSet.add(3);
        for(Integer d: hashSet) {
            System.out.println(d);
        }


        // USing a comparator.
        Data d1 = new Data(2);
        Data d2 = new Data(5);
        Data d3 = new Data(6);
        Data d4 = new Data(1);
        Data d5 = new Data(4);
        List<Data> list1 = new ArrayList<>();
        list1.add(d1);
        list1.add(d2);
        list1.add(d3);
        list1.add(d4);
        list1.add(d5);
        list1.sort(Data::compareTo);
        System.out.println(list1);


        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.removeFirst();
        System.out.println(deque.stream().collect(Collectors.toList()));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
        maxHeap.add(2);
        maxHeap.add(1);
        maxHeap.add(4);
        System.out.println(maxHeap.peek());




    }
}


