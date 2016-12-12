package Model;

/**
 * Created by SomeWaterfalls & Automatik-BlueBird on 09.12.2016.
 */
public class CashQueue<Customer> {
    //Queue

    private QueueNode head;
    private QueueNode tail;
    /* Anfang der inneren Klasse */
    private class QueueNode{

        private Customer content = null;
        private QueueNode nextNode = null;

        public QueueNode(Customer content){
            this.content = content;
        }

        public QueueNode getNext(){
            return nextNode;
        }

        public void setNext(QueueNode next){
            nextNode = next;
        }

        public Customer getContent(){
            return content;
        }
    }
    /* Ende der inneren Klasse */

    public CashQueue(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    public void enqueue(Customer content){
        QueueNode node = new QueueNode(content);
        if(this.isEmpty()){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void dequeue(){
        if(head != tail){
            this.head = this.head.getNext();
        }else{
            this.head = null;
            this.tail = null;
        }
    }

    public Customer front(){
        if(!isEmpty()){
            return head.getContent();
        }
        return null;
    }
}
