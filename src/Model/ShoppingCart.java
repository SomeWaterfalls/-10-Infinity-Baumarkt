package Model;

/**
 * Created by SomeWaterfalls & Automatik-BlueBird on 09.12.2016.
 */
public class ShoppingCart<Good> {
    //Stack


    private StackNode top;
    private int size = 0;

    //___________________________________________
    private class StackNode{
        private Good content= null;
        private StackNode next = null;
        public StackNode(Good content){
            this.content =content;
        }

        public void setNext(StackNode next){
            this.next = next;
        }
        public StackNode getNext(){
            return next;
        }
        public Good getContent(){
            return content;
        }
    }
    //____________________________________________________
    public ShoppingCart(){
        top = null;

    }

    public boolean isEmpty(){
        if(top != null){
            return true;
        }
        return false;
    }

    public void push(Good object){
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


    public Good top(){
        if(top != null) {
            return top.getContent();
        }
        return null;
    }

    public int getSize(){
        return size;
    }

}
