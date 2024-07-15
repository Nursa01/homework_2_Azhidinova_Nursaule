package Task1;

class Account<T extends Comparable<Account>>{
    private String name;
    private T id;

    Account(String name, T id) {
        this.name = name;
        this.id = id;

    }
    public T getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(T obj) {
        return 0;
    }
}
