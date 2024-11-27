 public class Box <T> {
     private T item;

     Box(T item) {
         this.item = item;
     }

     public T getItem() {
         return this.item;
     }

//     public void setItem(T item) {
//         this.item = item;
//     }

     public void add(T item) {
         this.item = item;
     }

 }
