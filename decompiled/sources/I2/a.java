package I2;

import B1.D;
import B1.m;
import T1.s;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.kusukanime.BuildConfig;
import j3.E;
import j3.G;
import j3.X;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import y1.Y;

/* loaded from: classes.dex */
public final class a {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4004b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4005c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4006d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4007e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f4008f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f4009g;

    /* renamed from: h, reason: collision with root package name */
    public Object f4010h;

    public a(AssetManager assetManager, Executor executor, d dVar, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.f4004b = executor;
        this.f4005c = dVar;
        this.f4009g = str;
        this.f4008f = file;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 31) {
            switch (i7) {
                case 24:
                case 25:
                    bArr = e.f4026h;
                    break;
                case 26:
                    bArr = e.f4025g;
                    break;
                case 27:
                    bArr = e.f4024f;
                    break;
                case 28:
                case 29:
                case BuildConfig.VERSION_CODE /* 30 */:
                    bArr = e.f4023e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = e.f4022d;
        }
        this.f4006d = bArr;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((d) this.f4005c).g();
            return null;
        }
    }

    public void b(int i7, Serializable serializable) {
        ((Executor) this.f4004b).execute(new m(i7, 1, this, serializable));
    }

    public a(Context context, s sVar) {
        this.f4004b = context.getApplicationContext();
        this.f4005c = sVar;
        E e7 = G.f12277l;
        this.f4008f = X.f12304o;
        this.f4009g = Y.a;
        this.f4010h = D.a;
    }
}
