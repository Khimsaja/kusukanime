package com.kusukanime;

import S2.g;
import android.app.Application;
import com.kusukanime.KusuApp;
import com.kusukanime.data.CrashLog;
import com.kusukanime.data.SbClient;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import kotlin.Metadata;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/kusukanime/KusuApp;", "Landroid/app/Application;", "Lcoil/ImageLoaderFactory;", "<init>", "()V", "newImageLoader", "Lcoil/ImageLoader;", "onCreate", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KusuApp extends Application implements g {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f11166k = 0;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        try {
            SbClient.INSTANCE.init(this);
        } catch (Exception unused) {
        }
        final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: o3.b
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                KusuApp kusuApp = this.a;
                int i7 = KusuApp.f11166k;
                try {
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    CrashLog crashLog = CrashLog.INSTANCE;
                    String name = thread.getName();
                    String name2 = th.getClass().getName();
                    String message = th.getMessage();
                    String string = stringWriter.toString();
                    kotlin.jvm.internal.l.e("toString(...)", string);
                    crashLog.save(kusuApp, "thread=" + name + "\n" + name2 + ": " + message + "\n" + AbstractC2510o.I0(4000, string));
                } catch (Exception unused2) {
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
        try {
            CrashLog.INSTANCE.uploadPending(this);
        } catch (Exception unused2) {
        }
    }
}
