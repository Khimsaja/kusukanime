package B1;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f292b = new ArrayList(50);
    public final Handler a;

    public F(Handler handler) {
        this.a = handler;
    }

    public static E b() {
        E e7;
        ArrayList arrayList = f292b;
        synchronized (arrayList) {
            try {
                e7 = arrayList.isEmpty() ? new E() : (E) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return e7;
    }

    public final E a(int i7, Object obj) {
        E eB = b();
        eB.a = this.a.obtainMessage(i7, obj);
        return eB;
    }

    public final boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    public final void d(int i7) {
        AbstractC0015b.c(i7 != 0);
        this.a.removeMessages(i7);
    }

    public final boolean e(int i7) {
        return this.a.sendEmptyMessage(i7);
    }
}
