package com.aritraroy.logger;

import android.util.Log;

public class Logger {

  private final String TAG;
  private final int priority;

  public static Logger withTag(String tag) {
    return new Logger(tag);
  }

  private Logger(String TAG) {
    this.TAG = TAG;
    this.priority = Log.DEBUG;
  }

  public Logger log(String message) {
    if (BuildConfig.DEBUG) {
      Log.println(priority, TAG, message);
    }
    return this;
  }

  public void withCause(Exception cause) {
    if (BuildConfig.DEBUG) {
      Log.println(priority, TAG, Log.getStackTraceString(cause));
    }
  }
}