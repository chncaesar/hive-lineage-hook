package zjc.hive.hooks.model;

import java.util.List;
import java.util.Objects;

public class DbTblCol {
    private String dbName;
    private String tblName;
    private List<PartitionKeyValue> partition;
    private Column column;

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTblName() {
        return tblName;
    }

    public void setTblName(String tblName) {
        this.tblName = tblName;
    }

    public List<PartitionKeyValue> getPartition() {
        return partition;
    }

    public void setPartition(List<PartitionKeyValue> partition) {
        this.partition = partition;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    public DbTblCol() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbTblCol dbTblCol = (DbTblCol) o;
        return Objects.equals(dbName, dbTblCol.dbName) &&
                Objects.equals(tblName, dbTblCol.tblName) &&
                Objects.equals(partition, dbTblCol.partition) &&
                Objects.equals(column, dbTblCol.column);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, tblName, partition, column);
    }

    @Override
    public String toString() {
        return "DbTblCol{" +
                "dbName='" + dbName + '\'' +
                ", tblName='" + tblName + '\'' +
                ", partition=" + partition +
                ", column=" + column +
                '}';
    }
}
