package com.example.examplework;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class SecondWork extends Worker {
    public SecondWork(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
    }


    public Result doWork() {
        Log.i("APSSDC","This is the second work");
        return null;
    }
}
