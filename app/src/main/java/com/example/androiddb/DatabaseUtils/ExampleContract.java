package com.example.androiddb.DatabaseUtils;

import android.provider.BaseColumns;

public class ExampleContract {

    public static final class ExampleContractEntries implements BaseColumns {

        /*
         * Table Name: ex 'Table Name'
         */
        public static final String TABLE_NAME = "exampleTable";

        /*
         * Column Names:
         */
        public static final String EXAMPLE_COLUMN_NAME = "columnName";
        public static final String EXAMPLE_COLUMN_NUMBER_SIZE= "columnNumberSize";
        public static final String EXAMPLE_COLUMN_TIMESTAMP = "columnTimeStamp";
    }
}
