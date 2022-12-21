public class Account<T> {
    private T id;
    Account(T id){
        this.id = id;

    }
    public T getId() { return id; }
}
