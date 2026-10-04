package K;

import P3.F;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import h0.AbstractC0982e;
import h0.InterfaceC0995r;
import java.util.LinkedHashMap;
import y0.AbstractC2359f;
import y0.C2351F;

/* renamed from: K.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293b extends w implements s {

    /* renamed from: H, reason: collision with root package name */
    public r f4370H;
    public t I;

    @Override // K.w
    public final void G0(u.m mVar, long j7, float f5) {
        r rVarA = this.f4370H;
        if (rVarA == null) {
            rVarA = A.a(A.b((View) AbstractC2359f.i(this, AndroidCompositionLocals_androidKt.f10673f)));
            this.f4370H = rVarA;
            kotlin.jvm.internal.l.c(rVarA);
        }
        t tVarA = rVarA.a(this);
        int iW = F.W(f5);
        long jA = this.f4426A.a();
        this.f4427B.invoke();
        tVarA.b(mVar, this.f4434y, j7, iW, jA, 0.1f, new B.e(10, this));
        this.I = tVarA;
        AbstractC2359f.n(this);
    }

    @Override // K.w
    public final void H0(C2351F c2351f) {
        InterfaceC0995r interfaceC0995rT = c2351f.f17696k.f12205l.t();
        t tVar = this.I;
        if (tVar != null) {
            long j7 = this.f4430E;
            long jA = this.f4426A.a();
            this.f4427B.invoke();
            tVar.e(0.1f, j7, jA);
            tVar.draw(AbstractC0982e.a(interfaceC0995rT));
        }
    }

    @Override // K.w
    public final void J0(u.m mVar) {
        t tVar = this.I;
        if (tVar != null) {
            tVar.d();
        }
    }

    @Override // K.s
    public final void i0() {
        this.I = null;
        AbstractC2359f.n(this);
    }

    @Override // a0.p
    public final void z0() {
        r rVar = this.f4370H;
        if (rVar != null) {
            i0();
            F.w wVar = rVar.f4414n;
            t tVar = (t) ((LinkedHashMap) wVar.f2037l).get(this);
            if (tVar != null) {
                tVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) wVar.f2037l;
                t tVar2 = (t) linkedHashMap.get(this);
                if (tVar2 != null) {
                }
                linkedHashMap.remove(this);
                rVar.f4413m.add(tVar);
            }
        }
    }
}
