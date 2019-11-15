package zjc.hive.hooks.model.event;

import java.util.Objects;

public class CreateDatabase extends BaseEvent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDatabase(String name) {
        this.name = name;
    }

    public CreateDatabase() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateDatabase that = (CreateDatabase) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "CreateDatabase{" +
                "name='" + name + '\'' +
                '}';
    }
}
