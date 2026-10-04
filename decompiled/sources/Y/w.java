package Y;

import O.C0488e;

/* loaded from: classes.dex */
public abstract class w implements v {

    /* renamed from: k, reason: collision with root package name */
    public final C0488e f10035k = new C0488e(0);

    public final boolean d(int i7) {
        return (i7 & this.f10035k.get()) != 0;
    }

    public final void e(int i7) {
        C0488e c0488e;
        int i8;
        do {
            c0488e = this.f10035k;
            i8 = c0488e.get();
            if ((i8 & i7) != 0) {
                return;
            }
        } while (!c0488e.compareAndSet(i8, i8 | i7));
    }
}
