package com.example.nyxposed;

import android.util.Log;

import de.robv.android.ny.IXposedHookLoadPackage;
import de.robv.android.ny.XposedBridge;
import de.robv.android.ny.callbacks.XC_LoadPackage;

public class NyTest implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) throws Throwable{
        Log.i("Xposed-01", loadPackageParam.packageName);
        XposedBridge.log("Xposed-01 -> app packagename" + loadPackageParam.packageName);
        if (loadPackageParam.packageName.equals("com.example.test")){
            XposedBridge.log("XLZH" + loadPackageParam.packageName);
        }
    }

}
