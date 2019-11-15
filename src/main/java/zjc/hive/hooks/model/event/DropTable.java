package zjc.hive.hooks.model.event;

import java.util.Objects;

public class DropTable extends BaseEvent {
    private String dbName;
    private String name;

    public DropTable() {
    }

    public DropTable(String dbName, String name) {
        this.dbName = dbName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DropTable dropTable = (DropTable) o;
        return Objects.equals(dbName, dropTable.dbName) &&
                Objects.equals(name, dropTable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, name);
    }

    @Override
    public String toString() {
        return "DropTable{" +
                "dbName='" + dbName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
