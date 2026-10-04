package o5;

import D.x0;
import a5.C0669c;
import f6.AbstractC0905c;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l5.C1452e;
import n5.AbstractC1566c;
import n5.AbstractC1580q;
import n5.AbstractC1586x;
import n5.B;
import n5.C1585w;
import n5.M;
import n5.a0;
import n5.b0;
import u4.Q;

/* renamed from: o5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705e {
    public static final C1705e a = new C1705e();

    /* JADX WARN: Multi-variable type inference failed */
    public static B b(B b4) {
        AbstractC1586x abstractC1586xB;
        M mT0 = b4.t0();
        Q q6 = null;
        if (mT0 instanceof C0669c) {
            C0669c c0669c = (C0669c) mT0;
            n5.Q q7 = c0669c.a;
            if (q7.a() != b0.f13391n) {
                q7 = null;
            }
            a0 a0VarW0 = (q7 == null || (abstractC1586xB = q7.b()) == null) ? null : abstractC1586xB.w0();
            if (c0669c.f10450b == null) {
                Collection collectionG = c0669c.g();
                ArrayList arrayList = new ArrayList(P3.r.p(collectionG, 10));
                Iterator it = collectionG.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC1586x) it.next()).w0());
                }
                n5.Q q8 = c0669c.a;
                kotlin.jvm.internal.l.f("projection", q8);
                c0669c.f10450b = new C1709i(q8, new C1452e(1, arrayList), q6, 8);
            }
            q5.b bVar = q5.b.f14745k;
            C1709i c1709i = c0669c.f10450b;
            kotlin.jvm.internal.l.c(c1709i);
            return new C1708h(bVar, c1709i, a0VarW0, b4.s0(), b4.u0(), 32);
        }
        if (!(mT0 instanceof C1585w) || !b4.u0()) {
            return b4;
        }
        C1585w c1585w = (C1585w) mT0;
        LinkedHashSet linkedHashSet = c1585w.f13418b;
        ArrayList arrayList2 = new ArrayList(P3.r.p(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z7 = false;
        while (it2.hasNext()) {
            arrayList2.add(AbstractC0905c.v((AbstractC1586x) it2.next()));
            z7 = true;
        }
        if (z7) {
            AbstractC1586x abstractC1586x = c1585w.a;
            a0 a0VarV = abstractC1586x != null ? AbstractC0905c.v(abstractC1586x) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C1585w c1585w2 = new C1585w(linkedHashSet2);
            c1585w2.a = a0VarV;
            q6 = c1585w2;
        }
        if (q6 != null) {
            c1585w = q6;
        }
        return c1585w.b();
    }

    public final a0 a(q5.d dVar) {
        a0 a0VarF;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
        if (!(dVar instanceof AbstractC1586x)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        a0 a0VarW0 = ((AbstractC1586x) dVar).w0();
        if (a0VarW0 instanceof B) {
            a0VarF = b((B) a0VarW0);
        } else {
            if (!(a0VarW0 instanceof AbstractC1580q)) {
                throw new D6.r();
            }
            AbstractC1580q abstractC1580q = (AbstractC1580q) a0VarW0;
            B b4 = abstractC1580q.f13407l;
            B b7 = b(b4);
            B b8 = abstractC1580q.f13408m;
            B b9 = b(b8);
            a0VarF = (b7 == b4 && b9 == b8) ? a0VarW0 : AbstractC1566c.f(b7, b9);
        }
        x0 x0Var = new x0(1, this, C1705e.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0, 10);
        AbstractC1586x abstractC1586xG = AbstractC1566c.g(a0VarW0);
        return AbstractC1566c.H(a0VarF, abstractC1586xG != null ? (AbstractC1586x) x0Var.invoke(abstractC1586xG) : null);
    }
}
