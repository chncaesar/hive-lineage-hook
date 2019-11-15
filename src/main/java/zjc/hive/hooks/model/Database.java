package zjc.hive.hooks.model;

public class Database {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Database() {
    }

    public Database(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                '}';
    }
}
