package Model;

/**
 * Created by SomeWaterfalls & Automatik-BlueBird on 09.12.2016.
 */
public class Stack<ContentType> {
    //Stack


    private StackNode top;
    private int size = 0;

    //___________________________________________
    private class StackNode{
        private ContentType content= null;
        private StackNode next = null;
        public StackNode(ContentType content){
            this.content =content;
        }

        public void setNext(StackNode next){
            this.next = next;
        }
        public StackNode getNext(){
            return next;
        }
        public ContentType getContent(){
            return content;
        }
    }
    //____________________________________________________
    public Stack(){
        top = null;

    }

    public boolean isEmpty(){
        if(top != null){
            return true;
        }
        return false;
    }

    public void push(ContentType object){
        StackNode node = new StackNode(object);
        node.setNext(top);
        top = node;
        size++;

    }

    public void pop(){
        if(top!=null) {
            top = top.getNext();
        }
        size--;
    }


    public ContentType top(){
        if(top != null) {
            return top.getContent();
        }
        return null;
    }

    public int getSize(){
        return size;
    }

}
