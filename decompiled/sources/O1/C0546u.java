package O1;

import java.util.Objects;

/* renamed from: O1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0546u extends AbstractC0543q {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7494e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f7495c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7496d;

    public C0546u(y1.P p7, Object obj, Object obj2) {
        super(p7);
        this.f7495c = obj;
        this.f7496d = obj2;
    }

    @Override // O1.AbstractC0543q, y1.P
    public final int b(Object obj) {
        Object obj2;
        if (f7494e.equals(obj) && (obj2 = this.f7496d) != null) {
            obj = obj2;
        }
        return this.f7481b.b(obj);
    }

    @Override // O1.AbstractC0543q, y1.P
    public final y1.N f(int i7, y1.N n7, boolean z7) {
        this.f7481b.f(i7, n7, z7);
        if (Objects.equals(n7.f17947b, this.f7496d) && z7) {
            n7.f17947b = f7494e;
        }
        return n7;
    }

    @Override // O1.AbstractC0543q, y1.P
    public final Object l(int i7) {
        Object objL = this.f7481b.l(i7);
        return Objects.equals(objL, this.f7496d) ? f7494e : objL;
    }

    @Override // O1.AbstractC0543q, y1.P
    public final y1.O m(int i7, y1.O o7, long j7) {
        this.f7481b.m(i7, o7, j7);
        if (Objects.equals(o7.a, this.f7495c)) {
            o7.a = y1.O.f17953p;
        }
        return o7;
    }
}
