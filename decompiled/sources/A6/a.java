package A6;

import B6.e;
import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class a implements z6.b, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public e f258k;

    /* renamed from: l, reason: collision with root package name */
    public LinkedBlockingQueue f259l;

    @Override // z6.b
    public final boolean a() {
        return true;
    }

    @Override // z6.b
    public final boolean b() {
        return true;
    }

    @Override // z6.b
    public final void c(String str, Throwable th) {
        l(1);
    }

    @Override // z6.b
    public final void d(String str) {
        l(2);
    }

    @Override // z6.b
    public final void e(String str) {
        l(5);
    }

    @Override // z6.b
    public final boolean f() {
        return true;
    }

    @Override // z6.b
    public final boolean h() {
        return true;
    }

    @Override // z6.b
    public final void i(String str) {
        l(4);
    }

    @Override // z6.b
    public final boolean j() {
        return true;
    }

    @Override // z6.b
    public final void k(Throwable th) {
        l(4);
    }

    public final void l(int i7) {
        c cVar = new c();
        System.currentTimeMillis();
        cVar.a = i7;
        cVar.f260b = this.f258k;
        Thread.currentThread().getName();
        this.f259l.add(cVar);
    }
}
