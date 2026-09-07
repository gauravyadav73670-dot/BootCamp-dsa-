
class Myarray {
    int ptr=0;
    int [] arr=new int[10];
     boolean insert (int val){
        if (ptr==arr.length) return false;
        arr[ptr]=val;
        System.out.println("element inserted at index" +ptr);
        ptr++;
        return true;
    }
    boolean insertAtgivenIndex(int idx, int val) {

    if (ptr == arr.length) {
        return false;
    }

    if (idx < 0 || idx > ptr) {
        return false;
    }

    // Elements ko right shift karo
    for (int i = ptr; i > idx; i--) {
        arr[i] = arr[i - 1];
    }

    arr[idx] = val;
    ptr++;

    return true;
}
    void insertAtFirst(int val) {
    insertAtgivenIndex(0, val);
}
    int delete()
    {
        if(isEmpty()) 
        {
            System.out.print("array is empty");
            return -1;
        }
        ptr--;
        return arr[ptr];
    }
    
    boolean isEmpty() {
        return ptr==0;

    }
    int searchIndex (int val) {
        for (int i=0; i<ptr; i++){
            if (arr[i]==val) return i;
        }
        return -1;
    }
    boolean updateValue(int x, int val) {
    int index = searchIndex(x);

    if (index == -1) {
        return false;
    }

    arr[index] = val;
    return true;
}

    
    void print() {
    for (int i = 0; i < ptr; i++) {
        System.out.print(arr[i] + " ");
    }
}
}
public class MyarrayTest {
    public static void main(String[] args) {
        Myarray stud= new Myarray();
        stud.insert(10); 
        stud.insert(20);
        stud.insert(30);
        stud.insert(40); 
        stud.insert(50);
        stud.insert(60);
        stud.insert(70); 
        stud.insert(80);
        stud.insert(90);
    
        System.out.println("Array elements:");
        stud.print();
        // search
        int index = stud.searchIndex(20);
        System.out.println("Index of 20: " + index);
        //update
        boolean updated = stud.updateValue(20, 25);
        System.out.println("Updated: " + updated);
        System.out.println("Array after update:");
        stud.print();
        //delete
        int deleted = stud.delete();
        System.out.println("Deleted element: " + deleted);

        System.out.println("Array after deletion:");
        stud.print();



    }
    
}
