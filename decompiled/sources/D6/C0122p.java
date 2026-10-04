package D6;

import f6.C0890D;
import java.util.concurrent.Executor;

/* renamed from: D6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122p implements InterfaceC0111e {

    /* renamed from: k, reason: collision with root package name */
    public final Executor f1757k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0111e f1758l;

    public C0122p(Executor executor, InterfaceC0111e interfaceC0111e) {
        this.f1757k = executor;
        this.f1758l = interfaceC0111e;
    }

    @Override // D6.InterfaceC0111e
    public final void cancel() {
        this.f1758l.cancel();
    }

    @Override // D6.InterfaceC0111e
    public final C0890D j() {
        return this.f1758l.j();
    }

    @Override // D6.InterfaceC0111e
    public final void m(InterfaceC0114h interfaceC0114h) {
        this.f1758l.m(new F.w(this, interfaceC0114h, 10));
    }

    @Override // D6.InterfaceC0111e
    public final boolean s() {
        return this.f1758l.s();
    }

    @Override // D6.InterfaceC0111e
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0111e m1clone() {
        return new C0122p(this.f1757k, this.f1758l.m1clone());
    }
}
