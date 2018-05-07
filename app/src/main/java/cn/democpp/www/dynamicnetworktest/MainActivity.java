package cn.democpp.www.dynamicnetworktest;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // 定义全局变量
    private IntentFilter intentFilter;
    private DynamicNetworkChecker checker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化 checker
        checker = new DynamicNetworkChecker();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        //注册
        registerReceiver(checker, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 销毁注册
        unregisterReceiver(checker);
    }
}
