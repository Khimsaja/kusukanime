package h0;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987j implements InterfaceC0967L {
    public final Path a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f11823b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f11824c;

    public C0987j(Path path) {
        this.a = path;
    }

    public final g0.d c() {
        if (this.f11823b == null) {
            this.f11823b = new RectF();
        }
        RectF rectF = this.f11823b;
        kotlin.jvm.internal.l.c(rectF);
        this.a.computeBounds(rectF, true);
        return new g0.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(InterfaceC0967L interfaceC0967L, InterfaceC0967L interfaceC0967L2, int i7) {
        Path.Op op = i7 == 0 ? Path.Op.DIFFERENCE : i7 == 1 ? Path.Op.INTERSECT : i7 == 4 ? Path.Op.REVERSE_DIFFERENCE : i7 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(interfaceC0967L instanceof C0987j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = ((C0987j) interfaceC0967L).a;
        if (interfaceC0967L2 instanceof C0987j) {
            return this.a.op(path, ((C0987j) interfaceC0967L2).a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.a.reset();
    }
}
