package U4;

import X4.AbstractC0605b;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends AbstractC0613j implements w {

    /* renamed from: l, reason: collision with root package name */
    public int f9261l;

    /* renamed from: m, reason: collision with root package name */
    public List f9262m;

    /* renamed from: n, reason: collision with root package name */
    public List f9263n;

    @Override // X4.AbstractC0613j
    public final AbstractC0605b c() {
        i iVarF = f();
        iVarF.a();
        return iVarF;
    }

    public final Object clone() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.f9262m = list;
        eVar.f9263n = list;
        eVar.g(f());
        return eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // X4.AbstractC0613j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X4.AbstractC0613j d(X4.C0609f r3, X4.C0611h r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            R4.a r1 = U4.i.f9291r     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            U4.i r1 = new U4.i     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf X4.r -> L11
            r2.g(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            X4.b r4 = r3.f9907k     // Catch: java.lang.Throwable -> Lf
            U4.i r4 = (U4.i) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.g(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.e.d(X4.f, X4.h):X4.j");
    }

    @Override // X4.AbstractC0613j
    public final /* bridge */ /* synthetic */ AbstractC0613j e(AbstractC0618o abstractC0618o) {
        g((i) abstractC0618o);
        return this;
    }

    public final i f() {
        i iVar = new i(this);
        if ((this.f9261l & 1) == 1) {
            this.f9262m = Collections.unmodifiableList(this.f9262m);
            this.f9261l &= -2;
        }
        iVar.f9293l = this.f9262m;
        if ((this.f9261l & 2) == 2) {
            this.f9263n = Collections.unmodifiableList(this.f9263n);
            this.f9261l &= -3;
        }
        iVar.f9294m = this.f9263n;
        return iVar;
    }

    public final void g(i iVar) {
        if (iVar == i.f9290q) {
            return;
        }
        if (!iVar.f9293l.isEmpty()) {
            if (this.f9262m.isEmpty()) {
                this.f9262m = iVar.f9293l;
                this.f9261l &= -2;
            } else {
                if ((this.f9261l & 1) != 1) {
                    this.f9262m = new ArrayList(this.f9262m);
                    this.f9261l |= 1;
                }
                this.f9262m.addAll(iVar.f9293l);
            }
        }
        if (!iVar.f9294m.isEmpty()) {
            if (this.f9263n.isEmpty()) {
                this.f9263n = iVar.f9294m;
                this.f9261l &= -3;
            } else {
                if ((this.f9261l & 2) != 2) {
                    this.f9263n = new ArrayList(this.f9263n);
                    this.f9261l |= 2;
                }
                this.f9263n.addAll(iVar.f9294m);
            }
        }
        this.f9896k = this.f9896k.h(iVar.f9292k);
    }
}
