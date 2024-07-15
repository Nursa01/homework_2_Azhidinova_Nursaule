package Task1;

class Account implements Comparable<Account>{
    private String name;
    private int id;

    Account(String name, int id) {
        this.name = name;
        this.id = id;

    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Account account) {
        if(id == account.getId())
        {   return 0;
        } else if(id < account.getId()) {
            return 1;
        } return -1;
    }
    public String toString() {
        return "Name: " + name +
                ", ID: " + id;
    }
}

