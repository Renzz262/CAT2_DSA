public class CustomLinkedList {

    // Each element holds a numeric value and a reference to the next element.
    private static class Element {
        int value;
        Element next;

        // Constructs a new element with the given numeric value.
        Element(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // 'first' points to the initial element in the collection (or null if empty).
    private Element first;

    // Creates an empty linked list.
    public LinkedList() {
        first = null;
    }

    // Adds a new element at the start of the sequence.
    public void addAtStart(int value) {
        Element newElement = new Element(value);
        newElement.next = first; // Link new element to the previous first
        first = newElement;       // New element becomes the first
    }

    // Adds a new element at the conclusion of the sequence.
    public void addAtEnd(int value) {
        Element newElement = new Element(value);
        if (first == null) {
            // If empty, assign the new element as first.
            first = newElement;
        } else {
            // Traverse the structure until the last element.
            Element current = first;
            while (current.next != null) {
                current = current.next;
            }
            // Append the new element at the last position.
            current.next = newElement;
        }
    }

    // Deletes the element at the front.
    // If empty, displays a message instead.
    public void removeFromStart() {
        if (first == null) {
            System.out.println("The collection is vacant. No element to eliminate.");
        } else {
            // Move 'first' to the subsequent element, eliminating the first.
            first = first.next;
        }
    }

    // Displays all elements, beginning with 'first' and following each 'next' reference.
    public void displayList() {
        Element current = first;
        while (current != null) {
            System.out.print(current.value + " => ");
            current = current.next;
        }
        System.out.println("null"); // Denotes the end of the structure.
    }

    // A simple demonstration verifying the addition and removal operations.
    public static void main(String[] args) {
        CustomLinkedList collection = new CustomLinkedList();

        // Add multiple elements at the start.
        collection.addAtStart(15);
        collection.addAtStart(25);

        // Add an element at the conclusion.
        collection.addAtEnd(40);

        // Display the collection to confirm additions.
        System.out.println("Linked Structure after additions:");
        collection.displayList(); // Expected: 25 => 15 => 40 => null

        // Remove the first element and display again.
        collection.removeFromStart();
        System.out.println("Linked Structure after front deletion:");
        collection.displayList(); // Expected: 15 => 40 => null
    }
}
