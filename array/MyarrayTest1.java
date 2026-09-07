
class MyArray<T> {
    
    private int ptr;
    private int[] arr;

    MyArray() {
        ptr = 0;
        arr = new int[10];
    }
    int size() {
        return ptr;
    }
    int capacity() {
    return arr.length;
}

    void updrade ()
    {
        int NewSize= arr.length+(arr.length/2);
        int[] newArr = new int[NewSize];  
        for (int i = 0; i < ptr; i++) {
        newArr[i] = arr[i];
    }
     arr = newArr;
     System.out.println("created new array");
    }
    void shrink() {

    int newSize = arr.length / 2;
    if (newSize < ptr) {
        newSize = ptr;
    }

    int[] newArr = new int[newSize];

    for (int i = 0; i < ptr; i++) {
        newArr[i] = arr[i];
    }

    arr = newArr;

    System.out.println("Array shrink ho gaya. New capacity = " + arr.length);
}

    void insert(int val) {
        if (isFull())
            updrade();
        arr[ptr] = val;
        // System.out.println(val + " Element inserted at index " + ptr);
        ptr++;
    }

    void insertAtGivenIndex(int idx,int val){
         if(isFull()){
            System.out.println("Full Hai");
            return;
         }
         else if(idx < 0 || idx > ptr ) {
            System.out.println("Invalid Index");
            return;
         }
         else {
            for(int i = ptr ; i > idx ; i--){
                arr[i] = arr[i-1];
            }
            arr[idx] = val;
            ptr++;
         }

    }

    void insertAtFirst(int val){
        insertAtGivenIndex(0,val);
    }

    void insertAtLast(int val){
        insertAtGivenIndex(ptr,val);
    }

    int delete() {
        if(isEmpty()) {
            System.out.println("Array Empty hai");
            return -1;
        }
        ptr--;
         arr[ptr] = 0;
         if (ptr <= arr.length / 4 && arr.length > 10) {
          shrink();
    }
          return arr[ptr];
        
    }

    int deleteAtGivenIndex ( int idx) {
        if (isEmpty()){
            System.out.println("array is empty");
            return -1;
        }
        if (idx < 0 || idx >= ptr ) {
            System.out.println("invalid syntax");
            return -1;

        }
        int deletedValue = arr[idx];
        for (int i = idx; i < ptr - 1; i++) {
        arr[i] = arr[i + 1];
    }

    // Decrease size
    ptr--;
    arr[ptr] = 0;

    return deletedValue;
}

int DeleteGivenElement (int ele ){
    int idx= searchIndex(ele);
    return deleteAtGivenIndex(idx);
}
int DeleteAtFirst() {
    return deleteAtGivenIndex( 0);
}
    

    int searchIndex(int val) {
        for (int i = 0; i < ptr; i++) {
            if (arr[i] == val)
                return i;
        }
        return -1;
    }

    void updateIndex(int index , int newval){
        if (index < 0 || index >= ptr) {
            System.out.println("Can't update");
            return;
        }
        arr[index] = newval;
    }

    
    void updateValue(int x, int val){

        int index = searchIndex(x);
        updateIndex(index,val);
    }

    boolean isEmpty() {
        return ptr == 0;
    }

    boolean isFull(){
        return ptr == arr.length;
    }

    void print() {
        for (int i = 0; i < ptr; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class MyarrayTest1 {
    public static void main(String[] args) {
        MyArray stud = new MyArray();
        for (int i=1; i<20;i++)
        stud.insert(i*10);
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();
        stud.delete();

        // System.out.println("Number of elements: " + stud.size());
        // System.out.println("Array capacity: " + stud.capacity());

        // stud.insert(10);
        // stud.insert(20);
        // stud.insert(30);
        // stud.insert(40);
        // stud.insert(50);
        // stud.insert(60);
        // stud.insert(70);
        // stud.insert(80);
        // stud.insert(90);
        // stud.insert(100);
        // stud.insert(110);
        // stud.insert(120);
        // stud.insert(130);
        // stud.insert(140);
        // stud.insert(150);
        // stud.insert(160);

        // stud.insertAtLast(111);
        // int deleted = stud.deleteAtGivenIndex(2);
        //   System.out.println("Deleted: " + deleted);

        // stud.updateIndex(5,80);
        // stud.insertAtGivenIndex(6, 55);
        // stud.insertAtFirst(11);
        //stud.insertAtLast(111);
        // stud.insertAtLast(112);

        // stud.updateValue(40,70);

        // System.out.println("Delete element is " + stud.delete());
        stud.print();

    }

}