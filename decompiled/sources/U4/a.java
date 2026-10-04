package U4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.w;

/* loaded from: classes.dex */
public final class a extends AbstractC0613j implements w {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f9230l;

    /* renamed from: m, reason: collision with root package name */
    public int f9231m;

    /* renamed from: n, reason: collision with root package name */
    public int f9232n;

    /* renamed from: o, reason: collision with root package name */
    public int f9233o;

    public /* synthetic */ a(int i7) {
        this.f9230l = i7;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        switch (this.f9230l) {
            case 0:
                b bVarF = f();
                bVarF.a();
                return bVarF;
            default:
                c cVarG = g();
                cVarG.a();
                return cVarG;
        }
    }

    public final Object clone() {
        switch (this.f9230l) {
            case 0:
                a aVar = new a(0);
                aVar.h(f());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.i(g());
                return aVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r2, X4.C0611h r3) throws java.lang.Throwable {
        /*
            r1 = this;
            int r3 = r1.f9230l
            switch(r3) {
                case 0: goto L24;
                default: goto L5;
            }
        L5:
            r3 = 0
            R4.a r0 = U4.c.f9243r     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            U4.c r0 = new U4.c     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L14 X4.r -> L16
            r1.i(r0)
            return r1
        L14:
            r2 = move-exception
            goto L1e
        L16:
            r2 = move-exception
            X4.b r0 = r2.f9907k     // Catch: java.lang.Throwable -> L14
            U4.c r0 = (U4.c) r0     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L1c
        L1c:
            r2 = move-exception
            r3 = r0
        L1e:
            if (r3 == 0) goto L23
            r1.i(r3)
        L23:
            throw r2
        L24:
            r3 = 0
            R4.a r0 = U4.b.f9235r     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            U4.b r0 = new U4.b     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L33 X4.r -> L35
            r1.h(r0)
            return r1
        L33:
            r2 = move-exception
            goto L3d
        L35:
            r2 = move-exception
            X4.b r0 = r2.f9907k     // Catch: java.lang.Throwable -> L33
            U4.b r0 = (U4.b) r0     // Catch: java.lang.Throwable -> L33
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r2 = move-exception
            r3 = r0
        L3d:
            if (r3 == 0) goto L42
            r1.h(r3)
        L42:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.a.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        switch (this.f9230l) {
            case 0:
                h((b) abstractC0618o);
                break;
            default:
                i((c) abstractC0618o);
                break;
        }
        return this;
    }

    public b f() {
        b bVar = new b(this);
        int i7 = this.f9231m;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        bVar.f9238m = this.f9232n;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        bVar.f9239n = this.f9233o;
        bVar.f9237l = i8;
        return bVar;
    }

    public c g() {
        c cVar = new c(this);
        int i7 = this.f9231m;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        cVar.f9246m = this.f9232n;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        cVar.f9247n = this.f9233o;
        cVar.f9245l = i8;
        return cVar;
    }

    public void h(b bVar) {
        if (bVar == b.f9234q) {
            return;
        }
        int i7 = bVar.f9237l;
        if ((i7 & 1) == 1) {
            int i8 = bVar.f9238m;
            this.f9231m = 1 | this.f9231m;
            this.f9232n = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = bVar.f9239n;
            this.f9231m = 2 | this.f9231m;
            this.f9233o = i9;
        }
        this.f9896k = this.f9896k.h(bVar.f9236k);
    }

    public void i(c cVar) {
        if (cVar == c.f9242q) {
            return;
        }
        int i7 = cVar.f9245l;
        if ((i7 & 1) == 1) {
            int i8 = cVar.f9246m;
            this.f9231m = 1 | this.f9231m;
            this.f9232n = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = cVar.f9247n;
            this.f9231m = 2 | this.f9231m;
            this.f9233o = i9;
        }
        this.f9896k = this.f9896k.h(cVar.f9244k);
    }
}
