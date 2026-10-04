package z1;

import B1.AbstractC0015b;
import j3.X;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {
    public final X a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18956b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f18957c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    public boolean f18958d;

    public d(X x7) {
        this.a = x7;
        e eVar = e.f18959e;
        this.f18958d = false;
    }

    public final e a(e eVar) {
        if (eVar.equals(e.f18959e)) {
            throw new f(eVar);
        }
        int i7 = 0;
        while (true) {
            X x7 = this.a;
            if (i7 >= x7.f12306n) {
                return eVar;
            }
            g gVar = (g) x7.get(i7);
            e eVarF = gVar.f(eVar);
            if (gVar.b()) {
                AbstractC0015b.h(!eVarF.equals(e.f18959e));
                eVar = eVarF;
            }
            i7++;
        }
    }

    public final void b() {
        ArrayList arrayList = this.f18956b;
        arrayList.clear();
        this.f18958d = false;
        int i7 = 0;
        while (true) {
            X x7 = this.a;
            if (i7 >= x7.f12306n) {
                break;
            }
            g gVar = (g) x7.get(i7);
            gVar.flush();
            if (gVar.b()) {
                arrayList.add(gVar);
            }
            i7++;
        }
        this.f18957c = new ByteBuffer[arrayList.size()];
        for (int i8 = 0; i8 <= c(); i8++) {
            this.f18957c[i8] = ((g) arrayList.get(i8)).a();
        }
    }

    public final int c() {
        return this.f18957c.length - 1;
    }

    public final boolean d() {
        return this.f18958d && ((g) this.f18956b.get(c())).d() && !this.f18957c[c()].hasRemaining();
    }

    public final boolean e() {
        return !this.f18956b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            X x7 = this.a;
            if (x7.f12306n == dVar.a.f12306n) {
                for (int i7 = 0; i7 < x7.f12306n; i7++) {
                    if (x7.get(i7) == dVar.a.get(i7)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(ByteBuffer byteBuffer) {
        boolean z7;
        for (boolean z8 = true; z8; z8 = z7) {
            z7 = false;
            int i7 = 0;
            while (i7 <= c()) {
                if (!this.f18957c[i7].hasRemaining()) {
                    ArrayList arrayList = this.f18956b;
                    g gVar = (g) arrayList.get(i7);
                    if (!gVar.d()) {
                        ByteBuffer byteBuffer2 = i7 > 0 ? this.f18957c[i7 - 1] : byteBuffer.hasRemaining() ? byteBuffer : g.a;
                        long jRemaining = byteBuffer2.remaining();
                        gVar.e(byteBuffer2);
                        this.f18957c[i7] = gVar.a();
                        z7 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f18957c[i7].hasRemaining();
                    } else if (!this.f18957c[i7].hasRemaining() && i7 < c()) {
                        ((g) arrayList.get(i7 + 1)).c();
                    }
                }
                i7++;
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
