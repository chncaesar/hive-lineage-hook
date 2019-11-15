package zjc.hive.hooks.model;

import java.util.Objects;

public class PartitionKeyValue {
    private String partitionKey;
    private String partitionValue;

    public PartitionKeyValue() {
    }

    public String getPartitionKey() {
        return partitionKey;
    }

    public void setPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
    }

    public String getPartitionValue() {
        return partitionValue;
    }

    public void setPartitionValue(String partitionValue) {
        this.partitionValue = partitionValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartitionKeyValue that = (PartitionKeyValue) o;
        return Objects.equals(partitionKey, that.partitionKey) &&
                Objects.equals(partitionValue, that.partitionValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partitionKey, partitionValue);
    }

    @Override
    public String toString() {
        return "PartitionKeyValue{" +
                "partitionKey='" + partitionKey + '\'' +
                ", partitionValue='" + partitionValue + '\'' +
                '}';
    }
}
