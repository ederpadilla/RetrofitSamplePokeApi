package dev.eder.padilla.retrofitsample.model;

import com.google.gson.annotations.SerializedName;

public class Pokemon {
    @SerializedName("id")
        public Integer id;
    @SerializedName("name")
        public String name;
    @SerializedName("base_experience")
        public Integer baseExperience;
    @SerializedName("height")
        public Integer height;
    @SerializedName("is_default")
    public Boolean isDefault;
        @SerializedName("order")
    public Integer order;
        @SerializedName("weight")
    public Integer weight;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getBaseExperience() {
        return baseExperience;
    }

    public Integer getHeight() {
        return height;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public Integer getOrder() {
        return order;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", baseExperience=" + baseExperience +
                ", height=" + height +
                ", isDefault=" + isDefault +
                ", order=" + order +
                ", weight=" + weight +
                '}';
    }
}
