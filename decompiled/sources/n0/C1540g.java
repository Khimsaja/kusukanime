package n0;

import android.graphics.Path;
import f.AbstractC0841b;
import h0.AbstractC0968M;
import h0.C0975U;
import h0.C0987j;
import h0.C0988k;
import j0.InterfaceC1298d;

/* renamed from: n0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540g extends AbstractC1556w {

    /* renamed from: b, reason: collision with root package name */
    public C0975U f13167b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13168c;

    /* renamed from: d, reason: collision with root package name */
    public float f13169d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13170e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13171f;

    /* renamed from: g, reason: collision with root package name */
    public final C0987j f13172g;

    /* renamed from: h, reason: collision with root package name */
    public C0987j f13173h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f13174i;

    public C1540g() {
        int i7 = AbstractC1530A.a;
        this.f13168c = P3.y.f7779k;
        this.f13169d = 1.0f;
        this.f13170e = true;
        C0987j c0987jH = AbstractC0968M.h();
        this.f13172g = c0987jH;
        this.f13173h = c0987jH;
        this.f13174i = z1.c.B(O3.j.f7526l, C1539f.f13164m);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // n0.AbstractC1556w
    public final void a(InterfaceC1298d interfaceC1298d) {
        if (this.f13170e) {
            AbstractC0841b.q(this.f13168c, this.f13172g);
            e();
        } else if (this.f13171f) {
            e();
        }
        this.f13170e = false;
        this.f13171f = false;
        C0975U c0975u = this.f13167b;
        if (c0975u != null) {
            InterfaceC1298d.e0(interfaceC1298d, this.f13173h, c0975u, 1.0f, null, 56);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [O3.i, java.lang.Object] */
    public final void e() {
        Path path;
        float f5 = this.f13169d;
        C0987j c0987j = this.f13172g;
        if (f5 == 1.0f) {
            this.f13173h = c0987j;
            return;
        }
        if (kotlin.jvm.internal.l.a(this.f13173h, c0987j)) {
            this.f13173h = AbstractC0968M.h();
        } else {
            Path.FillType fillType = this.f13173h.a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z7 = fillType == fillType2;
            this.f13173h.a.rewind();
            C0987j c0987j2 = this.f13173h;
            c0987j2.getClass();
            if (!z7) {
                fillType2 = Path.FillType.WINDING;
            }
            c0987j2.a.setFillType(fillType2);
        }
        ?? r02 = this.f13174i;
        C0988k c0988k = (C0988k) r02.getValue();
        if (c0987j != null) {
            c0988k.getClass();
            path = c0987j.a;
        } else {
            path = null;
        }
        c0988k.a.setPath(path, false);
        float length = ((C0988k) r02.getValue()).a.getLength();
        float f7 = 0.0f * length;
        float f8 = ((this.f13169d + 0.0f) % 1.0f) * length;
        if (f7 <= f8) {
            ((C0988k) r02.getValue()).a(f7, f8, this.f13173h);
        } else {
            ((C0988k) r02.getValue()).a(f7, length, this.f13173h);
            ((C0988k) r02.getValue()).a(0.0f, f8, this.f13173h);
        }
    }

    public final String toString() {
        return this.f13172g.toString();
    }
}
