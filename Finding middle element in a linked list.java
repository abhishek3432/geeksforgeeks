//{ Driver Code Starts
    import java.util.*;
    import java.io.*;
    
    class Node{
        int data;
        Node next;
        
        Node(int x){
            data = x;
            next = null;
        }
        
    }
    class GFG{
        static void printList(Node node) 
        { 
            while (node != null) 
            { 
                System.out.print(node.data + " "); 
                node = node.next; 
            } 
            System.out.println(); 
        }
        public static void main(String args[]) throws IOException { 
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n = sc.nextInt();
                Node head = new Node(sc.nextInt());
                Node tail = head;
                for(int i=0; i<n-1; i++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                Solution g = new Solution();
                int ans = g.getMiddle(head);
                System.out.println(ans);
                //printList(head); 
                t--;
            }
        } 
    } 
       
    // } Driver Code Ends
    
    
    /* Node of a linked list
     class Node {
       int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    }
    */
    
    class Solution
    {
        int getMiddle(Node head)
        {
             // Your code here.
             //tortoise hare algo
             Node fast=head;
             Node slow=head;
             //for no node or one node
             //if(head==null) return -1;
             //if(head.next==null)    return head.data;
             
             //for two or more node(pit me jump karne se phele ek step stone pe rakna padega)
             while(fast != null && fast.next != null) //<-error happen when ||
             {
                 fast=fast.next.next;
                 slow=slow.next;
             }
             
             return slow.data;
        }
    }
    