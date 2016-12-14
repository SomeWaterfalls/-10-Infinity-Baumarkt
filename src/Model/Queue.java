package Model;

/**
 * Created by SomeWaterfalls & Automatik-BlueBird on 09.12.2016.
 */
public class Queue<ContentType> {
    //Queue

    private QueueNode head;
    private QueueNode tail;
    /* Anfang der inneren Klasse */
    private class QueueNode{

        private ContentType content = null;
        private QueueNode nextNode = null;

        public QueueNode(ContentType content){
            this.content = content;
        }

        public QueueNode getNext(){
            return nextNode;
        }

        public void setNext(QueueNode next){
            nextNode = next;
        }

        public ContentType getContent(){
            return content;
        }
    }
    /* Ende der inneren Klasse */

    public Queue(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        if(this.head == null){
            return true;
        }
        return false;
    }

    public void enqueue(ContentType content){
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

    public ContentType front(){
        if(!isEmpty()){
            return head.getContent();
        }
        return null;
    }
}
