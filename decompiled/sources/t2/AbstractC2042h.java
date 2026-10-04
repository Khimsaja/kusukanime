package t2;

import B1.AbstractC0015b;
import B1.K;
import C2.G;
import T4.i;
import java.util.ArrayDeque;
import s2.C1975c;
import s2.InterfaceC1977e;

/* renamed from: t2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2042h implements InterfaceC1977e {
    public final ArrayDeque a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f15966b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f15967c;

    /* renamed from: d, reason: collision with root package name */
    public C2041g f15968d;

    /* renamed from: e, reason: collision with root package name */
    public long f15969e;

    /* renamed from: f, reason: collision with root package name */
    public long f15970f;

    /* renamed from: g, reason: collision with root package name */
    public long f15971g;

    public AbstractC2042h() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.a.add(new C2041g(1));
        }
        this.f15966b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            ArrayDeque arrayDeque = this.f15966b;
            G g4 = new G(18, this);
            C1975c c1975c = new C1975c();
            c1975c.f15517r = g4;
            arrayDeque.add(c1975c);
        }
        this.f15967c = new ArrayDeque();
        this.f15971g = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // G1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(s2.C1979g r7) {
        /*
            r6 = this;
            t2.g r0 = r6.f15968d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            B1.AbstractC0015b.c(r0)
            t2.g r7 = (t2.C2041g) r7
            r0 = 4
            boolean r0 = r7.c(r0)
            if (r0 != 0) goto L33
            long r0 = r7.f2611q
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L33
            long r2 = r6.f15971g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L33
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L33
            r7.f()
            java.util.ArrayDeque r0 = r6.a
            r0.add(r7)
            goto L41
        L33:
            long r0 = r6.f15970f
            r2 = 1
            long r2 = r2 + r0
            r6.f15970f = r2
            r7.f15965u = r0
            java.util.ArrayDeque r0 = r6.f15967c
            r0.add(r7)
        L41:
            r7 = 0
            r6.f15968d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.AbstractC2042h.b(s2.g):void");
    }

    @Override // G1.c
    public final void c(long j7) {
        this.f15971g = j7;
    }

    @Override // s2.InterfaceC1977e
    public final void d(long j7) {
        this.f15969e = j7;
    }

    @Override // G1.c
    public final Object f() {
        AbstractC0015b.h(this.f15968d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C2041g c2041g = (C2041g) arrayDeque.pollFirst();
        this.f15968d = c2041g;
        return c2041g;
    }

    @Override // G1.c
    public void flush() {
        ArrayDeque arrayDeque;
        this.f15970f = 0L;
        this.f15969e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f15967c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            C2041g c2041g = (C2041g) arrayDeque2.poll();
            int i7 = K.a;
            c2041g.f();
            arrayDeque.add(c2041g);
        }
        C2041g c2041g2 = this.f15968d;
        if (c2041g2 != null) {
            c2041g2.f();
            arrayDeque.add(c2041g2);
            this.f15968d = null;
        }
    }

    public abstract i g();

    public abstract void h(C2041g c2041g);

    @Override // G1.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1975c e() {
        ArrayDeque arrayDeque = this.f15966b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f15967c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C2041g c2041g = (C2041g) arrayDeque2.peek();
            int i7 = K.a;
            if (c2041g.f2611q > this.f15969e) {
                return null;
            }
            C2041g c2041g2 = (C2041g) arrayDeque2.poll();
            boolean zC = c2041g2.c(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zC) {
                C1975c c1975c = (C1975c) arrayDeque.pollFirst();
                c1975c.a(4);
                c2041g2.f();
                arrayDeque3.add(c2041g2);
                return c1975c;
            }
            h(c2041g2);
            if (j()) {
                i iVarG = g();
                C1975c c1975c2 = (C1975c) arrayDeque.pollFirst();
                long j7 = c2041g2.f2611q;
                c1975c2.f2614m = j7;
                c1975c2.f15514o = iVarG;
                c1975c2.f15515p = j7;
                c2041g2.f();
                arrayDeque3.add(c2041g2);
                return c1975c2;
            }
            c2041g2.f();
            arrayDeque3.add(c2041g2);
        }
    }

    public abstract boolean j();

    @Override // G1.c
    public void a() {
    }
}
