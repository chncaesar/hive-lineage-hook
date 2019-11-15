package zjc.hive.hooks.model;

import org.apache.hadoop.hive.metastore.api.FieldSchema;

import java.util.Objects;

public class Column {
    private String name;
    private String dataType;
    private String comment;

    public Column() {
    }

    public Column(FieldSchema fs) {
        this.name = fs.getName();
        this.dataType = fs.getType();
        this.comment = fs.getComment();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Column column = (Column) o;
        return Objects.equals(name, column.name) &&
                Objects.equals(dataType, column.dataType) &&
                Objects.equals(comment, column.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType, comment);
    }

    @Override
    public String toString() {
        return "Column{" +
                "name='" + name + '\'' +
                ", dataType='" + dataType + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
