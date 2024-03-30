//Print Name N times using Recursion.

package Data_Structures.Basic_Recursion;

public class PrintName {
    static void func(int i, int n){
        if(i>n) return;
        System.out.println("venkat");
        func(i+1,n);

}
public static void main(String[] args) {
    int n = 4;
    func(1,n);
    }
}
//Time Complexity: O(N),space Complexity: O(N)
