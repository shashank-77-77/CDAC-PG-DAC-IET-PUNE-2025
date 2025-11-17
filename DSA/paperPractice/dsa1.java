// Project: Assignments - Arrays, Sorting, Linked Lists
// For each requirement below there are three files: Bean (model), DAO (logic), Test (driver)
// Package structure used: arrays.q1, arrays.q2, arrays.copy, sorting.*, linkedlist.*
// ---------------------------------------------------------------
// ARRAYS - Single Dimensional (Task Group 1)
// ---------------------------------------------------------------

// File: arrays/q1/NumberBean.java
package arrays.q1;
public class NumberBean {
    private int[] arr;
    public NumberBean(int[] arr){ this.arr = arr; }
    public int[] getArr(){ return arr; }
}

// File: arrays/q1/NumberDAO.java
package arrays.q1;
import java.util.*;
public class NumberDAO {
    // 1.1 sum of digits of every number
    public int[] sumOfDigits(NumberBean b){
        int[] a = b.getArr();
        int[] out = new int[a.length];
        for(int i=0;i<a.length;i++){
            int x = Math.abs(a[i]);
            int s = 0;
            while(x>0){ s += x%10; x/=10; }
            out[i] = s;
        }
        return out;
    }

    // helper prime check
    private boolean isPrime(int x){ if(x<=1) return false; if(x<=3) return true; if(x%2==0) return false; for(int i=3;i*i<=x;i+=2) if(x%i==0) return false; return true; }

    // 1.2 factorial of only prime numbers in array
    public Map<Integer, Long> factorialOfPrimes(NumberBean b){
        Map<Integer, Long> map = new LinkedHashMap<>();
        for(int v: b.getArr()){
            if(isPrime(v)) map.put(v, factorial(v));
        }
        return map;
    }
    private long factorial(int n){ long f=1; for(int i=2;i<=n;i++) f*=i; return f; }

    // 1.3 find maximum prime
    public Integer maxPrime(NumberBean b){
        Integer max=null; for(int v: b.getArr()) if(isPrime(v)) { if(max==null||v>max) max=v; }
        return max;
    }

    // 1.4 copy array with modification: if prime and <5 then copy reverse of number else copy number
    public int[] copyWithRule(NumberBean b){
        int[] a=b.getArr(); int[] out=new int[a.length];
        for(int i=0;i<a.length;i++){
            int v=a[i];
            if(isPrime(v) && v<5) out[i]=reverseNumber(v);
            else out[i]=v;
        }
        return out;
    }
    private int reverseNumber(int n){ int x=Math.abs(n), r=0; while(x>0){ r=r*10 + x%10; x/=10; } return (n<0)? -r : r; }

    // 1.5 bucket strings by 2nd character into a fixed-size array of size 20
    // Behavior: accept strings until -1 sentinel; pack them so that strings with same 2nd char stay together
    public String[] bucketBySecondChar(List<String> inputs){
        int capacity=20; String[] out = new String[capacity]; Arrays.fill(out, null);
        // Map second char -> list of strings
        Map<Character, List<String>> map = new LinkedHashMap<>();
        List<String> noSecondChar = new ArrayList<>();
        for(String s: inputs){
            if(s==null) continue;
            if(s.length()<2) { noSecondChar.add(s); continue; }
            char key = s.charAt(1);
            map.computeIfAbsent(key, k->new ArrayList<>()).add(s);
        }
        // flatten respecting insertion order of map
        List<String> flattened = new ArrayList<>();
        for(Map.Entry<Character, List<String>> e: map.entrySet()) flattened.addAll(e.getValue());
        flattened.addAll(noSecondChar);
        for(int i=0;i<capacity && i<flattened.size(); i++) out[i]=flattened.get(i);
        return out;
    }
}

// File: arrays/q1/TestNumbers.java
package arrays.q1;
import java.util.*;
public class TestNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for array: "); int n = sc.nextInt();
        int[] a = new int[n]; System.out.println("Enter numbers:");
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        NumberBean bean = new NumberBean(a);
        NumberDAO dao = new NumberDAO();

        System.out.println("Sum of digits for each: " + Arrays.toString(dao.sumOfDigits(bean)));
        System.out.println("Factorial of primes: " + dao.factorialOfPrimes(bean));
        System.out.println("Maximum prime: " + dao.maxPrime(bean));
        System.out.println("Copy with rule: " + Arrays.toString(dao.copyWithRule(bean)));

        // string bucketing demo
        sc.nextLine();
        System.out.println("Enter strings (enter -1 to stop). Max 20 will be stored.");
        List<String> inputs = new ArrayList<>();
        while(true){ String s = sc.nextLine(); if(s.equals("-1")) break; inputs.add(s); }
        String[] bucketed = dao.bucketBySecondChar(inputs);
        System.out.println("Bucketed array:");
        for(int i=0;i<bucketed.length;i++) System.out.println(i+": "+bucketed[i]);
    }
}

// ---------------------------------------------------------------
// ARRAYS - 2D (Task Group 2)
// ---------------------------------------------------------------

// File: arrays/q2/MatrixBean.java
package arrays.q2;
public class MatrixBean{
    private int[][] mat;
    public MatrixBean(int[][] m){ this.mat = m; }
    public int[][] getMat(){ return mat; }
}

// File: arrays/q2/MatrixDAO.java
package arrays.q2;
import java.util.*;
public class MatrixDAO{
    // 2.1 reverse every row
    public void reverseRows(MatrixBean b){
        int[][] m = b.getMat();
        for(int i=0;i<m.length;i++){
            int l=0, r=m[i].length-1;
            while(l<r){ int t=m[i][l]; m[i][l]=m[i][r]; m[i][r]=t; l++; r--; }
        }
    }
    // 2.2 max odd number in every row
    public Integer[] maxOddPerRow(MatrixBean b){
        int[][] m = b.getMat(); Integer[] res = new Integer[m.length];
        for(int i=0;i<m.length;i++){ Integer mx=null; for(int v: m[i]) if(v%2!=0){ if(mx==null||v>mx) mx=v; } res[i]=mx; }
        return res;
    }
    // 2.3 average each row & column, then sum all row averages and all column averages
    public Map<String, Double> averages(MatrixBean b){
        int[][] m = b.getMat(); int rows=m.length, cols=(rows>0?m[0].length:0);
        double[] rowAvg = new double[rows]; double[] colAvg = new double[cols];
        for(int i=0;i<rows;i++){
            double sum=0; for(int j=0;j<cols;j++) sum+=m[i][j]; rowAvg[i]= (cols>0? sum/cols:0);
        }
        for(int j=0;j<cols;j++){
            double sum=0; for(int i=0;i<rows;i++) sum+=m[i][j]; colAvg[j] = (rows>0? sum/rows:0);
        }
        double totalRowAvg=0, totalColAvg=0;
        for(double v: rowAvg) totalRowAvg+=v; for(double v: colAvg) totalColAvg+=v;
        Map<String, Double> map = new LinkedHashMap<>();
        map.put("totalRowAverages", totalRowAvg);
        map.put("totalColAverages", totalColAvg);
        return map;
    }
}

// File: arrays/q2/TestMatrix.java
package arrays.q2;
import java.util.*;
public class TestMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Rows: "); int r=sc.nextInt(); System.out.print("Cols: "); int c=sc.nextInt();
        int[][] m = new int[r][c]; System.out.println("Enter matrix row-wise:");
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=sc.nextInt();
        MatrixBean bean = new MatrixBean(m);
        MatrixDAO dao = new MatrixDAO();
        dao.reverseRows(bean);
        System.out.println("Matrix after reversing rows:"); for(int i=0;i<r;i++) System.out.println(Arrays.toString(m[i]));
        System.out.println("Max odd per row: " + Arrays.toString(dao.maxOddPerRow(bean)));
        System.out.println("Totals: " + dao.averages(bean));
    }
}

// ---------------------------------------------------------------
// SORTING ALGORITHMS (Task Group 3)
// ---------------------------------------------------------------

// 3.1 Employee class + bubble sort by salary then accept 5 more using insertion sort
// File: sorting/q1/EmployeeBean.java
package sorting.q1;
public class EmployeeBean{ private int empId; private String ename; private double salary; public EmployeeBean(int id,String name,double sal){ this.empId=id; this.ename=name; this.salary=sal;} public int getId(){return empId;} public String getName(){return ename;} public double getSalary(){return salary;} public void setSalary(double s){salary=s;} public String toString(){return empId+":"+ename+":"+salary;} }

// File: sorting/q1/EmployeeDAO.java
package sorting.q1;
import java.util.*;
public class EmployeeDAO{
    // bubble sort by salary on array portion length 'len'
    public void bubbleSort(EmployeeBean[] arr, int len){
        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j].getSalary() > arr[j+1].getSalary()){
                    EmployeeBean t=arr[j]; arr[j]=arr[j+1]; arr[j+1]=t;
                }
            }
        }
    }
    // insertion sort to insert a single element into existing sorted prefix of size 'len'
    public void insertUsingInsertion(EmployeeBean[] arr, int len){
        for(int i=1;i<len;i++){
            EmployeeBean key = arr[i]; int j=i-1;
            while(j>=0 && arr[j].getSalary() > key.getSalary()){ arr[j+1]=arr[j]; j--; }
            arr[j+1]=key;
        }
    }
}

// File: sorting/q1/TestEmployees.java
package sorting.q1;
import java.util.*;
public class TestEmployees{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        EmployeeBean[] pool = new EmployeeBean[20];
        // prefill 15 employees
        for(int i=0;i<15;i++){
            pool[i] = new EmployeeBean(100+i, "Emp"+(i+1), 30000 + (i*1000));
        }
        EmployeeDAO dao = new EmployeeDAO();
        dao.bubbleSort(pool, 15);
        System.out.println("After bubble sort (15):"); for(int i=0;i<15;i++) System.out.println(pool[i]);
        System.out.println("Enter 5 new employees (id name salary):");
        for(int i=15;i<20;i++){ int id=sc.nextInt(); String name=sc.next(); double sal=sc.nextDouble(); pool[i]=new EmployeeBean(id,name,sal); }
        // insertion: we will insertion sort whole 20 array by calling insertion on length 20
        dao.insertUsingInsertion(pool, 20);
        System.out.println("After inserting 5 and insertion-sorting:"); for(int i=0;i<20;i++) if(pool[i]!=null) System.out.println(pool[i]);
    }
}

// 3.2 Sort array of Strings by merge and quick sort
// File: sorting/q2/StringBean.java
package sorting.q2;
public class StringBean{ private String[] arr; public StringBean(String[] a){arr=a;} public String[] getArr(){return arr;} }

// File: sorting/q2/SortDAO.java
package sorting.q2;
import java.util.*;
public class SortDAO{
    // merge sort
    public void mergeSort(String[] a){ if(a==null||a.length<2) return; mergeSortRec(a,0,a.length-1); }
    private void mergeSortRec(String[] a,int l,int r){ if(l>=r) return; int m=(l+r)/2; mergeSortRec(a,l,m); mergeSortRec(a,m+1,r); merge(a,l,m,r); }
    private void merge(String[] a,int l,int m,int r){ String[] tmp = new String[r-l+1]; int i=l,j=m+1,k=0; while(i<=m && j<=r){ if(a[i].compareTo(a[j])<=0) tmp[k++]=a[i++]; else tmp[k++]=a[j++]; } while(i<=m) tmp[k++]=a[i++]; while(j<=r) tmp[k++]=a[j++]; System.arraycopy(tmp,0,a,l,tmp.length); }

    // quick sort
    public void quickSort(String[] a){ quickRec(a,0,a.length-1); }
    private void quickRec(String[] a,int l,int r){ if(l>=r) return; int p = partition(a,l,r); quickRec(a,l,p-1); quickRec(a,p+1,r); }
    private int partition(String[] a,int l,int r){ String pivot = a[r]; int i=l-1; for(int j=l;j<r;j++){ if(a[j].compareTo(pivot)<=0){ i++; String t=a[i]; a[i]=a[j]; a[j]=t; } } String t=a[i+1]; a[i+1]=a[r]; a[r]=t; return i+1; }
}

// File: sorting/q2/TestStringSorts.java
package sorting.q2;
import java.util.*;
public class TestStringSorts{
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); System.out.print("How many strings: "); int n=sc.nextInt(); String[] a=new String[n]; for(int i=0;i<n;i++) a[i]=sc.next(); StringBean bean=new StringBean(Arrays.copyOf(a,a.length)); SortDAO dao=new SortDAO();
        String[] copy1 = Arrays.copyOf(a,a.length); dao.mergeSort(copy1); System.out.println("Merge sorted: "+Arrays.toString(copy1));
        String[] copy2 = Arrays.copyOf(a,a.length); dao.quickSort(copy2); System.out.println("Quick sorted: "+Arrays.toString(copy2));
    }
}

// 3.3 Employee array sort by heap sort and quick sort
// File: sorting/q3/EmployeeBean2.java
package sorting.q3;
public class EmployeeBean2{ private int id; private String name; private double salary; public EmployeeBean2(int id,String name,double sal){this.id=id;this.name=name;this.salary=sal;} public double getSalary(){return salary;} public String toString(){return id+":"+name+":"+salary;} }

// File: sorting/q3/SortDAO2.java
package sorting.q3;
import java.util.*;
public class SortDAO2{
    // heap sort by salary
    public void heapSort(EmployeeBean2[] arr,int n){
        for(int i=n/2-1;i>=0;i--) heapify(arr,n,i);
        for(int i=n-1;i>0;i--){ EmployeeBean2 t=arr[0]; arr[0]=arr[i]; arr[i]=t; heapify(arr,i,0); }
    }
    private void heapify(EmployeeBean2[] arr,int n,int i){ int largest=i; int l=2*i+1, r=2*i+2; if(l<n && arr[l].getSalary()>arr[largest].getSalary()) largest=l; if(r<n && arr[r].getSalary()>arr[largest].getSalary()) largest=r; if(largest!=i){ EmployeeBean2 t=arr[i]; arr[i]=arr[largest]; arr[largest]=t; heapify(arr,n,largest); } }

    // quick sort by salary
    public void quickSort(EmployeeBean2[] a,int l,int r){ if(l>=r) return; int p = partition(a,l,r); quickSort(a,l,p-1); quickSort(a,p+1,r); }
    private int partition(EmployeeBean2[] a,int l,int r){ double pivot=a[r].getSalary(); int i=l-1; for(int j=l;j<r;j++){ if(a[j].getSalary()<=pivot){ i++; EmployeeBean2 t=a[i]; a[i]=a[j]; a[j]=t; } } EmployeeBean2 t=a[i+1]; a[i+1]=a[r]; a[r]=t; return i+1; }
}

// File: sorting/q3/TestEmpSorts.java
package sorting.q3;
import java.util.*;
public class TestEmpSorts{
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); EmployeeBean2[] arr=new EmployeeBean2[10]; for(int i=0;i<8;i++){ arr[i]=new EmployeeBean2(200+i,"E"+i,30000 + i*2000); } arr[8]=new EmployeeBean2(0,"X",0); arr[9]=new EmployeeBean2(0,"Y",0); SortDAO2 dao=new SortDAO2(); dao.heapSort(arr,8); System.out.println("After heap sort (first 8):"); for(int i=0;i<8;i++) System.out.println(arr[i]); dao.quickSort(arr,0,9); System.out.println("After quick sort all 10:"); for(int i=0;i<10;i++) System.out.println(arr[i]); }
}

// 3.4 array of size 10 of integers; add 8 values, sort, then accept 2 more and insert via insertion sort
// File: sorting/q4/IntArrayBean.java
package sorting.q4;
public class IntArrayBean{ private Integer[] arr; public IntArrayBean(Integer[] a){arr=a;} public Integer[] getArr(){return arr;} }

// File: sorting/q4/IntDAO.java
package sorting.q4;
import java.util.*;
public class IntDAO{
    public void sort(Integer[] a,int len){ Arrays.sort(a,0,len); }
    // insert one value into sorted prefix of size 'len' and return new length
    public int insertOne(Integer[] a,int len,int val){ a[len]=val; // now insert
        int i=len-1; while(i>=0 && a[i]>a[i+1]){ int t=a[i]; a[i]=a[i+1]; a[i+1]=t; i--; } return len+1; }
}

// File: sorting/q4/TestIntArray.java
package sorting.q4;
import java.util.*;
public class TestIntArray{
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); Integer[] arr = new Integer[10]; System.out.println("Enter 8 integers:"); for(int i=0;i<8;i++) arr[i]=sc.nextInt(); IntDAO dao=new IntDAO(); dao.sort(arr,8); System.out.println("After sorting 8: "+Arrays.toString(Arrays.copyOf(arr,8)));
        int len=8; for(int k=0;k<2;k++){ System.out.println("Enter next integer:"); int v=sc.nextInt(); len = dao.insertOne(arr,len,v); System.out.println("After insert: "+Arrays.toString(Arrays.copyOf(arr,len))); }
    }
}

// ---------------------------------------------------------------
// LINKED LISTS (Task Group 4)
// ---------------------------------------------------------------

// 4.1 Singly list display in reverse, delete primes, reverse list, add before given value
// File: linkedlist/sll/SNode.java
package linkedlist.sll;
public class SNode{ public int val; public SNode next; public SNode(int v){val=v;} }

// File: linkedlist/sll/SLLDAO.java
package linkedlist.sll;
import java.util.*;
public class SLLDAO{
    private SNode head;
    private boolean isPrime(int x){ if(x<=1) return false; if(x<=3) return true; if(x%2==0) return false; for(int i=3;i*i<=x;i+=2) if(x%i==0) return false; return true; }
    public void add(int v){ SNode n=new SNode(v); if(head==null){ head=n; return; } SNode t=head; while(t.next!=null) t=t.next; t.next=n; }
    public void display(){ SNode t=head; while(t!=null){ System.out.print(t.val+" "); t=t.next; } System.out.println(); }
    // 1 display reverse
    public void displayReverse(){ displayReverseRec(head); System.out.println(); }
    private void displayReverseRec(SNode node){ if(node==null) return; displayReverseRec(node.next); System.out.print(node.val+" "); }
    // 2 delete all primes
    public void deletePrimes(){ while(head!=null && isPrime(head.val)) head=head.next; if(head==null) return; SNode cur=head; while(cur.next!=null){ if(isPrime(cur.next.val)) cur.next=cur.next.next; else cur=cur.next; } }
    // 3 reverse the singly linked list
    public void reverse(){ SNode prev=null, cur=head; while(cur!=null){ SNode nxt=cur.next; cur.next=prev; prev=cur; cur=nxt; } head=prev; }
    // 4 add value before given value (first occurrence)
    public boolean addBefore(int target,int val){ if(head==null) return false; if(head.val==target){ SNode n=new SNode(val); n.next=head; head=n; return true;} SNode cur=head; while(cur.next!=null && cur.next.val!=target) cur=cur.next; if(cur.next==null) return false; SNode n=new SNode(val); n.next=cur.next; cur.next=n; return true; }
}

// File: linkedlist/sll/TestSLL.java
package linkedlist.sll;
import java.util.*;
public class TestSLL{
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); SLLDAO dao=new SLLDAO(); System.out.println("Enter numbers (-1 to stop):"); while(true){ int v=sc.nextInt(); if(v==-1) break; dao.add(v); }
        System.out.print("Original: "); dao.display(); System.out.print("Reverse display: "); dao.displayReverse(); dao.deletePrimes(); System.out.print("After deleting primes: "); dao.display(); dao.reverse(); System.out.print("After reverse: "); dao.display(); System.out.println("Enter target and value to insert before target:"); int t=sc.nextInt(); int val=sc.nextInt(); dao.addBefore(t,val); System.out.print("After addBefore: "); dao.display(); }
}

// 4.5 Doubly linked list: add after given value
// File: linkedlist/dll/DNode.java
package linkedlist.dll;
public class DNode{ public int val; public DNode prev,next; public DNode(int v){val=v;} }

// File: linkedlist/dll/DLLDAO.java
package linkedlist.dll;
public class DLLDAO{
    private DNode head, tail;
    public void add(int v){ DNode n=new DNode(v); if(head==null){ head=tail=n; return; } tail.next=n; n.prev=tail; tail=n; }
    // add after given value (first occurrence)
    public boolean addAfter(int target,int val){ DNode cur=head; while(cur!=null && cur.val!=target) cur=cur.next; if(cur==null) return false; DNode n=new DNode(val); n.next=cur.next; n.prev=cur; cur.next=n; if(n.next!=null) n.next.prev=n; else tail=n; return true; }
    public void display(){ DNode c=head; while(c!=null){ System.out.print(c.val+" "); c=c.next; } System.out.println(); }
}

// File: linkedlist/dll/TestDLL.java
package linkedlist.dll;
import java.util.*;
public class TestDLL{
    public static void main(String[] args){ Scanner sc=new Scanner(System.in); DLLDAO dao = new DLLDAO(); System.out.println("Enter numbers (-1 to stop):"); while(true){ int v=sc.nextInt(); if(v==-1) break; dao.add(v); } System.out.print("Original: "); dao.display(); System.out.println("Enter target and value to insert after target:"); int t=sc.nextInt(); int val=sc.nextInt(); dao.addAfter(t,val); System.out.print("After addAfter: "); dao.display(); }
}

// ---------------------------------------------------------------
// Notes:
// - All source files are provided as compact Bean/DAO/Test sets to help modular testing.
// - You can import them into a Java IDE under the package paths shown, then compile/run Test* classes.
// - If you want a zipped project, Maven/Gradle configuration, or a single-run driver that exercises all modules, I can provide that next.
// ---------------------------------------------------------------
