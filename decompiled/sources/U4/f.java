package U4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends AbstractC0613j implements w {

    /* renamed from: l, reason: collision with root package name */
    public int f9264l;

    /* renamed from: m, reason: collision with root package name */
    public int f9265m;

    /* renamed from: n, reason: collision with root package name */
    public int f9266n;

    /* renamed from: o, reason: collision with root package name */
    public Object f9267o;

    /* renamed from: p, reason: collision with root package name */
    public g f9268p;

    /* renamed from: q, reason: collision with root package name */
    public List f9269q;

    /* renamed from: r, reason: collision with root package name */
    public List f9270r;

    public static f g() {
        f fVar = new f();
        fVar.f9265m = 1;
        fVar.f9267o = "";
        fVar.f9268p = g.NONE;
        List list = Collections.EMPTY_LIST;
        fVar.f9269q = list;
        fVar.f9270r = list;
        return fVar;
    }

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        h hVarF = f();
        hVarF.a();
        return hVarF;
    }

    public final Object clone() {
        f fVarG = g();
        fVarG.h(f());
        return fVarG;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r2, X4.C0611h r3) throws java.lang.Throwable {
        /*
            r1 = this;
            r3 = 0
            R4.a r0 = U4.h.f9277x     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            U4.h r0 = new U4.h     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.h(r0)
            return r1
        Lf:
            r2 = move-exception
            goto L19
        L11:
            r2 = move-exception
            X4.b r0 = r2.f9907k     // Catch: java.lang.Throwable -> Lf
            U4.h r0 = (U4.h) r0     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> L17
        L17:
            r2 = move-exception
            r3 = r0
        L19:
            if (r3 == 0) goto L1e
            r1.h(r3)
        L1e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.f.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        h((h) abstractC0618o);
        return this;
    }

    public final h f() {
        h hVar = new h(this);
        int i7 = this.f9264l;
        int i8 = (i7 & 1) != 1 ? 0 : 1;
        hVar.f9280m = this.f9265m;
        if ((i7 & 2) == 2) {
            i8 |= 2;
        }
        hVar.f9281n = this.f9266n;
        if ((i7 & 4) == 4) {
            i8 |= 4;
        }
        hVar.f9282o = this.f9267o;
        if ((i7 & 8) == 8) {
            i8 |= 8;
        }
        hVar.f9283p = this.f9268p;
        if ((i7 & 16) == 16) {
            this.f9269q = Collections.unmodifiableList(this.f9269q);
            this.f9264l &= -17;
        }
        hVar.f9284q = this.f9269q;
        if ((this.f9264l & 32) == 32) {
            this.f9270r = Collections.unmodifiableList(this.f9270r);
            this.f9264l &= -33;
        }
        hVar.f9286s = this.f9270r;
        hVar.f9279l = i8;
        return hVar;
    }

    public final void h(h hVar) {
        if (hVar == h.f9276w) {
            return;
        }
        int i7 = hVar.f9279l;
        if ((i7 & 1) == 1) {
            int i8 = hVar.f9280m;
            this.f9264l = 1 | this.f9264l;
            this.f9265m = i8;
        }
        if ((i7 & 2) == 2) {
            int i9 = hVar.f9281n;
            this.f9264l = 2 | this.f9264l;
            this.f9266n = i9;
        }
        if ((i7 & 4) == 4) {
            this.f9264l |= 4;
            this.f9267o = hVar.f9282o;
        }
        if ((i7 & 8) == 8) {
            g gVar = hVar.f9283p;
            gVar.getClass();
            this.f9264l = 8 | this.f9264l;
            this.f9268p = gVar;
        }
        if (!hVar.f9284q.isEmpty()) {
            if (this.f9269q.isEmpty()) {
                this.f9269q = hVar.f9284q;
                this.f9264l &= -17;
            } else {
                if ((this.f9264l & 16) != 16) {
                    this.f9269q = new ArrayList(this.f9269q);
                    this.f9264l |= 16;
                }
                this.f9269q.addAll(hVar.f9284q);
            }
        }
        if (!hVar.f9286s.isEmpty()) {
            if (this.f9270r.isEmpty()) {
                this.f9270r = hVar.f9286s;
                this.f9264l &= -33;
            } else {
                if ((this.f9264l & 32) != 32) {
                    this.f9270r = new ArrayList(this.f9270r);
                    this.f9264l |= 32;
                }
                this.f9270r.addAll(hVar.f9286s);
            }
        }
        this.f9896k = this.f9896k.h(hVar.f9278k);
    }
}
