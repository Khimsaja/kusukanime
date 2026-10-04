package w;

import O.C0486d;
import O.C0487d0;
import y.C2301A;

/* loaded from: classes.dex */
public final class n {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final C0487d0 f16771b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487d0 f16772c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16773d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16774e;

    /* renamed from: f, reason: collision with root package name */
    public final C2301A f16775f;

    public n(int i7, int i8, int i9) {
        this.a = i9;
        switch (i9) {
            case 1:
                this.f16771b = C0486d.J(i7);
                this.f16772c = C0486d.J(i8);
                this.f16775f = new C2301A(i7, 90, 200);
                break;
            default:
                this.f16771b = C0486d.J(i7);
                this.f16772c = C0486d.J(i8);
                this.f16775f = new C2301A(i7, 30, 100);
                break;
        }
    }

    public final void a(int i7, int i8) {
        switch (this.a) {
            case 0:
                if (i7 >= 0.0f) {
                    this.f16771b.g(i7);
                    this.f16775f.a(i7);
                    this.f16772c.g(i8);
                    return;
                } else {
                    throw new IllegalArgumentException(("Index should be non-negative (" + i7 + ')').toString());
                }
            default:
                if (i7 >= 0.0f) {
                    this.f16771b.g(i7);
                    this.f16775f.a(i7);
                    this.f16772c.g(i8);
                    return;
                } else {
                    throw new IllegalArgumentException(("Index should be non-negative (" + i7 + ')').toString());
                }
        }
    }
}
