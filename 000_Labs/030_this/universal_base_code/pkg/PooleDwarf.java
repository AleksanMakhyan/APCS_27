package pkg;

public class PooleDwarf {
    private String name;
    private int age;

    public PooleDwarf() {
        this.name = "";
        this.age = 0;
    }

    public PooleDwarf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* Accessor Methods */
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    /* Mutator Methods */
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSameName(String name) {
        return this.name.equals(name);
    }
}