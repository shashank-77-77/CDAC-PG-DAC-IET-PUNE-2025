// Project Structure Overview
// For each of the 10 questions, following 3 files are generated:
// 1) Bean (Data Model)
// 2) DAO (Core Logic)
// 3) Test (Driver)
// ---------------------------------------------------------------
// QUESTION 1: STACK + PALINDROME
// ---------------------------------------------------------------

// File: q1/StackBean.java
package q1;
public class StackBean {
    private char[] arr;
    private int top;
    public StackBean(int size){ arr=new char[size]; top=-1; }
    public char[] getArr(){ return arr; }
    public int getTop(){ return top; }
    public void setTop(int t){ top=t; }
}

// File: q1/StackDAO.java
package q1;
public class StackDAO {
    public boolean isEmpty(StackBean s){ return s.getTop()==-1; }
    public boolean isFull(StackBean s){ return s.getTop()==s.getArr().length-1; }
    public void push(StackBean s,char c){ if(isFull(s)) throw new RuntimeException(); s.getArr()[s.getTop()+1]=c; s.setTop(s.getTop()+1);}    
    public char pop(StackBean s){ if(isEmpty(s)) throw new RuntimeException(); char v=s.getArr()[s.getTop()]; s.setTop(s.getTop()-1); return v; }
    public boolean checkPalindrome(String in){
        String cleaned=in.replaceAll(" ","").toLowerCase();
        StackBean s=new StackBean(cleaned.length());
        for(char c:cleaned.toCharArray()) push(s,c);
        StringBuilder rev=new StringBuilder();
        while(!isEmpty(s)) rev.append(pop(s));
        return cleaned.equals(rev.toString());
    }
}

// File: q1/TestQ1.java
package q1;
import java.util.*;
public class TestQ1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StackDAO dao=new StackDAO();
        System.out.print("Enter string: ");
        String st=sc.nextLine();
        System.out.println("Palindrome: "+dao.checkPalindrome(st));
    }
}

// ---------------------------------------------------------------
// QUESTION 2: REPLACE EACH ELEMENT WITH SUM OF OTHERS
// ---------------------------------------------------------------

// File: q2/ArrayBean.java
package q2;
public class ArrayBean{
    private int[] arr;
    public ArrayBean(int[] a){this.arr=a;}
    public int[] getArr(){return arr;}
}

// File: q2/ArrayDAO.java
package q2;
public class ArrayDAO{
    public int[] process(ArrayBean b){
        int[] a=b.getArr();
        int n=a.length;
        int[] out=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++) if(i!=j) sum+=a[j];
            out[i]=sum;
        }
        return out;
    }
}

// File: q2/TestQ2.java
package q2;
import java.util.*;
public class TestQ2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        ArrayBean b=new ArrayBean(a);
        ArrayDAO d=new ArrayDAO();
        System.out.println(Arrays.toString(d.process(b)));
    }
}

// ---------------------------------------------------------------
// QUESTION 3: CIRCULAR QUEUE
// ---------------------------------------------------------------

// File: q3/CQBean.java
package q3;
public class CQBean{
    private int[] data;
    private int front,rear,size;
    public CQBean(int cap){ data=new int[cap]; front=0; rear=-1; size=0; }
    public int[] getData(){return data;}
    public int getFront(){return front;} public int getRear(){return rear;} public int getSize(){return size;}
    public void setFront(int v){front=v;} public void setRear(int v){rear=v;} public void setSize(int v){size=v;}
    public int capacity(){return data.length;}
}

// File: q3/CQDAO.java
package q3;
public class CQDAO{
    public boolean isFull(CQBean c){ return c.getSize()==c.capacity(); }
    public boolean isEmpty(CQBean c){ return c.getSize()==0; }
    public void enqueue(CQBean c,int v){
        if(isFull(c)) throw new RuntimeException();
        c.setRear((c.getRear()+1)%c.capacity());
        c.getData()[c.getRear()]=v;
        c.setSize(c.getSize()+1);
    }
    public int dequeue(CQBean c){
        if(isEmpty(c)) throw new RuntimeException();
        int val=c.getData()[c.getFront()];
        c.setFront((c.getFront()+1)%c.capacity());
        c.setSize(c.getSize()-1);
        return val;
    }
}

// File: q3/TestQ3.java
package q3;
import java.util.*;
public class TestQ3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter capacity: ");
        int c=sc.nextInt();
        CQBean b=new CQBean(c);
        CQDAO d=new CQDAO();
        int removed=0;
        while(true){
            int x=sc.nextInt();
            if(x==-1) break;
            if(d.isFull(b)){ d.dequeue(b); removed++; }
            d.enqueue(b,x);
        }
        System.out.println("Removed: "+removed);
    }
}

// ---------------------------------------------------------------
// QUESTION 4: SORTED SINGLY LINKED LIST
// ---------------------------------------------------------------

// File: q4/NodeBean.java
package q4;
public class NodeBean{
    public int val; public NodeBean next;
    public NodeBean(int v){val=v;}
}

// File: q4/ListDAO.java
package q4;
public class ListDAO{
    private NodeBean head;
    public void insertSorted(int v){
        NodeBean n=new NodeBean(v);
        if(head==null || head.val>=v){ n.next=head; head=n; return; }
        NodeBean c=head;
        while(c.next!=null && c.next.val<v) c=c.next;
        n.next=c.next; c.next=n;
    }
    public NodeBean getHead(){return head;}
}

// File: q4/TestQ4.java
package q4;
import java.util.*;
public class TestQ4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ListDAO d=new ListDAO();
        while(true){ int x=sc.nextInt(); if(x==-1) break; d.insertSorted(x);}        
        NodeBean h=d.getHead();
        while(h!=null){ System.out.print(h.val+" "); h=h.next;}        
    }
}

// ---------------------------------------------------------------
// QUESTION 5: CIRCULAR LINKED LIST INSERTION
// ---------------------------------------------------------------

// File: q5/CLLNode.java
package q5;
public class CLLNode{ public int val; public CLLNode next; public CLLNode(int v){val=v;} }

// File: q5/CLLDAO.java
package q5;
public class CLLDAO{
    private CLLNode head;
    public void addBeforeHead(int v){
        CLLNode n=new CLLNode(v);
        if(head==null){ n.next=n; head=n; return; }
        CLLNode t=head;
        while(t.next!=head) t=t.next;
        t.next=n; n.next=head; head=n;
    }
    public void addEnd(int v){
        CLLNode n=new CLLNode(v);
        if(head==null){ n.next=n; head=n; return; }
        CLLNode t=head;
        while(t.next!=head) t=t.next;
        t.next=n; n.next=head;
    }
    public void addAtPos(int v,int p){
        if(p<=1 || head==null){ addBeforeHead(v); return; }
        CLLNode c=head; int idx=1;
        while(idx<p-1 && c.next!=head){ c=c.next; idx++; }
        CLLNode n=new CLLNode(v);
        n.next=c.next; c.next=n;
    }
    public CLLNode getHead(){return head;}
}

// File: q5/TestQ5.java
package q5;
import java.util.*;
public class TestQ5{
    public static void main(String[] args){
        CLLDAO d=new CLLDAO(); Scanner sc=new Scanner(System.in);
        System.out.println("1-before head 2-end 3-pos 4-exit");
        while(true){
            int op=sc.nextInt(); if(op==4) break;
            int v=sc.nextInt();
            if(op==1) d.addBeforeHead(v);
            else if(op==2) d.addEnd(v);
            else if(op==3){ int p=sc.nextInt(); d.addAtPos(v,p);}        
            CLLNode h=d.getHead(); if(h!=null){ CLLNode c=h; do{ System.out.print(c.val+" "); c=c.next;}while(c!=h); System.out.println(); }
        }
    }
}

// ---------------------------------------------------------------
// QUESTION 6: DOUBLY LINKED LIST + REVERSE DISPLAY FROM POSITION
// ---------------------------------------------------------------

// File: q6/DNode.java
package q6;
public class DNode{ public int val; public DNode prev,next; public DNode(int v){val=v;} }

// File: q6/DLLDAO.java
package q6;
public class DLLDAO{
    private DNode head,tail; private int size=0;
    public void add(int v){
        DNode n=new DNode(v);
        if(head==null){ head=tail=n; size++; return; }
        tail.next=n; n.prev=tail; tail=n; size++;
    }
    public void reverseFrom(int p){
        if(p<1 || p>size){ System.out.println("Wrong position"); return; }
        DNode c=head; for(int i=1;i<p;i++) c=c.next;
        while(c!=null){ System.out.print(c.val+" "); c=c.prev; }
        System.out.println();
    }
}

// File: q6/TestQ6.java
package q6;
import java.util.*;
public class TestQ6{
    public static void main(String[] args){
        DLLDAO d=new DLLDAO(); Scanner sc=new Scanner(System.in);
        while(true){ int x=sc.nextInt(); if(x==-1) break; d.add(x);}        
        int p=sc.nextInt(); d.reverseFrom(p);
    }
}

// ---------------------------------------------------------------
// QUESTION 7: INSERTION SORT (COUNT SHIFTS)
// ---------------------------------------------------------------

// File: q7/CharBean.java
package q7;
public class CharBean{ private char[] arr; public CharBean(char[] a){arr=a;} public char[] getArr(){return arr;} }

// File: q7/SortDAO.java
package q7;
public class SortDAO{
    public void insertion(CharBean b){
        char[] a=b.getArr();
        for(int i=1;i<a.length;i++){
            char k=a[i]; int j=i-1,sh=0;
            while(j>=0 && a[j]>k){ a[j+1]=a[j]; j--; sh++; }
            a[j+1]=k;
            System.out.println("Iteration "+i+" shifts: "+sh);
        }
    }
}

// File: q7/TestQ7.java
package q7;
import java.util.*;
public class TestQ7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] a=sc.next().toCharArray();
        CharBean b=new CharBean(a);
        new SortDAO().insertion(b);
        System.out.println(b.getArr());
    }
}

// ---------------------------------------------------------------
// QUESTION 8: BUBBLE SORT (COUNT SWAPS)
// ---------------------------------------------------------------

// File: q8/CharBean2.java
package q8;
public class CharBean2{ private char[] arr; public CharBean2(char[] a){arr=a;} public char[] getArr(){return arr;} }

// File: q8/BubbleDAO.java
package q8;
public class BubbleDAO{
    public void bubble(CharBean2 b){
        char[] a=b.getArr();
        for(int p=0;p<a.length-1;p++){
            int sw=0;
            for(int j=0;j<a.length-1-p;j++){
                if(a[j]>a[j+1]){ char t=a[j]; a[j]=a[j+1]; a[j+1]=t; sw++; }
            }
            System.out.println("Pass "+(p+1)+" swaps: "+sw);
            if(sw==0) break;
        }
    }
}

// File: q8/TestQ8.java
package q8;
import java.util.*;
public class TestQ8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char[] a=sc.next().toCharArray();
        CharBean2 c=new CharBean2(a);
        new BubbleDAO().bubble(c);
        System.out.println(c.getArr());
    }
}

// ---------------------------------------------------------------
// QUESTION 9: BINARY TREE + SEARCH
// ---------------------------------------------------------------

// File: q9/BTNode.java
package q9;
public class BTNode{ public int v; public BTNode l,r; public BTNode(int x){v=x;} }

// File: q9/BTDAO.java
package q9;
public class BTDAO{
    private BTNode root;
    public void insert(int x){ root=add(root,x); }
    private BTNode add(BTNode n,int x){
        if(n==null) return new BTNode(x);
        if(x<n.v) n.l=add(n.l,x); else n.r=add(n.r,x);
        return n;
    }
    public void inorder(){ trav(root); System.out.println(); }
    private void trav(BTNode n){ if(n==null) return; trav(n.l); System.out.print(n.v+" "); trav(n.r);}    
    public boolean search(int x){ return find(root,x); }
    private boolean find(BTNode n,int x){ if(n==null) return false; if(n.v==x) return true; return x<n.v?find(n.l,x):find(n.r,x);}    
}

// File: q9/TestQ9.java
package q9;
import java.util.*;
public class TestQ9{
    public static void main(String[] args){
        BTDAO d=new BTDAO(); Scanner sc=new Scanner(System.in);
        while(true){ int x=sc.nextInt(); if(x==-1) break; d.insert(x);}        
        d.inorder();
        int s=sc.nextInt(); System.out.println(d.search(s)?"Exists":"Not exists");
    }
}

// ---------------------------------------------------------------
// QUESTION 10: CHECK IF BINARY TREE IS BST
// ---------------------------------------------------------------

// File: q10/TNode.java
package q10;
public class TNode{ public int v; public TNode l,r; public TNode(int x){v=x;} }

// File: q10/TreeDAO.java
package q10;
public class TreeDAO{
    private TNode root;
    public void insert(int x){ root=add(root,x); }
    private TNode add(TNode n,int x){ if(n==null) return new TNode(x); if(x<n.v) n.l=add(n.l,x); else n.r=add(n.r,x); return n; }
    public boolean isBST(){ return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE); }
    private boolean check(TNode n,int min,int max){ if(n==null) return true; if(n.v<=min||n.v>=max) return false; return check(n.l,min,n.v)&&check(n.r,n.v,max);}    
}

// File: q10/TestQ10.java
package q10;
import java.util.*;
public class TestQ10{
    public static void main(String[] args){
        TreeDAO d=new TreeDAO(); Scanner sc=new Scanner(System.in);
        while(true){ int x=sc.nextInt(); if(x==-1) break; d.insert(x);}        
        System.out.println(d.isBST()?"BST":"Not BST");
    }
}
