package p2;

import B1.K;
import H.N;
import android.media.AudioAttributes;
import android.os.Parcel;
import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m.C1492m;
import n5.AbstractC1586x;
import n5.P;
import s0.t;
import u4.EnumC2117x;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2112s;
import x4.C2295v;
import y1.C2381c;
import z0.C2471u;

/* loaded from: classes.dex */
public final class l implements u4.r, w5.a {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14298b;

    public /* synthetic */ l(int i7, Object obj) {
        this.a = i7;
        this.f14298b = obj;
    }

    @Override // u4.r
    public InterfaceC2112s build() {
        return (p5.c) this.f14298b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [u4.e] */
    @Override // w5.a
    public Iterable c(Object obj) {
        Collection collectionG = ((InterfaceC2099e) obj).v().g();
        kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            InterfaceC2102h interfaceC2102hF = ((AbstractC1586x) it.next()).t0().f();
            L4.i iVarF = null;
            InterfaceC2102h interfaceC2102hA = interfaceC2102hF != null ? interfaceC2102hF.a() : null;
            L4.i iVar = interfaceC2102hA instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hA : null;
            if (iVar != null && (iVarF = ((t4.o) this.f14298b).f(iVar)) == null) {
                iVarF = iVar;
            }
            if (iVarF != null) {
                arrayList.add(iVarF);
            }
        }
        return arrayList;
    }

    @Override // u4.r
    public u4.r d(InterfaceC2099e interfaceC2099e) {
        kotlin.jvm.internal.l.f("owner", interfaceC2099e);
        return this;
    }

    @Override // u4.r
    public u4.r e(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        return this;
    }

    @Override // u4.r
    public u4.r h(H4.o oVar) {
        kotlin.jvm.internal.l.f("visibility", oVar);
        return this;
    }

    @Override // u4.r
    public u4.r i(int i7) {
        AbstractC0703b.w(i7, "kind");
        return this;
    }

    @Override // u4.r
    public u4.r k(v4.h hVar) {
        kotlin.jvm.internal.l.f("additionalAnnotations", hVar);
        return this;
    }

    @Override // u4.r
    public u4.r p(W4.e eVar) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        return this;
    }

    public void r(int i7, boolean z7) {
        E3.b bVar = (E3.b) this.f14298b;
        if (z7) {
            bVar.a(i7);
        } else {
            bVar.getClass();
        }
    }

    public void s(byte b4) {
        ((Parcel) this.f14298b).writeByte(b4);
    }

    public void t(float f5) {
        ((Parcel) this.f14298b).writeFloat(f5);
    }

    public void u(long j7) {
        long jB = T0.m.b(j7);
        byte b4 = 0;
        if (!T0.n.a(jB, 0L)) {
            if (T0.n.a(jB, 4294967296L)) {
                b4 = 1;
            } else if (T0.n.a(jB, 8589934592L)) {
                b4 = 2;
            }
        }
        s(b4);
        if (T0.n.a(T0.m.b(j7), 0L)) {
            return;
        }
        t(T0.m.c(j7));
    }

    public N v(P p7, C2471u c2471u) {
        long jB;
        boolean z7;
        long j7;
        ArrayList arrayList = (ArrayList) p7.f13378l;
        C1492m c1492m = new C1492m(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            t tVar = (t) arrayList.get(i7);
            long j8 = tVar.a;
            C1492m c1492m2 = (C1492m) this.f14298b;
            s0.s sVar = (s0.s) c1492m2.b(j8);
            if (sVar == null) {
                long j9 = tVar.f15483b;
                jB = tVar.f15485d;
                j7 = j9;
                z7 = false;
            } else {
                jB = c2471u.B(sVar.f15481b);
                long j10 = sVar.a;
                z7 = sVar.f15482c;
                j7 = j10;
            }
            long j11 = jB;
            ArrayList arrayList2 = tVar.f15490i;
            long j12 = tVar.f15491j;
            long j13 = tVar.f15492k;
            int i8 = i7;
            long j14 = tVar.a;
            ArrayList arrayList3 = arrayList;
            int i9 = size;
            c1492m.d(j14, new s0.r(j14, tVar.f15483b, tVar.f15485d, tVar.f15486e, tVar.f15487f, j7, j11, z7, tVar.f15488g, arrayList2, j12, j13));
            long j15 = tVar.a;
            boolean z8 = tVar.f15486e;
            if (z8) {
                c1492m2.d(j15, new s0.s(tVar.f15483b, tVar.f15484c, z8));
            } else {
                c1492m2.e(j15);
            }
            i7 = i8 + 1;
            arrayList = arrayList3;
            size = i9;
        }
        return new N(c1492m, p7);
    }

    public l(C2381c c2381c) {
        this.a = 9;
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        c2381c.getClass();
        AudioAttributes.Builder usage = builder.setContentType(0).setFlags(0).setUsage(1);
        int i7 = K.a;
        if (i7 >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (i7 >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.f14298b = usage.build();
    }

    public l(int i7) {
        this.a = i7;
        switch (i7) {
            case 7:
                this.f14298b = new HashSet();
                break;
            case 10:
                this.f14298b = new E3.b();
                break;
            case 12:
                break;
            default:
                this.f14298b = new C1492m((Object) null);
                break;
        }
    }

    public l(UUID uuid, int i7, byte[] bArr, UUID[] uuidArr) {
        this.a = 0;
        this.f14298b = uuid;
    }

    @Override // u4.r
    public u4.r a() {
        return this;
    }

    @Override // u4.r
    public u4.r f() {
        return this;
    }

    @Override // u4.r
    public u4.r g() {
        return this;
    }

    @Override // u4.r
    public u4.r l() {
        return this;
    }

    @Override // u4.r
    public u4.r n() {
        return this;
    }

    @Override // u4.r
    public u4.r o() {
        return this;
    }

    @Override // u4.r
    public u4.r q() {
        return this;
    }

    @Override // u4.r
    public u4.r b(List list) {
        return this;
    }

    @Override // u4.r
    public u4.r j(EnumC2117x enumC2117x) {
        return this;
    }

    @Override // u4.r
    public u4.r m(C2295v c2295v) {
        return this;
    }
}
