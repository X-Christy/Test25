package cn.edu.bistu.cs.se.test25;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "MyTag";
    public MyService() {
    }
    private LocalBinder myBinder = new LocalBinder();
    public class LocalBinder extends Binder{
        MyService getService(){
            return MyService.this;
        }
    }
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public void onCreate() {
        Log.v(TAG,"onCreate()");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v(TAG,"onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.v(TAG,"onDestory()");
        super.onDestroy();
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.v(TAG,"onUnbind()");
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        Log.v(TAG,"onRebind()");
        super.onRebind(intent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.v(TAG,"onBind()");
        return myBinder;
    }
}
