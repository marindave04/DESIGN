public class MyStack2 {
    Queue<Integer> q1=new LinkedList<>();

    public MyStack(){

    }
    public void push(int x){
        q1.offer(x);
        int y=q1.size();
        for(int i=1;i<=y-1;i++){
            int top=q1.poll();
            q1.offer(top);

        }

    }

    public int pop(){
        return q1.poll();
    }
    public int top(){
        return q1.peek();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
}
