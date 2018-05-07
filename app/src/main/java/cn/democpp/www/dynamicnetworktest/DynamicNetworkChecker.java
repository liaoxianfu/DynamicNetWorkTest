package cn.democpp.www.dynamicnetworktest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class DynamicNetworkChecker extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //实例话ConnectivityManager对象
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        // 获取网络连接的信息
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        // 判断网络连接情况
        if (networkInfo != null && networkInfo.isAvailable()) {
            Toast.makeText(context, "连接成功", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "连接失败", Toast.LENGTH_SHORT).show();
        }

    }
}
