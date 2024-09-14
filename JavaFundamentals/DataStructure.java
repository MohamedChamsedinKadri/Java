package JavaFundamentals;
import java.util.*;

public class DataStructure {
    
    // Array
    private static void arrayExample() {
        System.out.println("Array Example:");
        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println("Element at index 0: " + array[0]);
        System.out.println("Array length: " + array.length);
        System.out.println();
    }

    // Linked List
    private static void linkedListExample() {
        System.out.println("Linked List Example:");
        LinkedList<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        list.add(1, "Inserted");
        System.out.println("Element at index 1: " + list.get(1));
        list.set(1, "Updated");
        System.out.println("Updated element at index 1: " + list.get(1));
        list.remove(1);
        System.out.println("List after removal: " + list);
        System.out.println("Size of list: " + list.size());
        System.out.println();
    }

    // Stack
    private static void stackExample() {
        System.out.println("Stack Example:");
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println();
    }

    // Queue
    private static void queueExample() {
        System.out.println("Queue Example:");
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        System.out.println("Head of queue: " + queue.peek());
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
        System.out.println();
    }

    // Hashtable
    private static void hashtableExample() {
        System.out.println("Hashtable Example:");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        System.out.println("Value for 'One': " + hashtable.get("One"));
        System.out.println("Contains key 'Two': " + hashtable.containsKey("Two"));
        System.out.println("Hashtable size: " + hashtable.size());
        hashtable.remove("One");
        System.out.println("Hashtable after removal: " + hashtable);
        System.out.println();
    }

    // TreeMap
    private static void treeMapExample() {
        System.out.println("TreeMap Example:");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        System.out.println("Value for 'One': " + treeMap.get("One"));
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        treeMap.remove("One");
        System.out.println("TreeMap after removal: " + treeMap);
        System.out.println();
    }

    // PriorityQueue (Heap)
    private static void priorityQueueExample() {
        System.out.println("PriorityQueue (Heap) Example:");
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        heap.offer(30);
        heap.offer(10);
        heap.offer(20);
        System.out.println("Minimum element: " + heap.peek());
        System.out.println("Removed element: " + heap.poll());
        System.out.println("Heap after removal: " + heap);
        System.out.println();
    }

    public static void main(String[] args) {
        arrayExample();
        linkedListExample();
        stackExample();
        queueExample();
        hashtableExample();
        treeMapExample();
        priorityQueueExample();
    }
}
