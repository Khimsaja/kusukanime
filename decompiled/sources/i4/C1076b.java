package i4;

import android.os.Looper;
import android.view.Choreographer;
import f1.AbstractC0871d;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import z0.C2433a0;

/* renamed from: i4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1076b extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new Random();
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(g6.b.f11774d);
                return simpleDateFormat;
            default:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                C2433a0 c2433a0 = new C2433a0(choreographer, AbstractC0871d.M(looperMyLooper));
                return c2433a0.plus(c2433a0.f18733u);
        }
    }
}
