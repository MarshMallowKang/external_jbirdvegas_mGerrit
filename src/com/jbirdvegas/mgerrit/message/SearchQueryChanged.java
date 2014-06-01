package com.jbirdvegas.mgerrit.message;

/*
 * Copyright (C) 2014 Android Open Kang Project (AOKP)
 *  Author: Evan Conway (P4R4N01D), 2014
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import android.os.Bundle;

import java.util.ArrayList;

public class SearchQueryChanged {

    public static final String KEY_WHERE = "WHERE";
    public static final String KEY_BINDARGS = "BIND_ARGS";
    public static final String KEY_TO = "TO";

    private final String mWhere;
    private ArrayList<String> mBindArgs = new ArrayList<>();
    private final String mClazzName;

    public SearchQueryChanged(String where, ArrayList<String> bindArgs, String clazzName) {
        this.mWhere = where;
        this.mBindArgs = bindArgs;
        this.mClazzName = clazzName;
    }

    public String getWhere() {
        return mWhere;
    }

    public ArrayList<String> getBindArgs() {
        return mBindArgs;
    }

    public String getClazzName() {
        return mClazzName;
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_WHERE, mWhere);
        bundle.putSerializable(KEY_BINDARGS, mBindArgs);
        bundle.putString(KEY_TO, mClazzName);
        return bundle;
    }
}
