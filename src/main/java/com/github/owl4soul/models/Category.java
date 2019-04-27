package com.github.owl4soul.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Category {
    IT,
    SCIENCE,
    SPORT,
    POLITICS,
    OTHER,
    ;

    Category() {
    }

    public String getName() {
        return this.name();
    }

    public static List<String> getCategoriesNames() {
        List<Category> categoryList = Arrays.asList(Category.values());
        List<String> categoriesNames = new ArrayList<>();
        for (Category cat : categoryList) {
            categoriesNames.add(cat.name());
        }
        return categoriesNames;

    }


}
