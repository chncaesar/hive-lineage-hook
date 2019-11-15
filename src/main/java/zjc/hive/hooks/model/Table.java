package zjc.hive.hooks.model;

import zjc.hive.hooks.model.event.BaseEvent;

import java.util.List;
import java.util.Objects;

public class Table {
    private String dbName;
    private String tableName;
    private List<String> columns;

    public Table() {
    }

    public Table(String dName, String tName, List<String> cols) {
        this.dbName = dName;
        this.tableName = tName;
        this.columns = cols;
    }

    public Table(String dbName, String tName) {
        this.dbName = dbName;
        this.tableName = tName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
        this.columns = columns;
    }

    /**
     * 基于dbName, tableName比较。不关心columns。
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table = (Table) o;
        return Objects.equals(dbName, table.dbName) &&
                Objects.equals(tableName, table.tableName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, tableName);
    }

    @Override
    public String toString() {
        return "Table{" +
                "dbName='" + dbName + '\'' +
                ", tableName='" + tableName + '\'' +
                ", columns=" + columns +
                '}';
    }
}
