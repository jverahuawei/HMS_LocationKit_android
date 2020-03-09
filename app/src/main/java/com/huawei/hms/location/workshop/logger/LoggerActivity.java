
package com.huawei.hms.location.workshop.logger;

import com.huawei.hms.location.workshop.LogFragment;
import com.huawei.hms.location.workshop.R;

import android.app.Activity;

/**
 * util
 */
public class LoggerActivity extends Activity {

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        initializeLogging();
    }

    private void initializeLogging() {
        LogFragment logFragment = (LogFragment) getFragmentManager().findFragmentById(R.id.framelog);

        LogCatWrapper logcat = new LogCatWrapper();
        logcat.setNext(logFragment.getLogView());

        LocationLog.setLogNode(logcat);
    }
}
