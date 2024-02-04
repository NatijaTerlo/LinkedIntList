public class LinkedIntList {
        private ListNode head;
        private int size;

        public LinkedIntList() {
            head = null;
            size = 0;
        }

        public void addFirst(int value) {
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;
            size++;
        }

        public void addLast(int value) {
            if (head == null) {
                addFirst(value);
            } else {
                ListNode newNode = new ListNode(value);
                ListNode current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                size++;
            }
        }

        public void addAtIndex(int index, int value) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            if (index == 0) {
                addFirst(value);
            } else if (index == size) {
                addLast(value);
            } else {
                ListNode newNode = new ListNode(value);
                ListNode current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                size++;
            }
        }

        public int removeFirst() {
            if (isEmpty()) {
                throw new IllegalStateException("List is empty");
            }

            int value = head.value;
            head = head.next;
            size--;
            return value;
        }

        public int removeLast() {
            if (isEmpty()) {
                throw new IllegalStateException("List is empty");
            }

            if (size == 1) {
                return removeFirst();
            }

            ListNode current = head;
            ListNode previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }

            previous.next = null;
            size--;
            return current.value;
        }

        public int removeAtIndex(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            if (index == 0) {
                return removeFirst();
            } else if (index == size - 1) {
                return removeLast();
            } else {
                ListNode current = head;
                ListNode previous = null;
                for (int i = 0; i < index; i++) {
                    previous = current;
                    current = current.next;
                }

                previous.next = current.next;
                size--;
                return current.value;
            }
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Invalid index");
            }

            ListNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;

        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }
    }

